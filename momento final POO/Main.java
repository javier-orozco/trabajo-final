import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Ascensor ascensor = new Ascensor();
        Puerta puerta = new Puerta();

        // Empezar el ascensor en el piso 1
        System.out.println("El ascensor está en el piso 1.");

        // Solicitar al usuario el piso en el que está
        System.out.print("¿En qué piso te encuentras? (1-5): ");
        int pisoActual = scanner.nextInt();
        ascensor.llamarAscensor(pisoActual);

        // Preguntar al usuario a qué piso desea ir
        System.out.print("¿A qué piso deseas dirigirte? (1-5): ");
        int pisoDestino = scanner.nextInt();
        
        // Abrir las puertas
        puerta.abrirPuerta();

        // Preguntar al usuario si quiere mantener la puerta abierta
        System.out.print("¿Deseas mantener la puerta abierta por unos segundos? (Sí/No): ");
        scanner.nextLine();  // Limpiar buffer
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("La puerta permanecerá abierta por unos segundos.");
            try {
                Thread.sleep(2000);  // Simula la puerta abierta por 2 segundos
            } catch (InterruptedException e) {
                System.out.println("Error al esperar.");
            }
        }

        
        puerta.cerrarPuerta();

        
        ascensor.llevarAlPiso(pisoDestino);

        
        System.out.println("Las puertas se están abriendo...");
        puerta.abrirPuerta();

        
        puerta.cerrarPuerta();

        
        System.out.println("Proceso completado.");
        
        
        scanner.close();
    }
}