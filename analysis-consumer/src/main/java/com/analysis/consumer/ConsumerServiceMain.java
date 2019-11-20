package com.analysis.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

/**
  * @author: tianyong
  * @date: 2019/11/18
  * @description:dubbo ConsumerServiceMain启动类
*/
public class ConsumerServiceMain {

    private static final Log log = LogFactory.getLog(ConsumerServiceMain.class);

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
            context.start();
            log.info("ConsumerServiceMain success started");
        } catch (Exception e) {
            log.error("ConsumerServiceMain start error:", e);
        }


        synchronized (ConsumerServiceMain.class) {
            while (true) {
                try {
                    log.info("ConsumerServiceMain context started");
                    ConsumerServiceMain.class.wait();
                } catch (InterruptedException e) {
                    log.error("ConsumerServiceMain context error:", e);
                }finally {
                    log.info(new Date() + " ConsumerServiceMain exit! ");
                }
            }
        }
    }

}
