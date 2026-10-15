public class AlimentoBasico extends ItemFacturable {

    private static final double IVA_REDUCIDO = 0.105;

    public AlimentoBasico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * IVA_REDUCIDO;
    }

    @Override
    public String getCategoria() {
        return "Alimento básico";
    }
}