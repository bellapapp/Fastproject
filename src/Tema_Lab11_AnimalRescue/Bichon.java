package Tema_Lab11_AnimalRescue;

public class Bichon extends Dog {

    public void breed() {
        System.out.println(getName() + "'s breed is Bichon.");
    }

    public void play() {
        System.out.println("I am a lazy dog...");
    }

    @Override
    public void guard() {
        System.out.println("I am definitely not a guard dog!");
    }
}
