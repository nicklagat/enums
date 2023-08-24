package enums.payment_examples;

public class Payment {

    private double amount;
    private PaymentStatus paymentStatus;

    public Payment(double amount) {
        this.amount = amount;
        this.paymentStatus = PaymentStatus.PENDING;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void completePayment(){
        this.paymentStatus = PaymentStatus.COMPLETED;
    }

    public void failPayment(){
        this.paymentStatus = PaymentStatus.FAILED;
    }

    public void refundPayment(){
        this.paymentStatus = PaymentStatus.REFUNDED;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
