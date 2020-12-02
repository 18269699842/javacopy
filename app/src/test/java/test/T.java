package test;

import com.liwo.app.core.RequestParam;
import com.liwo.app.pro.req.ConsumableDetailReq;
import com.liwo.app.util.DateUtil;
import com.liwo.app.util.JSONUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.BeanUtils;


import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by Administrator on 15-9-13.
 */
public class T {
    public static void main(String[] args) throws Exception {
        ConsumableDetailReq req = new ConsumableDetailReq();

        //PropertyUtils.setSimpleProperty(req, "cid", "1");

        //PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(req.getClass());

        //PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(req.getClass());

        Class cls = req.getClass();
        Method[] methods = cls.getMethods();
        for(Method method:methods){
            System.out.println( method.getName());
        }

//        Class cls = req.getClass();
//
//        Field field = cls.getDeclaredField("cid");
//        RequestParam RequestParam = field.getAnnotation(RequestParam.class);
        //System.out.println( RequestParam);



        //System.out.println(JSONUtils.toJSON(req));
    }
}
