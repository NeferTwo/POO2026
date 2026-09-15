package Talleres.Taller01;

public class BankAccountTest{

        public static void main(String[] args) {
        BankAccount cuenta = new BankAccount("001-2024", "Juan Perez", 1000.0);

        System.out.println(cuenta);

        cuenta.deposit(500);      // valido
//        cuenta.deposit(-50);       invalido: monto <= 0

      cuenta.withdraw(300);     // valido
//        cuenta.withdraw(0);        invalido: monto <= 0
//        cuenta.withdraw(5000);     invalido: saldo insuficiente

        System.out.println(cuenta);
    }

}