package AnimalRescue;

public class AnimalFood {
    String name;
    int price;
    int qty;
    int stockAvailability;

    public void tasty() {
        System.out.println("The dog likes the food. ");
    }

    public void setStockAvailability() {
        System.out.println("The food is available and can be purchased. ");
    }

    public void hungryAttenuation(){
        System.out.println("The dog is no longer hungry. ");
    }

    public void setPrice() {
        System.out.println("The girl doesn't have enough money to buy that food. ");
    }


}
