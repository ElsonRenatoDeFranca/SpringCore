package com.springworkshop.handson.sessionone.intro.exercisefive;

import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/15/2019.
 */
@Component
public class MediaTek implements MobileProcessor{


    public void process() {
        System.out.println("Second best CPU");
    }
}
