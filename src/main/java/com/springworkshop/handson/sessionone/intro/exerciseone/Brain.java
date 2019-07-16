package com.springworkshop.handson.sessionone.intro.exerciseone;

/**
 * Created by e068635 on 7/12/2019.
 */
public class Brain {

    private Double area;

    public Brain (Double area){
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
