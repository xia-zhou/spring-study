package com.cydeer.dubbo.biz.api;

import com.cydeer.dubbo.common.facade.HelloServiceApi;
import com.cydeer.dubbo.common.model.HelloInput;
import com.cydeer.dubbo.common.model.HelloResult;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @Author: zhang.song
 * @Date: 2019/11/30 12:41
 *
 */
public class HelloServiceApiImpl implements HelloServiceApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceApiImpl.class);

    public HelloResult hello(HelloInput helloInput) {
        System.out.println("api params:" + helloInput.getName());
        return new HelloResult().setName(helloInput.getName()).setTags(
                new ArrayList<String>(Arrays.asList(helloInput.getName(), "apiTag")));
    }
}
