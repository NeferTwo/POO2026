package Talleres.Trabajo1;

public class BankAccount {

    
    private final String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("El número de cuenta no puede ser vacío.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }



    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }



    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Depósito rechazado: el monto debe ser mayor que cero.");
            return false;
        }
        balance += amount;
        System.out.println("Depósito exitoso de: " + amount + " Nuevo saldo: " + balance);
        return true;
    }




    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Retiro rechazado: el monto debe ser mayor que cero.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Retiro rechazado: saldo insuficiente.");
            return false;
        }
        balance -= amount;
        System.out.printf("Retiro exitoso de %.2f. Nuevo saldo: %.2f%n", amount, balance);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Cuenta[%s] Titular: %s - Saldo: %.2f",
                accountNumber, accountHolder, balance);
    }
}