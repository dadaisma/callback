package methodsofpayment;

import paymentMethodInterface.PaymentMethod;

public class PaypalMethod implements PaymentMethod {
    private String emailAddress;

    public PaypalMethod(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with Paypal of " + amount + " €" + " in progress");
    }
}