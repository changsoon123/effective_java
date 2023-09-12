package effective_practice;

public interface IPaymentProcessor {
	void processPayment(Order order);
	
	
}

class CreditCardPaymentProcessor implements IPaymentProcessor {
	
    @Override
    public void processPayment(Order order) {
        // 신용카드 결제 처리 로직
    }
}

class PayPalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(Order order) {
        // PayPal 결제 처리 로직
    }
}