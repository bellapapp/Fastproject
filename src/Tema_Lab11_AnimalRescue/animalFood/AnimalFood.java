package Tema_Lab11_AnimalRescue.animalFood;

public class AnimalFood {

    private String foodType;
    private int price;
    private int qty;
    private int stockAvailability;

    public String getType() {
        return foodType;
    }

    public void setType(String type) {
        this.foodType = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setStockAvailability(int stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public int getStockAvailability() {
        return stockAvailability;
    }

}
