package Talleres.Trabajo1;

public class StockTiendaTest {
    

    public static void main(String[] args) {
        StockTienda producto = new StockTienda("Teclado mecánico", 150_000, 20);

        System.out.println(producto);

        producto.setName("Teclado mecánico RGB"); // válido
        producto.setName("");                      // inválido: se conserva el nombre anterior

        producto.setPrice(180_000); // válido
        producto.setPrice(0);       // inválido: se conserva el precio anterior
        producto.setPrice(-50);     // inválido: se conserva el precio anterior

        producto.setStock(15);  // válido
        producto.setStock(-5);  // inválido: se conserva el stock anterior

        System.out.println(producto);
    }
}