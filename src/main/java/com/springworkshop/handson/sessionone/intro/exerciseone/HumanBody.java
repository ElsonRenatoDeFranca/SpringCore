package com.springworkshop.handson.sessionone.intro.exerciseone;

/**
 * Created by e068635 on 7/11/2019.
 */


/**
 * Example of Dependency Injection using XML beans configuration: Injecting one dependency at constructor
 */
public class HumanBody {

    private Brain brain;//The first way of injecting is by instatiating the dependency here "createBrain(0.38)"

    public HumanBody(Brain brain){this.brain = brain;}

    public HumanBody(){}

    public Brain getBrain() {return brain;}

    public void setBrain(Brain brain) {this.brain = brain;}

    private static Brain createBrain(Double area){
        Brain brain = new Brain(area);
        return brain;
    }

    public static void main(String [] args){
        HumanBody humanBody = new HumanBody(createBrain(0.34));//Third way of creating an object - constructor
        //HumanBody humanBody = new HumanBody(); //second way of creating an object - set method
        //humanBody.setBrain(createBrain(0.84));
        System.out.println(humanBody.getBrain().getArea());

    }

}

