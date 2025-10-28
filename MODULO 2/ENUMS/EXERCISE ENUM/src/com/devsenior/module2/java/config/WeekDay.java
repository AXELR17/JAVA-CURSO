package com.devsenior.module2.java.config;

public enum WeekDay {
    MONDAY(1, "Lunes"), 
    TUESDAY(2, "Martes"),
    WEDNESDAY(3, "Miercoles"),
    THURSDAY(4, "Jueves"),
    FRIDAY(5, "Viernes"),
    SATURDAY(6, "Sabado"),
    SUNDAY(7, "Domingo"),
    MYDAY;

    private Integer num;
    private String name;

    WeekDay() {
        this(0, "Sin asignar");
    }

    WeekDay(Integer num, String name){
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return getName();
    }
}