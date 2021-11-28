package Tema_Lab11_AnimalRescue;

public abstract class AnimalFood {

    private String foodType;
    private int price;
    private int qty;

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

    public abstract void food();
}
