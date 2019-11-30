package com.cydeer.dubbo.consumer.annotation;

import com.cydeer.dubbo.common.facade.HelloServiceAanotation;
import com.cydeer.dubbo.common.model.HelloInput;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/29 23:21
 *
 */
@Configuration
@ComponentScan(basePackages = "com.cydeer.dubbo.consumer.annotation")
@EnableDubbo(scanBasePackageClasses = HelloServiceAanotation.class)
public class AnnotationClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationClient.class);

        HelloServiceAnnotationProxy helloAnnotationServiceProxy = applicationContext.getBean(
                HelloServiceAnnotationProxy.class);

        System.out.println(helloAnnotationServiceProxy.hello(new HelloInput().setName("annotation-zhangsong")));
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("annotation-consumer-demo");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:22181");
        return registryConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        return new ConsumerConfig();
    }

}
