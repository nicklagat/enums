package enums.order_examples;

public enum OrderStatus {
    PLACED("Your order has been placed successfully."),
    IN_PROGRESS("Your order is being prepared."),
    READY("Your order is ready for pickup or delivery."),
    DELIVERED("Your order has been delivered."),
    CANCELED("Your order was canceled.");

    String orderMessage;

    OrderStatus(String orderMessage){
        this.orderMessage = orderMessage;
    }

    public String getMessage(){
        return this.orderMessage;
    }

}
