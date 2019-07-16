package com.springworkshop.handson.sessionone.intro.exercisefour;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by e068635 on 7/12/2019.
 */
@Component
public class Brain {

    @Value("34.0")
    private Double area;

    public Brain(Double area){
        this.area = area;
    }

    public Brain(){}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Brain{" +
                "area=" + area +
                '}';
    }
}
