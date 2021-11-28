package Tema_Lab11_AnimalRescue;

public abstract class Dog extends Animal {

    public void tailWagging() {
        System.out.println("Tail wagging...");
    }

    public void speak() {
        System.out.println("Woof woof");
    }

    public void guard() {
        System.out.println("I am a guard dog!");
    }

    public abstract void breed();


}

