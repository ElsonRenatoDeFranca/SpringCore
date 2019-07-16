package com.springworkshop.handson.sessionone.intro.exercisetwo;

/**
 * Created by e068635 on 7/11/2019.
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of Dependency Injection using XML beans configuration: Injecting one dependency at constructor
 */
public class HumanBody {

    private Brain brain;

    public HumanBody(Brain brain){this.brain = brain;}

    public HumanBody(){}

    public Brain getBrain() {return brain;}

    public void setBrain(Brain brain) {this.brain = brain;}

    private static Brain createBrain(Double area){
        Brain brain = new Brain(area);
        return brain;
    }

    public static void main(String [] args){
        ApplicationContext appContextXml = new ClassPathXmlApplicationContext("beans.xml");
        HumanBody humanBody =(HumanBody)appContextXml.getBean("humanBodyWithBrainOnly");
        System.out.println(humanBody.getBrain());
    }

}

