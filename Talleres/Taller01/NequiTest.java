package Talleres.Taller01;

public class NequiTest {

    
    public static void main(String[] args) {
        Nequi cuenta = new Nequi("Carlos Ruiz");
 
        System.out.println(cuenta); // saldo inicial en cero
 
        cuenta.topUp(300000);    // válido
        cuenta.topUp(-100);       // inválido: monto no positivo
 
        cuenta.pay(150000);      // válido
        cuenta.pay(0);            // inválido: monto no positivo
        cuenta.pay(600_000);      // inválido: supera el límite de $500.000
        cuenta.pay(1000000);    // inválido: supera saldo y límite
 
        System.out.println(cuenta);
    }
}