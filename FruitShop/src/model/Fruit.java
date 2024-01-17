
package model;

public class Fruit {
    private String fruitId,fruitName,origin;
    private int price,quantity;

    public Fruit() {
    }

    public Fruit(String fruitId, String fruitName, String origin, int price, int quantity) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.origin = origin;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFruitId() {
        return fruitId;
    }

    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
