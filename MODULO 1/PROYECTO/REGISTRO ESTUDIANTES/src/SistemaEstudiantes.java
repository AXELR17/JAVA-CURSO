import java.util.Scanner;

public class SistemaEstudiantes {

     //====Estado del estudiante actual====
    private static String nombreEstudiante = null;
    private static double nota1 = 0.0;
    private static double nota2 = 0.0;
    private static double nota3 = 0.0;

    //Metodo Main
    public static void main(String[] args)  {
        var input = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();

            //Validar las opciones del menu
            while (!input.hasNextInt()) {
                System.out.println("Opción inválida. Ingrese un número del Menu: ");
                input.nextLine();
                System.out.print("Elija una opción: ");
                
            }
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1 -> registrarEstudiante(input);
            
                case 2 -> mostrarInfoEstudiante();

                case 3 -> {
                    if (nombreEstudiante == null){
                        System.out.println("No hay estudiante registrado para calcular el promedio.");
                    } else {
                        double promedio = calcularPromedioEstudiante();
                        System.out.printf("Promedio: %.2f%n", promedio);
                        System.out.println(esAprobado(promedio)? "Estado: APROBO": "Estado: REPROBO");
                    }

                }
                case 4 -> limpiarEstudiante();
                case 0 -> System.out.println("¡Hasta pronto!");

                default -> System.out.println("Opción inválida.");

            }
        } while (opcion !=0);

        input.close();
    }

    //MÉTODOS 

        //Calcular Promedio
        private static double calcularPromedioEstudiante() {
            return (nota1 + nota2 + nota3)/ 3.0; 
    }




    // Mostrar Informacion del Estudiante
    private static void mostrarInfoEstudiante() {
         if (nombreEstudiante == null){
                System.out.print("No hay datos del Estudiante registrados");
                return;
        }
            System.out.println("\n====Estudiante actual===");
            System.out.println("Nombre " + nombreEstudiante);
            System.out.printf(" Nota 1: %.2f%n", nota1 );
            System.out.printf(" Nota 2: %.2f%n", nota2 );
            System.out.printf(" Nota 3: %.2f%n", nota3 );
    }

     //=====Mostrar menu====
    private static void mostrarMenu(){
            
            System.out.print("""
                 ====Sistema de Registro de Estudiantes====

                1. Registrar datos de un estudiante
                2. Mostrar datos del estudiante actual
                3. Calcular promedio y aprobar/reprobar
                4. Limpiar datos del Estudiante
                0. Salir
                 Elije una opción:  """);

    } 

    // Registrar estudiante
     private static void registrarEstudiante(Scanner input){
            //Si ya hay un estudiante, pide confirmacion para sobreescribir
            if (nombreEstudiante != null){
                System.out.print("Ya hay un estudiante registrado. ¿Desea sobrescribir? (SI/NO): ");
                String respuesta = input.nextLine().trim().toUpperCase();
                if (!respuesta.equals("SI")){
                    System.out.println("Operación cancelada. Se mantienen los datos actuales.");
                    return;
                }
            }
            
        //Nombre
            String nombre;
            do {
                System.out.print("Ingrese el nombre del Estudiante: ");
                nombre = input.nextLine();
                if (!validarNombre(nombre)){
                    System.out.println("Nombre inválido. No puede estar vacío.");
                }
            }while(!validarNombre(nombre));
            nombreEstudiante = nombre;


        // Notas del estudiante
            System.out.print("Ingrese las notas del Estudiante");
            nota1 = leerNota(input, " Nota 1: ");
            nota2 = leerNota(input, " Nota 2: ");
            nota3 = leerNota(input, " Nota 3: ");

            System.out.println("Estudiante registrado correctamente");
        }


     // Validar nombre

        private static boolean validarNombre(String nombre) {
            return nombre != null && ! nombre.trim().isEmpty();
    }

    //Validar nota
    private static Boolean validarNota (double n){
            return n >=0 && n <=100;
    }

        
    //Metodo leer una nota valida
    private static double leerNota(Scanner input, String mensaje) {
        while(true){
            System.out.print(mensaje);
            if (input.hasNextDouble()) {
                double n = input.nextDouble();
                input.nextLine(); // limpiar salto de línea
                if (validarNota(n)) 
                return n;
                System.out.print("La nota debe estar entre 0 y 100. ");
            } else {
                System.out.print("Entrada inválida. Debe ser un número. ");
                input.nextLine(); // limpiar entrada inválida
            }
        }
    }
    

    // Reto: ¿Aprobó?
    private static boolean esAprobado(double promedio) {
        return promedio >= 60.0;
    }

    // Extra: limpiar datos
    private static void limpiarEstudiante() {
        nombreEstudiante = null;
        nota1 = nota2 = nota3 = 0.0;
        System.out.println("Datos limpiados. El sistema vuelve al estado inicial. ");
    }
}    
             
        

        

        




      
   
