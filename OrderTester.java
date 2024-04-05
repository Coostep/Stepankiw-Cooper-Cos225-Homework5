public class OrderTester {
    public static void main(String[] args){
        OrderQueue orderQueue = new OrderQueue(14);
        orderQueue.addOrder("C1", "1/1/01", 5);
        orderQueue.addOrder("C2", "1/1/01", 5);
        orderQueue.addOrder("C3", "1/1/01", 8);

        System.out.println(orderQueue);
    
        orderQueue.sellRemainingStock();

        System.out.println(orderQueue);

        orderQueue.addStock(10);

        orderQueue.addOrder("C4", "1/2/01", 3);
        orderQueue.addOrder("C5", "1/2/01", 3);
        orderQueue.addOrder("C6", "1/2/01", 5);

        orderQueue.sellRemainingStock();

        System.out.println(orderQueue);
    }
}
