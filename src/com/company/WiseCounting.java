package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class WiseCounting {
    public static void main(String[] args) {
        Emperor emperor = new Emperor("Akbar");
        ArrayList<Courtier> courtiers = new ArrayList<>();
        courtiers.add(new Courtier("courtier 1"));
        courtiers.add(new Courtier("courtier 2"));
        courtiers.add(new Courtier("courtier 3"));
        Birbal birbal = new Birbal("Birbal");
        emperor.asks(0);
        /*
        for (int i=0; i<courtiers.size(); i++)
            courtiers.get(i).thinks();
        for (Courtier courtier:courtiers)
            courtier.thinks();

         */
        courtiers.forEach(Courtier::thinks);

        birbal.enters();
        birbal.asks();
        emperor.asks(0);
        birbal.replies();
        emperor.asks(1);
        birbal.says();
    }
}

class Person{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Emperor extends Person{
    private final LinkedList<String> questions;
    public Emperor(String name){
        super(name);
        questions = new LinkedList<>();
        questions.add("How many crows are in this city?");
        questions.add("How can you be sure?");
    }

    public void looks(){
        System.out.println(getName() + " glanced at his courtiers");
    }

    public void asks(int number){
        System.out.println(getName() + " asks: " + questions.get(number));
    }
}

class Courtier extends Person {

    public Courtier(String name) {
        super(name);
    }

    public void thinks() {
        System.out.println("Head of the " + getName() + " began to hang low");
    }
}

    class Birbal extends Person{

        public Birbal(String name) {
            super(name);
        }

        public void enters(){
            System.out.println(getName() + " enter the courtyard");
        }

        public void asks(){
            System.out.println(getName() + " asks: " + " May i know the question?");
        }

        public void replies(){
            System.out.println(getName() + " replies: There are 50589 crows");
        }

        public void says(){
            System.out.println(getName()+" Make you men count, My lord. If you find more \n" +
                    "crows it means some have come to visit their relatives here. \n" +
                    "If you find less number of crows it means some have gone to \n" +
                    "visit their relatives elsewhere");
        }
    }

