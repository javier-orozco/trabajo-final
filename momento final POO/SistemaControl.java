public class SistemaControl extends ComponenteAscensor {

    public SistemaControl() {
        super("Sistema de Control");
    }

    @Override
    public void operar() {
        System.out.println("El " + getNombre() + " está controlando el ascensor.");
    }

    public void verificarFuncionamiento() {
        System.out.println("El " + getNombre() + " está funcionando correctamente.");
    }
}