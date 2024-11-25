abstract class ComponenteAscensor {
    private String nombre;  // Hacerlo privado para mejorar la encapsulación

    public ComponenteAscensor(String nombre) {
        this.nombre = nombre;
    }

    // Getter para acceder al valor de 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que deben implementar las clases hijas
    public abstract void operar();
}