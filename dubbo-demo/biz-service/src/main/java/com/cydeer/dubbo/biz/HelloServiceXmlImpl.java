package com.cydeer.dubbo.biz;

import com.cydeer.dubbo.common.facade.HelloService;
import com.cydeer.dubbo.common.model.HelloInput;
import com.cydeer.dubbo.common.model.HelloResult;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:41
 *
 */
public class HelloServiceXmlImpl implements HelloService {


    public HelloResult hello(HelloInput helloInput) {
        System.out.println("xml params:" + helloInput.getName());
        return new HelloResult().setName(helloInput.getName()).setTags(
                new ArrayList<String>(Arrays.asList(helloInput.getName(), "xmlTag")));
    }
}
