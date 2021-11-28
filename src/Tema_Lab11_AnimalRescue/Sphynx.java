package Tema_Lab11_AnimalRescue;

public class Sphynx extends Cat {

    public void breed() {
        System.out.println(getName() + "'s breed is Sphynx.");
    }

    public void play() {
        System.out.println("I don't like playing...");
    }

    @Override
    public void catHair() {
        System.out.println("I am bald...");
    }

    @Override
    public void speak() {
        System.out.println("Ssssss...");
    }
}