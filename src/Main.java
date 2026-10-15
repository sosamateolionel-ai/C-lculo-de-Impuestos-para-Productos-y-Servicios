import java.util.ArrayList;
import java.util.List;

void main() {

    List<ItemFacturable> items = new ArrayList<>();

    items.add(new ProductoImportado("Notebook", 800000.0));
    items.add(new ServicioProfesional("Consultoría contable", 150000.0));
    items.add(new AlimentoBasico("Pack de harina y aceite", 12000.0));

    System.out.println("=== Desglose de precios ===");

    double totalGeneral = 0;

    for (ItemFacturable item : items) {
        System.out.println("\n" + item.getNombre() + " (" + item.getCategoria() + ")");
        System.out.printf("   Precio base : %12.2f%n", item.getPrecioBase());
        System.out.printf("   Impuesto    : %12.2f%n", item.calcularImpuesto());
        System.out.printf("   Precio final: %12.2f%n", item.calcularPrecioFinal());

        totalGeneral += item.calcularPrecioFinal();
    }

    System.out.println("\n----------------------------------");
    System.out.printf("TOTAL GENERAL: %.2f%n", totalGeneral);

}

