package enums.order_version1;

public class OrdersV1 {

    private String orderName;
    private String orderQuantity;
    private OrderStatusV1 orderStatusV1;

    public OrdersV1(String orderQuantity,String orderName){
        this.orderName = orderName;
        this.orderQuantity = orderQuantity;
        this.orderStatusV1 = OrderStatusV1.PLACED;
    }

    public void inProgressOrders(){
        this.orderStatusV1 = OrderStatusV1.IN_PROGRESS;
    }

    @Override
    public String toString() {
        return "OrdersV1{" +
                "orderName='" + orderName + '\'' +
                ", orderQuantity='" + orderQuantity + '\'' +
                ", orderStatusV1=" + orderStatusV1 +
                '}';
    }
}
