package Tema_Lab11_AnimalRescue.animal;

public class Cat extends Animal {

    public void purrs() {
        System.out.println("Purring...");
    }

    public void display() {
        System.out.println("The cat's details: \n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Color: " + getColor() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Height: " + getHeight());
    }

    @Override
    public void speak() {
        System.out.println("Miauuu");
    }
}
