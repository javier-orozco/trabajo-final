import java.util.Scanner;
public class SistemaControl {
    private Ascensor ascensor;

    public SistemaControl(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public void mantenerPuertasAbiertas(Scanner scanner) {
        System.out.print("¿Desea mantener las puertas abiertas? (sí/no): ");
        String respuesta = scanner.next().toLowerCase();

        if (respuesta.equals("si")) {
            // Mostrar el mensaje que se mantendrán las puertas abiertas
            System.out.println("La puerta se mantendrá abierta por unos segundos...");
            // Simular las puertas abiertas por unos segundos sin mostrar los mensajes de apertura
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("La puerta comenzará a cerrarse.");
            ascensor.cerrar(); // Procede a cerrar las puertas
        } else {
            System.out.println("Cerrando las puertas inmediatamente...");
            ascensor.cerrar(); // Si no, cierra las puertas inmediatamente
        }
    }
}