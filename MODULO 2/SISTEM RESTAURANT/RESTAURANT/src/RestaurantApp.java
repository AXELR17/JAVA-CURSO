import model.*;

public class RestaurantApp {
    public static void main(String[] args) {

        // Restaurant necesita tables[] y employees[]
        
        Table[] tables   = new Table[3];
        Employee[] staff = new Employee[3];

        // Creamos el Menu primero con restaurant = null 
        // Luego creamos los MenuItem[] usando ese Menu y después armamos el Restaurant.

        MenuItem[] menuItems = new MenuItem[4];
        Menu menu = new Menu("Menú Principal", null, menuItems);

        // Ítems del menú (nombres EXACTOS porque findItem usa equals, no ignoreCase)

        menuItems[0] = new MenuItem(menu, "Hamburguesa Clásica", 22000.0);
        menuItems[1] = new MenuItem(menu, "Papas Fritas", 8500.0);
        menuItems[2] = new MenuItem(menu, "Gaseosa", 5000.0);
        menuItems[3] = new MenuItem(menu, "Ensalada Mediana", 16000.0);

        // creamos el Restaurant con los arrays y el menú
        Restaurant restaurant = new Restaurant(
                "AXEL FOOD", "Calle 15 # 7",
                tables, menu, staff
        );

        // Llenamos las mesas y empleados

        tables[0] = new Table(1, 2, restaurant);
        tables[1] = new Table(2, 4, restaurant);
        tables[2] = new Table(3, 4, restaurant);

        // Empleados 

        staff[0] = new Employee("Ana", restaurant);
        staff[1] = new Employee("Luis", restaurant);
        staff[2] = new Employee("Marta", restaurant);

        // Mostrar menú 

        System.out.println("\n=== MENÚ ===");
        restaurant.displayMenu();

        // Buscar ítems con menu.findItem

        MenuItem miBurger = menu.findItem("Hamburguesa Clásica");
        MenuItem miFries  = menu.findItem("Papas Fritas");
        MenuItem miSoda   = menu.findItem("Gaseosa");

        //Buscar una mesa en el restaurante 
       

        Table mesa = restaurant.finTable(1); 
        if (mesa == null) {
            System.err.println("No se encontró la mesa.");
            return;
        }

        //  Crear un pedido con tamaño máximo de ítems 

        Order order = new Order(mesa, 5);

        // --- 9) Crear OrderItems a partir de los MenuItem encontrados ---
        OrderItem oi1 = new OrderItem(order, miBurger, 2);
        OrderItem oi2 = new OrderItem(order, miFries, 1);
        OrderItem oi3 = new OrderItem(order, miSoda, 2);

        //  Añadir los ítems al pedido 

        order.addItem(oi1);
        order.addItem(oi2);
        order.addItem(oi3);

        // Asignar el pedido a la mesa 

        mesa.assignOrder(order);

        order.setTable(mesa);

        //  Mostrar detalles y total 

        System.out.println("\n=== DETALLE DEL PEDIDO ===");
        order.displayDetails();
        Double total = order.calculateTotal();
        System.out.printf("%nTotal a pagar: $ %,.2f%n", total);

       
        if (order.getTable() != null) {
            System.out.println("\n[Bidireccional] El pedido está asignado a la mesa: " + order.getTable().getTableNumber());
        }
    }
}

