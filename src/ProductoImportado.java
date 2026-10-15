public class ProductoImportado extends ItemFacturable {

    private static final double IVA = 0.21;
    private static final double ARANCEL = 0.15;

    public ProductoImportado(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        // IVA 21% + arancel de importación 15%, ambos sobre el precio base
        return precioBase * (IVA + ARANCEL);
    }

    @Override
    public String getCategoria() {
        return "Producto importado";
    }
}