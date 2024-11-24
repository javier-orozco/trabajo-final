import java.util.Scanner;

public class SistemaControl {
    private Ascensor ascensor;

    public SistemaControl(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public void mantenerPuertasAbiertas(Scanner scanner) {
        // Preguntar si desea mantener las puertas abiertas
        System.out.print("¿Desea mantener las puertas abiertas? (sí/no): ");
        String respuesta = scanner.next().toLowerCase();

        if (respuesta.equals("si")) {
            // Mantener las puertas abiertas por unos segundos
            ascensor.mantenerPuertasAbiertas();
        } else {
            // Si no se desea mantener las puertas abiertas, cerrarlas inmediatamente
            System.out.println("Cerrando las puertas inmediatamente...");
            ascensor.cerrarPuertas();
        }
    }
}