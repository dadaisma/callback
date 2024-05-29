package paymentMethodInterface;

public interface PaymentMethod {
    void processPayment(double amount, PaymentCallback callback);
}
