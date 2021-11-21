package Tema_Lab11_AnimalRescue.animal;

public class Dog extends Animal {

    public void tailWagging() {
        System.out.println("Tail wagging...");
    }

    public void display() {
        System.out.println("The dog's details: \n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Color: " + getColor() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Height: " + getHeight());
    }

    @Override
    public void speak(){
        System.out.println("Bark!!!");
    }

}

