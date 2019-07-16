package com.springworkshop.handson.sessionone.intro.exercisefive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by e068635 on 7/15/2019.
 */
public class AppMobile {

    public static void main(String [] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
