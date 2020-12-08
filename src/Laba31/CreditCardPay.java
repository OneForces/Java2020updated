package Laba31;

public class CreditCardPay implements PayStrategy {
    @Override
    public void pay(int sum) {
        System.out.println("Sum of pay: " + sum);
    }
}