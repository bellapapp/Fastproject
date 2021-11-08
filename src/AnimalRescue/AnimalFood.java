package AnimalRescue;

public class AnimalFood {
    private String name;
    private int price;
    private int qty;
    private int stockAvailability;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    public void setStockAvailability(int stockAvailability){
        this.stockAvailability = stockAvailability;
    }
    public int getStockAvailability(){
        return stockAvailability;
    }

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
