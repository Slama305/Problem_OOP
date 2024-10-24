
public class Main {
   
    public static void main(String[] var0) {
        Order order= new Order("salama", "Laptop", 3000.0, 10.0);
        FinalPrice total = new FinalPrice();
        Reset reset = new Reset();
        reset.completeOrder(order, total);
    }
 }
 