public class Boton {
    private boolean presionado;

    public Boton() {
        this.presionado = false;
    }

    public void presionar() {
        presionado = true;
        System.out.println("El botón ha sido presionado.");
    }

    public void reset() {
        presionado = false;
    }

    public boolean isPresionado() {
        return presionado;
    }
}
