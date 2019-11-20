package com.analysis.provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

/**
  * @author: tianyong
  * @date: 2019/11/18
  * @description:dubbo ProviderServiceMain启动类
*/
public class ProviderServiceMain {

    private static final Log log = LogFactory.getLog(ProviderServiceMain.class);

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
            context.start();
            log.info("ProviderServiceMain success started");
        } catch (Exception e) {
            log.error("ProviderServiceMain start error:", e);
        }


        synchronized (ProviderServiceMain.class) {
            while (true) {
                try {
                    log.info("ProviderServiceMain context started");
                    ProviderServiceMain.class.wait();
                } catch (InterruptedException e) {
                    log.error("ProviderServiceMain context error:", e);
                }finally {
                    log.info(new Date() + " ProviderServiceMain exit! ");
                }
            }
        }
    }


}
