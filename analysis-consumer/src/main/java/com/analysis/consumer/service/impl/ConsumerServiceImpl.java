package com.analysis.consumer.service.impl;

import com.analysis.consumer.service.ConsumerService;
import com.analysis.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author: tianyong
 * @date: 2019/11/18 16:25
 * @desciption:接口消费者实操
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {


    @Autowired
    private ProviderService providerService;


    /**
      * @author: tianyong
      * @date: 2019/11/18
      * @description:接口消费者实操
    */
    @Override
    public void invokeService() {
        providerService.provider();
    }


}
