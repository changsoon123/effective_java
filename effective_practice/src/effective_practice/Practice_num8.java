package effective_practice;

public class Practice_num8 {

	public static void main(String[] args) {
		// CreditCardPaymentProcessor를 사용하여 주문 처리
		IPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        OrderService orderService1 = new OrderService(creditCardProcessor);
        Order order1 = new Order(/* 주문 정보 */);
        orderService1.processOrder(order1);

        // PayPalPaymentProcessor를 사용하여 주문 처리
        IPaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        OrderService orderService2 = new OrderService(payPalProcessor);
        Order order2 = new Order(/* 주문 정보 */);
        orderService2.processOrder(order2);
	}

}

class OrderService {
    private IPaymentProcessor paymentProcessor;

    public OrderService(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        // 주문 처리 로직
        paymentProcessor.processPayment(order);
        // 추가 주문 처리 로직
    }
}

