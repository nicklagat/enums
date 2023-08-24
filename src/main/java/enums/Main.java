package enums;

import enums.general_examples.*;
import enums.order_examples.Order;
import enums.order_examples.OrderStatus;
import enums.order_version1.OrdersV1;
import enums.payment_examples.Payment;
import enums.payment_examples.PaymentStatus;

public class Main {

    public static void main(String[] args) {

        System.out.println(Rivian.BASE_URL);
        System.out.println("Hello world!");

        // enum types cannot be instantiated... you cannot creat an object
        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.SUNDAY;
        System.out.println(daysOfTheWeek);

        if (daysOfTheWeek == DaysOfTheWeek.SUNDAY) {
            System.out.println("Yay Thursday");
        }
        DaysOfTheWeek.values();

        for (DaysOfTheWeek days : DaysOfTheWeek.values()) {

            System.out.println(days);
        }

        getDaysOfTheWeek(DaysOfTheWeek.SUNDAY);


        System.out.println(Cereals.FROOT_LOOPS.howTasty);
        System.out.println(Cereals.COCOA_PUFFS.howTasty);

        System.out.println(getAge(66));




        HttpMethods httpMethods = HttpMethods.GET;
        System.out.println(httpMethods);


        getHttpMethods(HttpMethods.GET);




        ElectricVehicles electricVehicles = ElectricVehicles.CHEVROLET_BOLT;
        System.out.println(electricVehicles);

        ElectricVehicles electricVehicles1 = ElectricVehicles.RIVIAN_R1S;
        System.out.println(electricVehicles1);


        System.out.println(ElectricVehicles.RIVIAN_R1S.prices);

        Files files = new Files();


        System.out.println("--------------ENUMS-------------------------");
        Payment payment = new Payment(600);
        System.out.println(payment);



        Payment payment1 = new Payment(9000);
        payment1.failPayment();
        System.out.println(payment1);


        Payment payment2 = new Payment(2000);
        payment2.refundPayment();
        System.out.println(payment2);

        Payment payment3 = new Payment(60000);
        payment3.completePayment();
        System.out.println(payment3);


        PaymentStatus paymentStatus = PaymentStatus.COMPLETED;
        System.out.println(paymentStatus);


        OrderStatus orderStatus = OrderStatus.PLACED;
        System.out.println(orderStatus);


        Order order = new Order("Rivian R1S","60000");
        order.readyOrder();
        System.out.println(order);


        Order order1 = new Order("Rivian R1T","95000");
        order1.inProgressOrder();
        order1.displayOrderStatus();
        System.out.println(OrderStatus.IN_PROGRESS.getMessage());
        System.out.println(order1);


        Order order2 = new Order("Rivian Commercial Van","30000");
        order2.deliverOrder();
        order2.displayOrderStatus();
        System.out.println(OrderStatus.DELIVERED.getMessage());
        System.out.println(order2);

        Order order3 = new Order("Tesla Model Y","4000");
        order3.canceledOrder();
        order3.displayOrderStatus();
        System.out.println(OrderStatus.CANCELED.getMessage());
        System.out.println(order3);


        OrdersV1 ordersV1 = new OrdersV1("500","Nissan Leaf");
        ordersV1.inProgressOrders();
        System.out.println(ordersV1);


    }

    public static HttpMethods getHttpMethods(HttpMethods httpMethods){

        if(httpMethods != HttpMethods.POST){
            System.out.println("This is an invalid http method request");
        }

        return httpMethods;
    }

    public static DaysOfTheWeek getDaysOfTheWeek(DaysOfTheWeek daysOfTheWeek){

        if(daysOfTheWeek == DaysOfTheWeek.SUNDAY){
            System.out.println("Yay its a day for church");
        }
        else{
            System.out.println("Incorrect");
        }

        return daysOfTheWeek;
    }

    public static int getAge(int age){

        return age;
    }
}