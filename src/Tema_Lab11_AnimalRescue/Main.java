package Tema_Lab11_AnimalRescue;


public class Main {
    public static void main(String[] args) {

        Cat suki = new Bengal();
        suki.setName("Suki");

        suki.breed();
        suki.sleep();
        suki.eat();
        suki.play();
        suki.speak();
        suki.purrs();
        suki.catHair();
        System.out.println();

        Cat mrs_whiskerson = new Sphynx();
        mrs_whiskerson.setName("Mrs. Whiskerson");

        mrs_whiskerson.breed();
        mrs_whiskerson.sleep();
        mrs_whiskerson.eat();
        mrs_whiskerson.play();
        mrs_whiskerson.speak();
        mrs_whiskerson.purrs();
        mrs_whiskerson.catHair();
        System.out.println();

        Whiskas whiskasAdult = new Whiskas();
        System.out.println(whiskasAdult.getBrandName());
        whiskasAdult.food();
        System.out.println();

        Pedigree pedigreeJunior = new Pedigree();
        System.out.println(pedigreeJunior.getBrandName());
        pedigreeJunior.food();
        System.out.println();

        Rescuer lilly = new Woman();
        lilly.whatDoWithTheAnimal();
        lilly.whatKindOfAnimalAdopts();
        lilly.fluffyOrShortHairToAdopt();
        System.out.println();

        Rescuer john = new Man();
        john.whatDoWithTheAnimal();
        john.whatKindOfAnimalAdopts();
        john.fluffyOrShortHairToAdopt();
        System.out.println();

        Veterinary monica = new Nurse();
        monica.whatDoWithTheAnimal();
        monica.examine();
        monica.vaccinate();
        monica.surgery();
        monica.nonSpecialization();
        System.out.println();

        Veterinary dr_Goldberg = new Doctor();
        dr_Goldberg.whatDoWithTheAnimal();
        dr_Goldberg.examine();
        dr_Goldberg.vaccinate();
        dr_Goldberg.surgery();
        dr_Goldberg.nonSpecialization();
    }
}


