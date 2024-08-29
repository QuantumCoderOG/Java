package src.DesignPatter.strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
