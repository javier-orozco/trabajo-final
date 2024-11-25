public class Boton extends ComponenteAscensor {

    public Boton() {
        super("Botón");
    }

    @Override
    public void operar() {
        System.out.println("El " + getNombre() + " está funcionando.");
    }
    
    public void presionar() {
        System.out.println("El " + getNombre() + " ha sido presionado.");
    }
}