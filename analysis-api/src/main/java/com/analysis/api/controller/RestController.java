package com.analysis.api.controller;

import com.analysis.consumer.service.ConsumerService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: tianyong
 * @date: 2019/11/18 17:07
 * @desciption:rest_api接口
 */
@Controller
@RequestMapping("/api")
public class RestController {

    @Autowired
    private ConsumerService consumerService;


    /**
      * @author: tianyong
      * @date: 2019/11/18
      * @description:rest_api接口
    */
    @ResponseBody
    @RequestMapping("/rest")
    public void restApi(){
        consumerService.invokeService();
    }


}
