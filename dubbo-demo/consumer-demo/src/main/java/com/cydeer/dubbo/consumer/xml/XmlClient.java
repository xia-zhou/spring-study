package com.cydeer.dubbo.consumer.xml;

import com.cydeer.dubbo.common.facade.HelloService;
import com.cydeer.dubbo.common.model.HelloInput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 18:30
 *
 */
public class XmlClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-consumer.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        System.out.println(helloService.hello(new HelloInput().setName("xml-zhangsong")));
    }
}
