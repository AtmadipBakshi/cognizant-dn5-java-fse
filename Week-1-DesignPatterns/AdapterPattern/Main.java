public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new RazorPayAdapter();
        payment.pay(500);
    }
}