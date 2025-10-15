import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        var salir = false;
        var input = new Scanner(System.in);



        do {System.out.println("""
            
                .: Ejercicios del modulo 1:.
                =======================
                1. Verificar numero negativo
                9. Venta de camisas

                0. Salir

                Elija una opción:"""); 

            var opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    verificarNumero(input);
                    break;

                case 9:
                    VentaCamisas09(input);
                    break;

                case 0:
                    System.out.println("Hasta pronto!");
                    salir = true;
                   
                    break;
            
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
            while (!salir){
            System.out.println("\nPresione ENTER para continuar");
            input.nextLine(); 
            System.out.println();
            }



        } while (!salir);
        
        input.close();
        





    }



    private static void VentaCamisas09(Scanner input) {
     /*Un vendedor al por mayor de camisas ofrece diferentes 
     precios de acuerdo a la cantidad de unidades que le compren. 
     La siguiente tabla muestra la información:
     
     Unidades	Precio por unidad
     [1 - 50]	$50.000
     (50 - 100]	$45.000
     (100 - 150]	$40.000
     (150 - 200]	$35.000
     > 200	$25.000
     Escriba un programa que dado un número de camisas
     retorne el precio por unidad.   */ 
     int camisas;

     do {

        System.out.print("Por favor ingresa la cantidad de camisas: ");
        camisas = input.nextInt();
        input.nextLine();

        if (camisas > 0 ){

            break;
        }
        System.out.println("El numero de camisas debe ser positivo");

     } while (true);

     var precio = 0;

     if (camisas <= 50){
         precio = 50_000;
     } else if ( camisas <= 100){
        precio = 45_000 ; 
     } else if ( camisas <= 150){
        precio = 40_000 ;
     } else if (camisas <= 200){
        precio = 35_000 ;
     } else {
        precio = 25_000 ;
     }
     System.out.printf("El precio por unidad es %,d%n", precio);


   
     


    }



    

    private static void verificarNumero(Scanner input) {

        /*Escriba un programa que permita ingresar un número real e 
identifique si el número es negativo, positivo o cero. */


        System.out.print("Por favor ingrese el numero real a Evaluar: ");
        var real = input.nextDouble();
        input.nextLine();

        if (real== 0){
            System.out.println("El numero es cero");
        } else if (real < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
        
        

    }
}
