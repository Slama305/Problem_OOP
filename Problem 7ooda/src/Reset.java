public class Reset {
    void completeOrder( Order order,  FinalPrice discount) {
       double finalPrice = discount.applyDiscount(order.productPrice, order.discount);
       System.out.println( "Customer: " + order.customerName );
       System.out.println( "Product: " + order.productName );
       System.out.println( "\"Final Price after Discount: $\": " +finalPrice );
    }
}
