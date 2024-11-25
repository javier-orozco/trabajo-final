public class Ascensor extends Puerta {
    private int pisoActual;

    public Ascensor() {
        super(); // Llama al constructor de la clase base (Puerta)
        pisoActual = 1; // Inicia en el primer piso
    }

    // Método para mover el ascensor a otro piso
    public void moverA(int destino) {
        if (pisoActual != destino) {
            System.out.println("Ascensor en movimiento del piso " + pisoActual + " al piso " + destino);
            while (pisoActual != destino) {
                if (pisoActual < destino) pisoActual++;
                else pisoActual--;
                System.out.println("Ascensor pasando por el piso " + pisoActual);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
            System.out.println("Ascensor llegó al piso " + pisoActual);
            abrir(); // Abre las puertas cuando llega al piso
        }
    }

    // Obtiene el piso actual del ascensor
    public int getPisoActual() {
        return pisoActual;
    }
}