package model;

public class Employee {
    private String nombre;
    private Restaurant restaurant;

    public Employee(String nombre, Restaurant restaurant) {
        this.nombre = nombre;
        this.restaurant = restaurant;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getNombre() {
        return nombre;
    }   
}
