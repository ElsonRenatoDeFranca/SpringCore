package com.springworkshop.handson.sessiontwo.intro.exerciseone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/16/2019.
 */
@Component
public class Engine {

    @Value("Turbo")
    private String type;

    public Engine() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
