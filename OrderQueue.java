public class OrderQueue {
    private LinkedQueue<CustomerOrder> orders;
    private int stock;

    public OrderQueue(){
        orders = new LinkedQueue<>();
        stock = 0;
    }

    public OrderQueue(int stock){
        orders = new LinkedQueue<>();
        this.stock = stock;
    }
    
    public void addOrder(String name, String date, int quantity){
        CustomerOrder order = new CustomerOrder(name, date, quantity);
        orders.enqueue(order);
    }

    public void addStock(int moreStock){
        stock += moreStock;
    }
    
    public void fillOrder() {
        while (!orders.isEmpty() && stock > 0) {
            CustomerOrder customerOrder = orders.getFront();
            if (customerOrder.getQuantity() > 0) {
                customerOrder.shipProduct();
                stock--;
                if (customerOrder.getQuantity() == 0) {
                    orders.dequeue();
                }
            } else {
                orders.dequeue();
            }
        }
    }

    public void sellRemainingStock(){
        while (!orders.isEmpty() && stock > 0){
            fillOrder();
        }
    }

    public int printFirstOrderQuantity() {
        if(!orders.isEmpty()){
            return orders.getFront().getQuantity();
        }
        return 0;
    }
    public String toString() {
        return String.valueOf(printFirstOrderQuantity());
    }
}
