package com.company;

public class Main {

    public static void main(String[] args) {
    Backend objectA = new Backend("Spring","intellij", "web");
        System.out.println(objectA.getInfo());
        objectA.makeCodeBetter("Fix code guys");
    Programmer objectB = new Programmer("Spring ","intellij ","web ", 22, Level.JUN);
        System.out.println(objectB.getInfo());
        objectB.makeCodeBetter("Bogdan", "Fix it", 10);
    Programmer objectC = new Programmer("Spring ","intellij ", "app ", 24, Level.SENIOR);
        System.out.println(objectC.getInfo());
        objectB.makeCodeBetter("Asyl", "not properly", 32);



    }
}
