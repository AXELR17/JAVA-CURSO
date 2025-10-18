import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var book1 = new Book();
        var book2 = new Book("Programación en Java", "Pedro Martinez" , 900);
        var book3 = new Book("Learn English", "Jhon Doe", 500, 
                    LocalDate.of(2015,10,21), 
                    "English School", "Learning");

                    System.out.println(book1.giveMeYourTitle());
                  
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        

        }
}
