package src.DesignPatter.strategy;

public class Item {
    private String itemId;
    private int price;

    public Item(String itemId, int price) {
        this.itemId = itemId;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public int getPrice() {
        return price;
    }
}
