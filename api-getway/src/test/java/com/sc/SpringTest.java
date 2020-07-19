package com.sc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by loveoh on 2020/6/26.
 */
public class SpringTest {

    public void springTest(){

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(""));
        beanFactory.getBean("");
    }
}
