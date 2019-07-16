package com.springworkshop.handson.sessionone.intro.exercisethree;

/**
 * Created by e068635 on 7/11/2019.
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of Dependency Injection using XML beans configuration: Injecting two dependencies at constructor
 */
public class HumanBody {

    private Brain brain; //The first way is instatiating in the property.
    private Liver liver;

    public HumanBody(Brain brain){this.brain = brain;}

    public HumanBody(Brain brain, Liver liver){
        this.brain = brain;
        this.liver = liver;
    }

    public HumanBody(){}

    public Brain getBrain() {return brain;}

    public void setBrain(Brain brain) {this.brain = brain;}

    public Liver getLiver() {
        return liver;
    }

    public void setLiver(Liver liver) {
        this.liver = liver;
    }

    private static Brain createBrain(Double area){
        Brain brain = new Brain(area);
        return brain;
    }

    public static void main(String [] args){
        ApplicationContext appContextXml = new ClassPathXmlApplicationContext("beans.xml");
        HumanBody humanBody =(HumanBody)appContextXml.getBean("humanBodyWithBrainAndLiver");
        System.out.println("HumanBody: " + humanBody.getBrain() +","+ humanBody.getLiver());
    }

}

