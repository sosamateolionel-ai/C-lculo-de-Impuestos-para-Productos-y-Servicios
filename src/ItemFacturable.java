public abstract class ItemFacturable {

    protected String nombre;
    protected double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Cada categoría define su propia regla impositiva
    public abstract double calcularImpuesto();

    // Lógica común: se escribe una sola vez y todas las hijas la heredan
    public double calcularPrecioFinal() {
        return precioBase + calcularImpuesto();
    }

    // Etiqueta de la categoría, para el desglose
    public abstract String getCategoria();
}