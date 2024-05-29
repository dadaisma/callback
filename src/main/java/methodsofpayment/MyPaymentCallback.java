package methodsofpayment;

import paymentMethodInterface.PaymentCallback;

public class MyPaymentCallback implements PaymentCallback {
    @Override
    public void onPaymentCompleted(boolean success) {
        if (success) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }
}