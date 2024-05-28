package methodsofpayment;

import paymentMethodInterface.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private int expirationMonth;
    private int expirationYear;
    private double securityCode;

    public CreditCardPayment(String cardNumber, int expirationMonth, int expirationYear, double securityCode) {
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.securityCode = securityCode;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with CreditCard of " + amount + " €" + " in progress");
    }
}