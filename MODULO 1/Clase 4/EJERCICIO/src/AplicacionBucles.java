import java.util.Scanner;

/*El programa debe mostrar un menú de opciones al usuario en la consola. 
El menú debe incluir al menos las siguientes opciones:
Calcular Área de una Figura (sub-opción: Círculo o Rectángulo).
Calcular Edad Futura.
Verificar si un Número es Primo.
Salir del programa. */

public class AplicacionBucles {
    public static void main(String[] args)  {
       //Vamos a hacer el menu
       Scanner scanner = new Scanner(System.in);
       int opcion;

       do{
         System.out.println("====MENU OPCIONES===="); 
         System.out.println("1- Calcular Área de una Figura");
         System.out.println("2 -Calcular Edad Futura");
         System.out.println("3- Verificar si un Número es Primo");
         System.out.println("0- Salir del programa");

         opcion = scanner.nextInt();

         switch (opcion) {
            case 1:
                 //Subopciones, preguntar que figura desea calcular circulo o rectángulo
                 System.out.println("====Calcular Area====");
                 System.out.println("Elige una figura: ");
                 System.out.println("a- Circulo");
                 System.out.println("b- Rectángulo");
                 char figura = scanner.next().toLowerCase().charAt(0);

                 if (figura == 'a'){
                    //Area del circulo
                    double PI = 3.1416;
                    System.out.println("Ingresa el radio del circulo");
                    double radio = scanner.nextDouble();
                    double areaCirculo = PI * Math.pow(radio, 2);
                    System.out.printf("El area del circulo es: %.2f%n", areaCirculo);
                 } else if (figura == 'b') {
                    //Area del Rectángulo 
                    System.out.println("Ingresa la base del rectángulo");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa la altura del rectángulo");
                    double altura = scanner.nextDouble();
                    double areaRectangulo = base * altura;
                    System.out.printf("El area del Rectángulo es: %.2f%n", areaRectangulo);
                } else {
                    System.out.println("Opción de figura no valida");

                }
                break;
            case 2: 
                 //Calcular edad futura
                 System.out.println("Ingresa tu edad actual");
                 int edadActual = scanner.nextInt();
                 System.out.println("Cuantos vas a sumar a tu edad");
                 int anios =  scanner.nextInt();
                 int edadFutura = edadActual + anios;
                 System.out.println("Tu edad en " + anios + "años, sera " + edadFutura);
                 break;
            case 3 :
                 //Verificar si un numero es primo
                 System.out.println("Ingresa un numero entero");
                 int digito  =scanner.nextInt() ;
                  boolean esPrimo = true;

                    if (digito  <= 1) {
                        esPrimo = false;
                    } else {
                        for (int i = 2; i <= digito  / 2; i++) {
                            if (digito  % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }

                    if (esPrimo) {
                        System.out.println("El número " + digito  + " es primo.");
                    } else {
                        System.out.println("El número " + digito + " no es primo.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        scanner.close(); // Cerrar el scanner
    }
}

