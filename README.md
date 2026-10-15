# Sistema de Facturación de Ítems

## Descripción

Este proyecto consiste en un sistema de facturación desarrollado en Java. Permite calcular impuestos y precios finales para diferentes categorías de ítems: productos importados, servicios profesionales y alimentos básicos.

El objetivo principal es aplicar programación orientada a objetos mediante clases abstractas, herencia y polimorfismo, utilizando reglas impositivas diferentes según la categoría de cada ítem.

## Funcionamiento

### Clase abstracta `ItemFacturable`

Representa la estructura común de todos los elementos que pueden facturarse.

**Atributos:**

* `nombre`: nombre del producto o servicio.
* `precioBase`: precio antes de aplicar los impuestos.

**Métodos principales:**

* `getNombre()`: devuelve el nombre del ítem.
* `getPrecioBase()`: devuelve el precio base.
* `calcularImpuesto()`: método abstracto que cada categoría implementa con su propia regla impositiva.
* `calcularPrecioFinal()`: suma el precio base y el impuesto calculado.
* `getCategoria()`: devuelve el nombre de la categoría correspondiente.

### Clase `ProductoImportado`

Representa un producto proveniente del exterior.

* Aplica un IVA del 21 % y un arancel de importación del 15 %.
* Calcula ambos porcentajes sobre el precio base.
* Devuelve la categoría "Producto importado".

### Clase `ServicioProfesional`

Representa un servicio profesional.

* Aplica un IVA del 21 % y una retención del 5 %.
* Calcula ambos porcentajes sobre el precio base.
* Devuelve la categoría "Servicio profesional".

### Clase `AlimentoBasico`

Representa un alimento básico.

* Aplica una tasa impositiva reducida del 10,5 %.
* Calcula el impuesto sobre el precio base.
* Devuelve la categoría "Alimento básico".

**Nota:** las tasas utilizadas son valores simulados para el ejercicio y no constituyen asesoramiento fiscal.

### Clase `Main`

Contiene el método principal del programa y administra los ítems mediante una lista de tipo `List<ItemFacturable>`.

El programa registra tres elementos de ejemplo:

* Notebook, con un precio base de $800.000.
* Consultoría contable, con un precio base de $150.000.
* Pack de harina y aceite, con un precio base de $12.000.

Para cada ítem, muestra su nombre, categoría, precio base, impuesto y precio final. Finalmente, calcula e imprime el total general de todos los elementos.

## Ejemplo de funcionamiento

El sistema calcula los importes aplicando las tasas definidas en cada clase.

| Ítem                    |     Precio base |        Impuesto |      Precio final |
| ----------------------- | --------------: | --------------: | ----------------: |
| Notebook                |     $800.000,00 |     $288.000,00 |     $1.088.000,00 |
| Consultoría contable    |     $150.000,00 |      $39.000,00 |       $189.000,00 |
| Pack de harina y aceite |      $12.000,00 |       $1.260,00 |        $13.260,00 |
| **Total general**       | **$962.000,00** | **$328.260,00** | **$1.290.260,00** |

Los valores se calculan sumando los impuestos correspondientes al precio base de cada ítem.

## Conceptos de programación utilizados

* **Clases abstractas:** `ItemFacturable` define los atributos y métodos comunes.
* **Herencia:** las tres categorías heredan de `ItemFacturable`.
* **Polimorfismo:** cada clase implementa su propia versión de `calcularImpuesto()` y `getCategoria()`.
* **Abstracción:** se establece una estructura común para todos los elementos facturables.
* **Sobrescritura de métodos:** se utiliza `@Override` para implementar los métodos abstractos.
* **Encapsulamiento:** las tasas impositivas se definen como constantes privadas.
* **Colecciones:** `ArrayList` permite almacenar distintos tipos de ítems en una misma lista.
* **Acumuladores:** una variable suma los precios finales para obtener el total general.
* **Formateo de salida:** `System.out.printf()` permite mostrar los importes con dos decimales.

## Tecnologías utilizadas

* Java.
* Programación Orientada a Objetos (POO).
* Colecciones de Java (`List` y `ArrayList`).
* IntelliJ IDEA como entorno de desarrollo.

## Ejecución

<img width="461" height="592" alt="image" src="https://github.com/user-attachments/assets/6912323a-ce95-48ae-8c6d-77595181eea8" />


## Conclusión

Este ejercicio demuestra cómo utilizar clases abstractas y polimorfismo para calcular precios e impuestos de diferentes categorías de manera organizada. La lógica común se concentra en `ItemFacturable`, mientras que cada subclase define sus propias reglas de cálculo.
