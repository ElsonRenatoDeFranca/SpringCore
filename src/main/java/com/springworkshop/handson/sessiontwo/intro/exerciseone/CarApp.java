package com.springworkshop.handson.sessiontwo.intro.exerciseone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/16/2019.
 */
@Component
public class CarApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CarConfig.class);
        ctx.refresh();
        Car car = ctx.getBean(Car.class);
        System.out.println("Engine type:"+ car.getEngine().getType());
        ctx.close();
    }
}
