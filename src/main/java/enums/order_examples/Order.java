package enums.order_examples;

public class Order {

    private String orderName;
    private String orderQuantity;
    private OrderStatus orderStatus;


    public Order(String orderName,String orderQuantity){

        this.orderName = orderName;
        this.orderQuantity = orderQuantity;
        this.orderStatus = OrderStatus.PLACED;

    }

    public void deliverOrder(){
        this.orderStatus = OrderStatus.DELIVERED;
    }

    public void inProgressOrder(){
        this.orderStatus = OrderStatus.IN_PROGRESS;
    }

    public void readyOrder(){
        this.orderStatus = OrderStatus.READY;
    }

    public void canceledOrder(){
        this.orderStatus = OrderStatus.CANCELED;
    }

    public void displayOrderStatus(){

        System.out.println(orderName +" is currently "+orderStatus);
    }



     @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderQuantity='" + orderQuantity + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
