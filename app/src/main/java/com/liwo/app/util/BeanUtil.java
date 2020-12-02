package com.liwo.app.util;

import com.liwo.app.core.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenhuan on 15-4-30.
 */
public class BeanUtil {
	private static final Logger log = LoggerFactory.getLogger(BeanUtil.class);
    /**
     * 转换时对map中的key里的字符串会做忽略处理的正则串
     */
    private static final String OMIT_REG = "_";

    /**
     * 将map转换成Bean，Bean的属性名与map的key值对应时不区分大小写，并对map中key做忽略OMIT_REG正则处理
     *
     * @param <E>
     * @param cla
     * @param map
     * @return
     */
    @SuppressWarnings({ "rawtypes" })
    public static <E> E toBean(Class<E> cla, Map<String, String> map) {
        // 创建对象
        E obj = null;
        try {
            obj = cla.newInstance();
            if (obj == null) {
                throw new Exception();
            }
        } catch (Exception e) {
            log.error("类型实例化对象失败,类型:",cla);
            return null;
        }

        // 处理map的key
        Map<String, Object> newmap = new HashMap<String, Object>();
        for (Map.Entry<String, String> en : map.entrySet()) {
            newmap.put(
                    "set"
                            + en.getKey().trim().replaceAll(OMIT_REG, "")
                            .toLowerCase(), en.getValue());
        }

        // 进行值装入
        Method[] ms = cla.getMethods();
        for (Method method : ms) {
            String mname = method.getName().toLowerCase();
            if (mname.startsWith("set")) {

                Class[] clas = method.getParameterTypes();
                Object v = newmap.get(mname);

                if (v != null && clas.length == 1) {
                    try {
                    	//如果传的传是Integer类型则将String强转Integer
                    	if("java.lang.Integer".equals(clas[0].getName())){
                    		v = Integer.parseInt(v.toString());
                    	}
                        method.invoke(obj, v);
                    } catch (Exception e) {
                        log.error("属性值装入失败,装入方法：" + cla + "."
                                + method.getName() + ".可装入类型" + clas[0]
                                + ";欲装入值的类型:" + v.getClass());
                    }
                }
            }
        }

        return obj;
    }

    public static String getAnnotation(Class cls,String annotation,String fieldName)throws Exception{
        Field field = cls.getDeclaredField(fieldName);
        RequestParam requestParam = field.getAnnotation(RequestParam.class);
        return requestParam==null?"":requestParam.value();
    }
}
