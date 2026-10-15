public class ServicioProfesional extends ItemFacturable {

    private static final double IVA = 0.21;
    private static final double RETENCION = 0.05;

    public ServicioProfesional(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        // IVA 21% + retención 5%
        return precioBase * (IVA + RETENCION);
    }

    @Override
    public String getCategoria() {
        return "Servicio profesional";
    }
}