package gateway;

import paymentMethodInterface.PaymentMethod;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}