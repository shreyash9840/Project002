package Model;

public class Item extends Category {
    private String itemName;
    private float price;

    public Item(String Main_CategoryName, String CategoryName, String ItemName, float price) {
        super(Main_CategoryName, CategoryName);
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void getItemDetail() {
        System.out.println("Main Models.Category: " + getCategoryName());
        System.out.println("Models.Category: " + getCategoryName());
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}