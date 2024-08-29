package src.DesignPatter.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("123", 100));
        cart.addItem(new Item("456", 200));

        cart.setPaymentStrategy(new PaypalStrategy("myemail@example.com"));
        cart.checkout();

        cart.setPaymentStrategy(new CreditCardStrategy("1111-2222-3333-4444"));
        cart.checkout();
    }
}