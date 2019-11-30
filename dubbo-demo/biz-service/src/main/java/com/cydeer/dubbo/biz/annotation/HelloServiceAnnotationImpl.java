package com.cydeer.dubbo.biz.annotation;

import com.cydeer.dubbo.common.facade.HelloServiceAanotation;
import com.cydeer.dubbo.common.model.HelloInput;
import com.cydeer.dubbo.common.model.HelloResult;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:48
 *
 */
@Service
public class HelloServiceAnnotationImpl implements HelloServiceAanotation {

    public HelloResult hello(HelloInput helloInput) {
        System.out.println("annotation params:" + helloInput.getName());
        return new HelloResult().setName(helloInput.getName()).setTags(
                new ArrayList<String>(Arrays.asList(helloInput.getName(), "annotationTag")));
    }
}
