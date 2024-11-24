public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = true;
    }

    // Metodo para abrir la puerta
    public void abrir() {
        abierta = true;
        System.out.println("La puerta está abriéndose...");
        try {
            Thread.sleep(2000); // Simula el tiempo de apertura 2 segundos
        } catch (InterruptedException e) {
            System.err.println("Error al abrir la puerta");
        }
        System.out.println("La puerta está completamente abierta.");
    }

    // Método para cerrar la puerta
    public void cerrar() {
        if (abierta) {
            System.out.println("La puerta se está cerrando...");
            try {
                Thread.sleep(3000); // Simulacion de cierre de 3 segundos
                // Simular detección aleatoria de obstáculo
                if (Math.random() < 0.3) { // 30% de probabilidad de detectar un obstáculo
                    System.out.println("¡Sensor detectó un obstáculo! La puerta no puede cerrarse.");
                    Thread.sleep(3000); // Esperar 3 segundos más
                    System.out.println("Intentando cerrar la puerta nuevamente...");
                }
                Thread.sleep(4000); // Resto del tiempo de cierre
            } catch (InterruptedException e) {
                System.err.println("Error al cerrar la puerta");
            }
            abierta = false;
            System.out.println("La puerta está completamente cerrada.");
        }
    }

    //verificar si la puerta está abierta
    public boolean estaAbierta() {
        return abierta;
    }
}