package com.cydeer.dubbo.bootstrap.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 13:14
 *
 */
public class XmlBootstrap {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-provider.xml");
        System.out.println("xml context start");
        System.in.read();
    }
}
