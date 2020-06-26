package com.company;

public class Animal {
    private String name;
    private int weight;
    private int body;

    public Animal(String name, int weight, int body) {
        this.name = name;
        this.weight = weight;
        this.body = body;
    }

    public void eat(){

        System.out.println(" Animal .eat() called");
    }

    public void move(){

    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }
}
