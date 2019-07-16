package com.springworkshop.handson.sessionone.intro.exercisethree;

/**
 * Created by e068635 on 7/15/2019.
 */
public class Liver {

    private Double temperature;

    public Liver (){}

    public Liver (Double temperature){
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Liver{" +
                "temperature=" + temperature +
                '}';
    }
}
