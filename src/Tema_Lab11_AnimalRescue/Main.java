package Tema_Lab11_AnimalRescue;

import Tema_Lab11_AnimalRescue.animal.Bengal;
import Tema_Lab11_AnimalRescue.animal.Labrador;
import Tema_Lab11_AnimalRescue.animalFood.Pedigree;
import Tema_Lab11_AnimalRescue.animalFood.Whiskas;

public class Main {
    public static void main(String[] args) {

        Bengal moti = new Bengal();

        moti.setName("Moti");
        moti.setAge(1);
        moti.setColor("Grey");
        moti.setHeight(40);
        moti.setWeight(5);

        Bengal suki = new Bengal();

        suki.setName("Suki");
        suki.setAge(3);
        suki.setColor("Brown");
        suki.setHeight(30);
        suki.setWeight(4);

        Labrador rex = new Labrador();

        rex.setName("Rex");
        rex.setAge(5);
        rex.setColor("White");
        rex.setHeight(70);
        rex.setWeight(15);

        Whiskas whiskasJunior = new Whiskas();

        whiskasJunior.setPrice(100);
        whiskasJunior.setQty(2);
        whiskasJunior.setStockAvailability(0);
        whiskasJunior.setType("Junior");

        Pedigree pedigreeJunior = new Pedigree();

        moti.display();
        moti.breed();
        System.out.println(moti.getName() + "'s activities: ");
        moti.eat();
        moti.play();
        moti.sleep();
        moti.purrs();
        System.out.println(moti.getName() + " speaks in this way:");
        moti.speak();
        System.out.println();

        suki.display();
        suki.breed();
        System.out.println(suki.getName() + "'s activities: ");
        suki.eat();
        suki.play();
        suki.sleep();
        suki.purrs();
        System.out.println(suki.getName() + " speaks in this way:");
        suki.speak();
        System.out.println();

        rex.display();
        rex.breed();
        System.out.println(rex.getName() + "'s activities: ");
        rex.eat();
        rex.play();
        rex.sleep();
        rex.tailWagging();
        System.out.println(rex.getName() + " speaks in this way:");
        rex.speak();
        System.out.println();

        System.out.println("Cat foods: \n" +
                "Brand: " + whiskasJunior.getBrandName() + "\n" +
                "Type: " + whiskasJunior.getType() + "\n" +
                "Price: " + whiskasJunior.getPrice() + "\n" +
                "Quantity required for a week: " + whiskasJunior.getQty() + "\n" +
                "Stock availability: " + whiskasJunior.getStockAvailability());
        whiskasJunior.food();
        System.out.println();
        System.out.println(pedigreeJunior.getBrandName());
        pedigreeJunior.food();
    }
}
