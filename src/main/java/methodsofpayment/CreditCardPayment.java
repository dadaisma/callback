package methodsofpayment;

import paymentMethodInterface.PaymentCallback;
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
     public void processPayment(double amount, PaymentCallback callback) {
       System.out.println("Payment with CreditCard of " + amount + " €" + " in progress");
       boolean success = true;
     callback.onPaymentCompleted(success);

    }




}