package com.springworkshop.handson.sessionone.intro.exercisefour;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/16/2019.
 */
@Component
public class HumanBody {

    @Autowired
    private Brain brain;

    public HumanBody(Brain brain) {
        this.brain = brain;
    }

    public HumanBody(){}

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
}
