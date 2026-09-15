package Talleres.Trabajo1;

public class StockTienda {


    private String name;
    private double price;
    private int stock;



    public StockTienda(String name, double price, int stock) {
        if (!setName(name)) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (!setPrice(price)) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        if (!setStock(stock)) {
            throw new IllegalArgumentException("La cantidad disponible no puede ser negativa.");
        }
    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }




    public boolean setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Nombre rechazado: no puede estar vacío.");
            return false;
        }
        this.name = name;
        return true;
    }




    public boolean setPrice(double price) {
        if (price <= 0) {
            System.out.println("Precio rechazado: debe ser mayor que cero.");
            return false;
        }
        this.price = price;
        return true;
    }


    
    public boolean setStock(int stock) {
        if (stock < 0) {
            System.out.println("Stock rechazado: no puede ser negativo.");
            return false;
        }
        this.stock = stock;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Producto[%s - Precio: %.2f - Stock: %d]", name, price, stock);
    }



}
