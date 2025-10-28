package com.devsenior.module2.java.app;

import com.devsenior.module2.java.config.WeekDay;
import com.devsenior.module2.java.model.security.User;
import com.devsenior.module2.java.model.security.UserRole;

public class App {
    public static void main(String[] args) throws Exception {
        //demoWeekDay();
        demoUser();
        System.out.println(false);
    }

    private static void demoUser(){
        var cesar = new User("Cesar", "cesar@email.com", "123456", true, UserRole.ADMIN);
        var jose = new User("Jose", "jose@email.com", "123456");

        cesar.deactivateUser();
        
        var userArray = new User[] { cesar, jose };

        for (int i = 0; i < userArray.length; i++) {
            var user = userArray[i];
            switch (user.getRole()) {
                case ADMIN:
                    System.out.printf("%s es el superusuario%n", user);    
                    break;
                case CLIENT:
                    System.out.printf("%s es el cliente preferido%n", user);    
                    break;
                case PROVIDER:
                    System.out.printf("%s es mi proveedor por defecto%n", user);    
                    break;
                case EMPLOYEE:
                    System.out.printf("%s no estas trabajando?%n", user);    
                    break;           
                case USER:
                    System.out.printf("%s que haces aqui?%n", user);    
                    break;           
            }
        }

        
    }

    private static void demoWeekDay() {
        WeekDay day = null;
        day = WeekDay.MYDAY;
        System.out.println();
        System.out.println();
        System.out.println(day);
        System.out.println(day.getNum());

        var appointmentDay = WeekDay.FRIDAY;
        System.out.println(appointmentDay);
    }
}