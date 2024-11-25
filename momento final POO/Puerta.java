public class Puerta {
    protected boolean abierta;

    public Puerta() {
        this.abierta = false; // Inicia cerrada
    }

    // Método para abrir la puerta
    public void abrir() {
        System.out.println("La puerta se está abriendo...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        this.abierta = true;
        System.out.println("La puerta está completamente abierta.");
    }

    // Método para cerrar la puerta
    public void cerrar() {
        if (abierta) {
            System.out.println("La puerta se está cerrando...");
            try {
                Thread.sleep(2000); 
                // Simular detección aleatoria de obstáculo
                if (Math.random() < 0.3) { // 30% de probabilidad de detectar un obstáculo
                    System.out.println("¡Sensor detectó un obstáculo! La puerta no puede cerrarse.");
                    Thread.sleep(3000); // Espera de 3 segundos más antes de intentar de nuevo
                    System.out.println("Intentando cerrar la puerta nuevamente...");
                }
                Thread.sleep(4000); 
            } catch (InterruptedException e) {
                System.err.println("Error al cerrar la puerta");
            }
            abierta = false;
            System.out.println("La puerta está completamente cerrada.");
        }
    }

    // Verifica si la puerta está abierta
    public boolean estaAbierta() {
        return abierta;
    }
}