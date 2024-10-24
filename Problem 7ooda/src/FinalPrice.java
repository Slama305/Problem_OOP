public class FinalPrice {
    double applyDiscount(double price, double discount) {
        return price - (price * (discount / 100));
    }
}
