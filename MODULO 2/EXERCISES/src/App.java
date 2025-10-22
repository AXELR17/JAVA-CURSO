import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        //oldMethod();
        animalSample();
        }

        private static void animalSample() {
            Animal animal1 = new Dog(" Buddy", 10, "Labrador");
            System.out.println(" Nombre " + animal1.getName());
            animal1.makeNoise();
            ((Dog)animal1).eat(" Concentrado");
            ((Dog)animal1).bark();
            animal1.sleep();
           
            Cat animal2 = new Cat("Garfiel", 5);
            System.out.println(" Nombre " + animal2.getName());
            animal2.makeNoise();
            animal2.eat(" Ratones");
            animal2.scratch();
            animal2.sleep();

        }



    private static void oldMethod() {
        var book1 = new Book();
        var book2 = new Book("Programación en Java", "Pedro Martinez" , 900);
        var book3 = new Book("Learn English", "Jhon Doe", 500, 
                    LocalDate.of(2015,10,21), 
                    "English School", "Learning");

                    System.out.println(book1.giveMeYourTitle());
                  
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        var person = new Person("Cesar", "Rodriguez");
    }
}
