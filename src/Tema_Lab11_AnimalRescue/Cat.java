package Tema_Lab11_AnimalRescue;

public abstract class Cat extends Animal {

    public void purrs() {
        System.out.println("Purring...");
    }

    public void speak() {
        System.out.println("Meow...");
    }

    public void catHair() {
        System.out.println("I am so fluffy!");
    }

    public abstract void breed();
}
