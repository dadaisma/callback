package gateway;


import paymentMethodInterface.PaymentCallback;
import paymentMethodInterface.PaymentMethod;

public class PaymentGateway {
    private PaymentCallback callback; // Member variable

    public void setCallback(PaymentCallback callback) {
        this.callback = callback;
    }

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount, callback);
    }
}