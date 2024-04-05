public class CustomerOrder{
    public String name;
    public String date;
    private int quantity;

    public CustomerOrder() {
        this.name = " ";
        this.date = " ";
        this.quantity = 0;
    }

    public CustomerOrder(String name, String date, int quantity){
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipProduct(){
        if (quantity > 0){
            quantity--;
        }
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString() {
       return String.valueOf(quantity);
    }
}
