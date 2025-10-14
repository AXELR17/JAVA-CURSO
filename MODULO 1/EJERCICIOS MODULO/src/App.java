import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        var salir = false;
        var input = new Scanner(System.in);



        do {System.out.println("""
            
                .: Ejercicios del modulo 1:.
                =======================
                1. Verificar numero negativo

                0. Salir
                
                Elija una opción:"""); 
            var opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    verificarNumero(input);
                    break;
                case 0:
                    
                    break;
            
                default:
                    System.out.println("Opción Incorrecta");


                    break;
            }



        } while (!salir);
        System.out.println("Hasta pronto!");
        input.close();





    }
/*Escriba un programa que permita ingresar un número real e 
identifique si el número es negativo, positivo o cero. */
    private static void verificarNumero(Scanner input) {
        System.out.print("Por favor ingrese el numero real a Evaluar: ");
        var real = input.nextDouble();

        if (real== 0){
            System.out.println("El numero es cero");
        } else if (real < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
        
        

    }
}
