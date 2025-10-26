public class App {
    public static void main(String[] args) throws Exception {
        //Creando empleados
        var company = new Enterprise("BAR");
        var cesar = new Directive("cesar", 25, 10000d, "CEO");
       
        
        var luisa = new Employee("Luisa", 20, 1000d);
        luisa.setManager(cesar);
       

        var manuel = new Employee("Manuel", 26, 1000d);
        manuel.setManager(cesar);
        cesar.addEmployee(1, manuel);

        //Agregando empleados a compañia
        company.addEmployee(0, cesar);
        company.addEmployee(1, luisa);
        company.addEmployee(2, manuel);
   
        //Agregando empleados a directivos
        cesar.addEmployee(0, luisa);
        cesar.addEmployee(1, manuel);

        //Creando clientes
        var santiago = new Client("Santiago", 30, "3201151515");
        //Agregando clientes a la compañia
        company.addClient(0, santiago);
        System.out.println(".: Empleados :.");

        var employees = company.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                employees[i].mostrarDatos();

            }
            
        }
        System.out.println(".: Clientes :.");
        var clients = company.getClients();
        for (int i = 0; i < clients.length; i++) {
            if(clients[i] != null){
                clients[i].mostrarDatos();

            }
                        
        }


    }
}
