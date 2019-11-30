package com.cydeer.dubbo.bootstrap.annotation;

import com.cydeer.dubbo.biz.annotation.HelloServiceAnnotationImpl;
import com.cydeer.dubbo.common.facade.HelloService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/29 22:46
 *
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.cydeer.dubbo.biz.annotation")
public class AnnotationBootstrap {


    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBootstrap.class);
        System.out.println("annotation context start");
        System.in.read();
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:22181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20089);
        protocolConfig.setName("dubbo");
        return protocolConfig;
    }

    @Bean
    public HelloService helloService() {
        return new HelloServiceAnnotationImpl();
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        return providerConfig;
    }

}
