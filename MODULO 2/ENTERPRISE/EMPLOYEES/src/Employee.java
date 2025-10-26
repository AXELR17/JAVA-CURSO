public class Employee extends Person {
    private Double salary;
    private Directive manager;

    public Employee(String name, Integer age, Double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
    public Directive getManager() {
        return manager;
    
    }

    public void setManager(Directive manager) {
        this.manager = manager;
    }
    @Override
    public void mostrarDatos() {
        System.out.printf("Empleado: nombre: %s, edad: %d, salario: $%,f%n",
            getName(), getAge(), getSalary());
    }
    
    
}
