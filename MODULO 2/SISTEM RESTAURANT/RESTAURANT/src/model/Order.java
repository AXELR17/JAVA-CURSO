package model;

public class Order {
    private Integer orderNumber;
    private OrderStatus status;
    private OrderItem[] orderItems;
    private Table table;

    public Order(Table table, Integer orderItemSize){
        this.table = table;
        this.orderNumber = 1;
        this.status = OrderStatus.PENDING;
        this.orderItems = new OrderItem[orderItemSize];
    }

     public Order(Table table, OrderItem[] orderItems) {
        this(table, OrderStatus.PENDING, orderItems);
    }

     public Order( Table table, OrderStatus status, OrderItem[] orderItems) {
        this.table = table;
        this.status = status;
        this.orderItems = orderItems;
        this.orderNumber = 1;  //TODO: Calcular el siguiente pedido
    }
    public Table getTable() {
        return table;
    }
    public Integer getOrderNumber() {
        return orderNumber;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void setTable(Table table) {
        this.table = table;
    }

    public void addItem(OrderItem item){
        for (int i = 0; i < orderItems.length; i++) {
            if(orderItems[i] == null){
                orderItems[i] = item;
                return;
            }
        }
        System.err.println("La lista de items esta llena");
    }

    public Double calculateTotal(){
        var total=0d;
        for (int i = 0; i < orderItems.length; i++) {
            if(orderItems[i] != null) {
                total += orderItems[i].calculateSubtotal();
            }
        }
        return total;
    }

    public void displayDetails(){
        System.out.printf("Pedido No: %d%n Estado: %s%n", 
                orderNumber, status);
        System.out.println("==== Productos del pedido ====");
        for (int i = 0; i < orderItems.length; i++) {
            if(orderItems[i]!= null){
                var item = orderItems[i];
                System.out.printf("Nombre: %s:, Cantidad: %d, Subtotal: $ %,.2f",
                   item.getMenuItem().getName(),
                   item.getQuantity(),
                   item.calculateSubtotal()
                );

            }
        }
    }
    
}
