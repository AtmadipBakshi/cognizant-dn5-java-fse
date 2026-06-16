class RazorPayAdapter implements PaymentProcessor {
    private RazorPay razorPay = new RazorPay();

    public void pay(int amount) {
        razorPay.makePayment(amount);
    }
}