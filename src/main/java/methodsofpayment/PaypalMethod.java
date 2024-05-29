package methodsofpayment;

import paymentMethodInterface.PaymentCallback;
import paymentMethodInterface.PaymentMethod;

public class PaypalMethod implements PaymentMethod {
    private String emailAddress;

    public PaypalMethod(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment(double amount, PaymentCallback callback) {
        System.out.println("Payment with Paypal of " + amount + " €" + " in progress");
        boolean success = true;
        callback.onPaymentCompleted(success);
    }
}