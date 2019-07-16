package com.springworkshop.handson.sessiontwo.intro.exerciseone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/16/2019.
 */

/**
 * First way of injection a dependency: Put the @Autowired annotation at setter
 */
@Component
public class Car {

    //@Autowired
    private Engine engine;

    //@Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(){}

    public Engine getEngine() {
        return engine;
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
