package enums.general_examples;

public class CustomerPayment {
    private String customerName;
    private String customerId;
    private String bankName;
    private PaymentModes paymentModes;



    public CustomerPayment(String customerName, String customerId, String bankName) {

        this.customerName = customerName;
        this.customerId = customerId;
        this.bankName = bankName;
        this.paymentModes = PaymentModes.CASH;
    }


    public void cashPayment() {
        this.paymentModes = PaymentModes.CASH;
    }

    public void creditCardPayment() {
        this.paymentModes = PaymentModes.CREDIT_CARD;
    }

    public void debitCardPayment() {
        this.paymentModes = PaymentModes.DEBIT_CARD;
    }

    public void bitcoinPayment() {
        this.paymentModes = PaymentModes.BITCOIN;
    }

    public void paypalPayment() {
        this.paymentModes = PaymentModes.PAYPAL;
    }


    @Override
    public String toString() {
        return "CustomerPayment{" +
                "customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", bankName='" + bankName + '\'' +
                ", paymentModes=" + paymentModes +
                '}';
    }
}
