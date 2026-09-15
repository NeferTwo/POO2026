package Talleres.Trabajo1;

public class Nequi {

 
    private static final double LIMITE_PAGO = 500_000.0;
 

    private final String owner; 
    private double balance;
 

    public Nequi(String owner) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("El propietario no puede ser vacío.");
        }
        this.owner = owner;
        this.balance = 0.0;
    }
 
 
    public String getOwner() {
        return owner;
    }
 
    public double getBalance() {
        return balance;
    }
 


    public boolean topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Recarga rechazada: el monto debe ser positivo.");
            return false;
        }
        balance += amount;
        System.out.printf("Recarga exitosa de %.2f. Nuevo saldo: %.2f%n", amount, balance);
        return true;
    }
 

    
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Pago rechazado: el monto debe ser positivo.");
            return false;
        }
        if (amount > LIMITE_PAGO) {
            System.out.printf("Pago rechazado: supera el límite máximo permitido por pago (%.2f).%n",
                    LIMITE_PAGO);
            return false;
        }
        if (amount > balance) {
            System.out.println("Pago rechazado: saldo insuficiente.");
            return false;
        }
        balance -= amount;
        System.out.printf("Pago exitoso de %.2f. Nuevo saldo: %.2f%n", amount, balance);
        return true;
    }
 
    @Override
    public String toString() {
        return String.format("Cuenta[Propietario: %s - Saldo: %.2f]", owner, balance);
    }
}