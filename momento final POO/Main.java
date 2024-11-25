import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            Ascensor ascensor = new Ascensor();
            SistemaControl sistema = new SistemaControl(ascensor);

            // Llamar al ascensor
            System.out.print("Ingrese el piso desde donde llama el ascensor (1-5): ");
            int pisoLlamada = scanner.nextInt();
            while (pisoLlamada < 1 || pisoLlamada > 5) {
                System.out.print("Piso inválido. Ingrese un número entre 1 y 5: ");
                pisoLlamada = scanner.nextInt();
            }
            System.out.println("Llamando al ascensor al piso " + pisoLlamada);
            ascensor.moverA(pisoLlamada);

            // Solicitar el piso de destino
            System.out.print("Ingrese el piso de destino (1-5): ");
            int pisoDestino = scanner.nextInt();
            while (pisoDestino < 1 || pisoDestino > 5 || pisoDestino == pisoLlamada) {
                System.out.print("Piso inválido o igual al piso actual. Ingrese un número entre 1 y 5: ");
                pisoDestino = scanner.nextInt();
            }
            System.out.println("Seleccionando destino al piso " + pisoDestino);

            // Preguntar si se desea mantener las puertas abiertas
            sistema.mantenerPuertasAbiertas(scanner);

            // Mover al destino
            ascensor.moverA(pisoDestino);

            // Cerrando puertas al llegar al destino
            ascensor.cerrar(); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}}
