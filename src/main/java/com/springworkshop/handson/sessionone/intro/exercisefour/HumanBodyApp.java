package com.springworkshop.handson.sessionone.intro.exercisefour;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by e068635 on 7/11/2019.
 */
public class HumanBodyApp {

    public static void main(String [] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(HumanBodyConfig.class);
        ctx.refresh();
        HumanBody humanBody = ctx.getBean(HumanBody.class);
        System.out.println(humanBody.getBrain());
        ctx.close();

    }
}
