package com.cydeer.dubbo.consumer.annotation;

import com.cydeer.dubbo.common.facade.HelloServiceAanotation;
import com.cydeer.dubbo.common.model.HelloInput;
import com.cydeer.dubbo.common.model.HelloResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 19:47
 *
 */
@Component
public class HelloServiceAnnotationProxy {

    @Reference
    private HelloServiceAanotation helloServiceAanotation;

    public HelloResult hello(HelloInput helloInput) {
        return helloServiceAanotation.hello(helloInput);
    }
}
