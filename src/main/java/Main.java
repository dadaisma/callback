import methodsofpayment.CreditCardPayment;


import methodsofpayment.DebitPayment;
import gateway.PaymentGateway;
import methodsofpayment.PaypalMethod;
import paymentMethodInterface.PaymentCallback;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        PaymentCallback callback = new PaymentCallback(); // Assuming MyPaymentCallback implements PaymentCallback

        // Set callback before processing payments
        paymentGateway.setCallback(callback);

        // Payment with Credit Card
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234567890123456", 5, 2025, 123);
        paymentGateway.processPayment(creditCardPayment, 50.00);

        // Payment with Paypal
        PaypalMethod paypalPayment = new PaypalMethod("example@email.com");
        paymentGateway.processPayment(paypalPayment, 100.00);

        // Payment with Debit Card
        DebitPayment debitPayment = new DebitPayment("123456789", 653);
        paymentGateway.processPayment(debitPayment, 200.00);
    }
}