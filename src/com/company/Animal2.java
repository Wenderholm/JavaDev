package com.company;

import java.io.File;

//klasa animal
public class Animal2 {
    String species;
    String name;
    Double weight = 10.0;
    File pic;


    void feed(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("sorry to late");
        } else {
            weight += foodWeight;
            System.out.println("thx for feed, my weight is now " + weight);
            System.out.println("cos nowego");
        }
    }

    void walk(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("you cannot go with dead pet");
        } else {
            weight--;
            System.out.println("thx for walk, my weight is now" + weight);
        }

    }
}