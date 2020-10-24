package com.company;

import java.io.File;

//klasa animal
public class Animal {
    //okresla jezeli jest cos psem nie bedzie nigdy czlowiekiem
    //musimy określic konstruktor tu public Animal
//    final String species;
//    String name;
//    private Double weight = 10.0;
//    File pic;
    final String species;
    String name;
    File pic;
    private Double weight = 10.0;


    //konstruktor do pola final
    public Animal(String species) {
        this.species = species;
    }


    //metoda (jakie wartosci ma przyjmowac)
    void feed(int foodWeight) {
        weight += foodWeight;
        System.out.println("thx for food");
    }


    //    udostepnia wartosc bez mozliwosci zmiany musi byc przy private
    Double getWeight() {
        return weight;
    }
}
