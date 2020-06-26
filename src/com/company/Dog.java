package com.company;

public class Dog extends Animal  {
    private int eyes;
    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int weight, int body, int eyes, int legs, int tail, String coat) {
        super(name, weight, body);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }
}
