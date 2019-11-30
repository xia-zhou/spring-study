package com.cydeer.dubbo.consumer.api;

import com.cydeer.dubbo.common.facade.HelloServiceApi;
import com.cydeer.dubbo.common.model.HelloInput;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.io.IOException;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 18:12
 *
 */
public class ApiClient {

    public static void main(String[] args) throws IOException {
        ReferenceConfig<HelloServiceApi> referenceConfig = new ReferenceConfig<HelloServiceApi>();
        referenceConfig.setApplication(new ApplicationConfig("api-consumer-demo"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://localhost:22181"));
        referenceConfig.setInterface(HelloServiceApi.class);
        HelloServiceApi helloServiceApi = referenceConfig.get();
        System.out.println(helloServiceApi.hello(new HelloInput().setName("zhangsong-api")));
        System.in.read();
    }
}
