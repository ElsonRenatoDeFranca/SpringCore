package com.springworkshop.handson.sessionone.intro.exercisefive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/15/2019.
 */
@Component
public class Samsung {

    @Autowired
    @Qualifier("mediaTek")
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa core, 4GB RAM, 12MP camera");
        cpu.process();
    }
}
