package com.springworkshop.handson.sessiontwo.intro.exercisetwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/15/2019.
 */
@Component
public class PlayerApp {

    @Autowired
    @Qualifier("tennisPlayer")
    private Player player;

    public static void main(String [] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(PlayerAppConfig.class);
        PlayerApp sportPlayer = factory.getBean(PlayerApp.class);
        sportPlayer.player.play();
    }
}
