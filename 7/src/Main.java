public class Main {
    public static void main(String[]args){
        PaymentMethod payment = new PayPalPayment();
        payment.pay(160);
    }
}