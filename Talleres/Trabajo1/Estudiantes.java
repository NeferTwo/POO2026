package Talleres.Trabajo1;

public class Estudiantes {
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 5.0;


    private final String studentId;
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;


    

    public Estudiantes(String studentId, String name, double grade1, double grade2, double grade3) {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("El código del estudiante no puede ser vacío.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío.");
        }

        this.studentId = studentId;
        this.name = name;


        if (!setGrade1(grade1) || !setGrade2(grade2) || !setGrade3(grade3)) {
            throw new IllegalArgumentException("Todas las calificaciones deben estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
        }
    }



    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }




    public boolean setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Nombre rechazado: no puede estar vacío.");
            return false;
        }
        this.name = name;
        return true;
    }

    public boolean setGrade1(double grade1) {
        if (!isValidGrade(grade1)) {
            System.out.println("Calificación 1 rechazada: debe estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
            return false;
        }
        this.grade1 = grade1;
        return true;
    }

    public boolean setGrade2(double grade2) {
        if (!isValidGrade(grade2)) {
            System.out.println("Calificación 2 rechazada: debe estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
            return false;
        }
        this.grade2 = grade2;
        return true;
    }

    public boolean setGrade3(double grade3) {
        if (!isValidGrade(grade3)) {
            System.out.println("Calificación 3 rechazada: debe estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
            return false;
        }
        this.grade3 = grade3;
        return true;
    }



    private boolean isValidGrade(double grade) {
        return grade >= NOTA_MINIMA && grade <= NOTA_MAXIMA;
    }


    
    
    public double average() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Estudiante[%s] %s - Notas: %.1f, %.1f, %.1f - Promedio: %.2f",
                studentId, name, grade1, grade2, grade3, average());
    }
}
