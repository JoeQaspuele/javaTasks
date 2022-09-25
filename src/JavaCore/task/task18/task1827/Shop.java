package JavaCore.task.task18.task1827;

public class Shop {
    private String id;
    private String productName;
    private String price;
    private String quantity;

    public Shop () {

    }

    public Shop (String id, String productName, String price, String quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + productName + price + quantity;
    }
}
