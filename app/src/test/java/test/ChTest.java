package test;

import com.liwo.app.pro.req.ConsumableReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Created by chenhuan on 15-9-13.
 */
public class ChTest {
        public static void main(String[] args)throws Exception{
            BeanInfo beanInfo = Introspector.getBeanInfo(ConsumableReq.class);
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor pd:pds){
                System.out.println(pd.getName());
            }
        }
}
