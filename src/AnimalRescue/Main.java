package AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Dog lessie = new Dog();
        lessie.name = "Lessie";
        lessie.age = 3;
        lessie.breed = "Labrador";
        lessie.color = "White";
        lessie.weight = 5.5F;
        lessie.height = 60;
        lessie.feelingHungry = 9;
        lessie.healthy = 8;
        lessie.mood = 10;

        Girl tanja = new Girl();
        tanja.name = "Tanja";
        tanja.age = 15;
        tanja.moneyAvailability = 5;
        tanja.occupation = "student";
        tanja.residence = "city";
        tanja.timeAvailability = 10;

        DogFood pedigree = new DogFood();
        pedigree.name = "Pedigree";
        pedigree.price = 20;
        pedigree.qty = 5;
        pedigree.stockAvailability = 1;

        Veterinary drCurt = new Veterinary();
        drCurt.name = "Dr.Curt";
        drCurt.availability = 2;
        drCurt.priceRange = 10;
        drCurt.specialization = "cats";

        System.out.println("The dog's details: \n" +
                "Name: " + lessie.name + "\n" +
                "Age: " + lessie.age + "\n" +
                "Breed: " + lessie.breed + "\n" +
                "Color: " + lessie.color + "\n" +
                "Weight: " + lessie.weight + "\n" +
                "Height: " + lessie.height + "\n" +
                "Feeling hungry: " + lessie.feelingHungry + "\n" +
                "Healthy: " + lessie.healthy + "\n" +
                "Mood: " + lessie.mood + "\n");

        System.out.println("The adoptator details: \n" +
                "Name: " + tanja.name + "\n" +
                "Age: " + tanja.age + "\n" +
                "Occupation: " + tanja.occupation + "\n" +
                "Money availability: " + tanja.moneyAvailability + "\n" +
                "Time availability: " + tanja.timeAvailability + "\n" +
                "Residence: " + tanja.residence + "\n");

        System.out.println("The dog food's details: \n" +
                "Name: " + pedigree.name + "\n" +
                "Price: " + pedigree.price + "\n" +
                "Quantity: " + pedigree.qty + "\n" +
                "Stock availability: " + pedigree.stockAvailability + "\n");

        System.out.println("The veterinary's details: \n" +
                "Name: " + drCurt.name + "\n" +
                "Price range: " + drCurt.priceRange + "\n" +
                "Specialization: " + drCurt.specialization + "\n" +
                "Availability: " + drCurt.availability + "\n");
    }

}
