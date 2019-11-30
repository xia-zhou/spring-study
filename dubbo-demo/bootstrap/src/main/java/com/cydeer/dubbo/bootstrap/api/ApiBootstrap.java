package com.cydeer.dubbo.bootstrap.api;

import com.cydeer.dubbo.biz.api.HelloServiceApiImpl;
import com.cydeer.dubbo.common.facade.HelloServiceApi;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 17:54
 *
 */
public class ApiBootstrap {
    public static void main(String[] args) throws IOException {
        ServiceConfig<HelloServiceApi> serviceConfig = new ServiceConfig<HelloServiceApi>();
        serviceConfig.setApplication(new ApplicationConfig("api-provider-demo"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://localhost:22181"));
        serviceConfig.setProtocol(new ProtocolConfig("dubbo", 20090));
        serviceConfig.setInterface(HelloServiceApi.class);
        serviceConfig.setRef(new HelloServiceApiImpl());
        serviceConfig.export();
        System.out.println("api context start");
        System.in.read();
    }
}
