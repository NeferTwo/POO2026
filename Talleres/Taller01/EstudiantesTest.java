package Talleres.Taller01;

public class EstudiantesTest {
    public static void main(String[] args) {

        Estudiantes estudiante = new Estudiantes("E-2024-01", "Ana Gómez", 4.0, 3.5, 4.8);
 
        System.out.println(estudiante);
 
//        estudiante.setName("Ana María Gómez"); // válido
        estudiante.setName("");                  //inválido: vacío
 
//        estudiante.setGrade2(4.5);   // válido
        estudiante.setGrade3(6.0);    //inválido: fuera de rango
        estudiante.setGrade1(-1.0);   //inválido: fuera de rango
 
        System.out.println(estudiante);
        System.out.printf("Promedio final: " + estudiante.average());
    }
}

