public class Order {
    String customerName;
    String productName;
    double productPrice;
    double discount;

    public Order(String customerName, String productName, double productPrice, double discount) {
        this.customerName = customerName;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discount = discount;
    }
}
