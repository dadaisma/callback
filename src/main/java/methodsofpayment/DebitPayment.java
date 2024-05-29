package methodsofpayment;

import paymentMethodInterface.PaymentCallback;
import paymentMethodInterface.PaymentMethod;

public class DebitPayment implements PaymentMethod {

    private String cardNumber;

    private double securityCode;

    public DebitPayment(String cardNumber, double securityCode) {
        this.cardNumber = cardNumber;

        this.securityCode = securityCode;
    }

    @Override
    public void processPayment(double amount, PaymentCallback callback) {
        System.out.println("Payment with DebitCard of " + amount + " €" + " in progress");
        boolean success = true;
        callback.onPaymentCompleted(success);
    }
}