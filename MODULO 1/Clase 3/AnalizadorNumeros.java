import java.util.Scanner;

/*Implementa un bucle (while o do-while) para mostrar un menú de opciones al usuario repetidamente hasta que elija salir.
El menú debe tener al menos las siguientes opciones:
1 - Analizar un solo número.
2 - Generar secuencia de números.
0 - Salir.
Lee la opción del usuario dentro del bucle. */

public class AnalizadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n===== Analizador de Números y Secuencias =====");
            System.out.println("1 - Analizar un solo número");
            System.out.println("2 - Generar secuencia de números");
            System.out.println("0 - Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Analizar un número
                    System.out.print("Ingresa un número entero: ");
                    int num = sc.nextInt();

                    // Positivo, negativo o cero
                    if (num > 0) {
                        System.out.println("El número es positivo.");
                    } else if (num < 0) {
                        System.out.println("El número es negativo.");
                    } else {
                        System.out.println("El número es cero.");
                    }

                    // Par o impar (usando operador ternario)
                    String paridad = (num % 2 == 0) ? "par" : "impar";
                    System.out.println("El número es " + paridad + ".");

                    // Comparación con 100
                    if (num > 100) {
                        System.out.println("El número es mayor que 100.");
                    } else if (num < 100) {
                        System.out.println("El número es menor que 100.");
                    } else {
                        System.out.println("El número es igual a 100.");
                    }
                    break;

                case 2:
                    // Generar secuencia de números
                    int inicio, fin;
                    do {
                        System.out.print("Ingresa el número inicial: ");
                        inicio = sc.nextInt();
                        System.out.print("Ingresa el número final: ");
                        fin = sc.nextInt();

                        if (inicio > fin) {
                            System.out.println("⚠️ El número inicial debe ser menor o igual al número final. Intenta de nuevo.");
                        }
                    } while (inicio > fin);

                    System.out.print("¿Deseas mostrar 'par' o 'impar'? ");
                    String preferencia = sc.next();

                    System.out.println("\nSecuencia generada:");
                    for (int i = inicio; i <= fin; i++) {
                        if (preferencia.equalsIgnoreCase("par") && i % 2 != 0) {
                            continue; // Saltar los impares
                        }
                        if (preferencia.equalsIgnoreCase("impar") && i % 2 == 0) {
                            continue; // Saltar los pares
                        }
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Adios!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
