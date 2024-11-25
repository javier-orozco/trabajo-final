public class Ascensor extends ComponenteAscensor {

    public Ascensor() {
        super("Ascensor");
    }

    @Override
    public void operar() {
        System.out.println("El " + getNombre() + " está operando.");
    }

    public void llamarAscensor(int piso) {
        System.out.println("El " + getNombre() + " se está moviendo al piso " + piso + "...");
        // Simulación del movimiento entre pisos
        for (int i = 1; i <= piso; i++) {
            System.out.println("Pasando por el piso " + i);
        }
        System.out.println("El " + getNombre() + " ha llegado al piso " + piso + ".");
    }

    public void llevarAlPiso(int piso) {
        System.out.println("Llevando al piso " + piso + "...");
        // Simulación del movimiento entre pisos
        for (int i = 1; i <= piso; i++) {
            System.out.println("Pasando por el piso " + i);
        }
        System.out.println("El " + getNombre() + " ha llegado al piso " + piso + ".");
    }
}