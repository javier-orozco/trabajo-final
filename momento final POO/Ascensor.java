import java.util.Random;

public class Ascensor {
    private int pisoActual;
    private boolean puertasCerradas = true; 

    public Ascensor() {
        pisoActual = 1;  // El ascensor comienza en el piso 1
    }

    // Simulación del sensor de la puerta 
    private boolean detectarObstaculo() {
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        return probabilidad < 30; //probalidad que halla un obstaculo 
    }

    public void abrirPuertas() {
        System.out.println("La puerta está abriéndose...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("La puerta está completamente abierta.");
        puertasCerradas = false;
    }

    public void cerrarPuertas() {
        System.out.println("La puerta se está cerrando...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        // Verificar si hay un obstáculo usando el sensor
        if (detectarObstaculo()) {
            System.out.println("¡Sensor detectó un obstáculo! La puerta no puede cerrarse.");
            System.out.println("Intentando cerrar la puerta nuevamente...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            cerrarPuertas(); // Intentar cerrar las puertas nuevamente
        } else {
            System.out.println("La puerta está completamente cerrada.");
            puertasCerradas = true;
        }
    }

    public void mantenerPuertasAbiertas() {
        // Mostrar mensaje de puertas abiertas por unos segundos
        System.out.println("La puerta se mantendrá abierta por unos segundos...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}  // Espera de 2 segundos
        System.out.println("La puerta comenzará a cerrarse.");
        cerrarPuertas();  
    }

    public void moverA(int destino) {
        if (pisoActual != destino) {
            System.out.println("Ascensor en movimiento del piso " + pisoActual + " al piso " + destino);
            
            // Movimiento del ascensor de piso por piso
            while (pisoActual != destino) {
                if (pisoActual < destino) {
                    pisoActual++;
                } else {
                    pisoActual--;
                }
                System.out.println("Ascensor pasando por el piso " + pisoActual);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }

            // Después de llegar al destino, abrir las puertas
            System.out.println("Ascensor llegó al piso " + pisoActual);
            abrirPuertas();
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isPuertasCerradas() {
        return puertasCerradas;
    }
}