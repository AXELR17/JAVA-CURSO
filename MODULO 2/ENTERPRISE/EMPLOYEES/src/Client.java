public class Client extends Person {
    private String contactPhone;

    public Client(String name, Integer age, String contactPhone) {
        super(name, age);
        this.contactPhone = contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    @Override
    public void mostrarDatos() {
       System.out.printf("Cliente: nombre: %s, edad: %d, telefono contacto: %s%n",
            getName(), getAge(), getContactPhone());
    }

    
}
