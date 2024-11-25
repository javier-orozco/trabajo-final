import java.util.Random;

public class Puerta extends ComponenteAscensor {

    public Puerta() {
        super("Puerta");
    }

    
    public void operar() {
        System.out.println("La " + getNombre() + " está operando.");
    }

    public void abrirPuerta() {
        System.out.println("La " + getNombre() + " se está abriendo...");
    }

    public void cerrarPuerta() {
        System.out.println("La " + getNombre() + " se está cerrando...");

        // Simulación de sensor de obstáculos
        boolean obstaculoDetectado = detectarObstaculo();
        
        if (obstaculoDetectado) {
            System.out.println("¡Obstáculo detectado! La puerta se reabrirá para intentar cerrar nuevamente.");
            // Intentar cerrar de nuevo si hay un obstáculo
            cerrarPuerta();
        } else {
            System.out.println("La " + getNombre() + " está completamente cerrada.");
        }
    }

    // Método para simular la detección de obstáculos
    private boolean detectarObstaculo() {
        Random random = new Random();
        return random.nextInt(100) < 30;  // 30% de probabilidad de detectar un obstáculo
    }
}