package com.springworkshop.handson.sessiontwo.intro.exercisetwo;

import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/15/2019.
 */
@Component
public class SportPlayer implements Player{

    public void play() {
        System.out.println("Playing any kind of sports..");
    }

}
