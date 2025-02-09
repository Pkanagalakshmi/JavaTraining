package com.celcom.day5;

class Animal {
    void makesound() {
        System.out.println("meow");
    }
}

class Cat extends Animal {
    void makesound() {
        System.out.println("bark");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Animal sound;
        
        sound = new Animal();
        sound.makesound();  

        sound = new Cat();
        sound.makesound(); 
    }
}