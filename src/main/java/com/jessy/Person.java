package com.jessy;

public class Person {
    String name;
    float weight;
    float height;
    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, float height, float weight) {
        this(weight, height);
        this.name = "yolo";
    }

    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello World");
    }
}
