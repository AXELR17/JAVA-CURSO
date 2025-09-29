import java.util.Scanner;

public class SistemaRegistroEstudiantes {
    // Variables estáticas para almacenar los datos del estudiante actual
    private static String nombreEstudiante = "N/A";
    private static double nota1 = 0.0;
    private static double nota2 = 0.0;
    private static double nota3 = 0.0;

    // Método para mostrar el menú principal
    private static void mostrarMenu() {
        System.out.println("--- Sistema de Registro de Estudiantes ---");
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas del estudiante actual");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
    }

    // Método para registrar la información del estudiante
    private static void registrarEstudiante(Scanner scanner) {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        while (!validarNombre(nombre)) {
            System.out.println("Nombre inválido. Por favor, ingrese un nombre válido:");
            nombre = scanner.nextLine();
        }
        nombreEstudiante = nombre;

        System.out.println("Ingrese la primera nota (0-100):");
        nota1 = leerNota(scanner);

        System.out.println("Ingrese la segunda nota (0-100):");
        nota2 = leerNota(scanner);

        System.out.println("Ingrese la tercera nota (0-100):");
        nota3 = leerNota(scanner);
    }

    // Método auxiliar para leer y validar una nota
    private static double leerNota(Scanner scanner) {
        double nota = -1;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número:");
                scanner.next(); // Limpiar la entrada inválida
            }
            nota = scanner.nextDouble();
            if (!validarNota(nota)) {
                System.out.println("Nota inválida. Debe estar entre 0 y 100:");
            }
        } while (!validarNota(nota));
        scanner.nextLine(); // Limpiar el buffer
        return nota;
    }

    // Método para validar el nombre del estudiante
    private static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    // Método para validar una nota
    private static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 100;
    }

    // Método para mostrar la información del estudiante actual
    private static void mostrarInfoEstudiante() {
        if ("N/A".equals(nombreEstudiante)) {
            System.out.println("No hay datos de estudiante registrados.");
        } else {
            System.out.println("Nombre del estudiante: " + nombreEstudiante);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
        }
    }

    // Método para calcular el promedio de las notas
    private static double calcularPromedioEstudiante() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método principal que orquesta el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número:");
                scanner.next(); // Limpiar la entrada inválida
                mostrarMenu();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarEstudiante(scanner);
                    break;
                case 2:
                    mostrarInfoEstudiante();
                    break;
                case 3:
                    if ("N/A".equals(nombreEstudiante)) {
                        System.out.println("No hay datos de estudiante para calcular el promedio.");
                    } else {
                        double promedio = calcularPromedioEstudiante();
                        System.out.printf("El promedio de las notas es: %.2f%n", promedio);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
