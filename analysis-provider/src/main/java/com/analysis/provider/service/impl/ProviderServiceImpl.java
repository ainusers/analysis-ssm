package com.analysis.provider.service.impl;

import com.analysis.provider.service.ProviderService;
import org.springframework.stereotype.Service;


/**
 * @author: tianyong
 * @date: 2019/11/15 18:09
 * @desciption:服务提供者
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    public void provider(){
        System.out.println("服务提供者方法，被调用ing.....");
    }

}
