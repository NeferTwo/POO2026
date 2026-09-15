package Talleres.Taller01;

public class TermometroTest {
    public static void main(String[] args) {
    termometro t = new termometro();

    if(t.setTemp(-100)==true){

        System.out.println("OK");
    } else{
        System.out.println("NO");
    }
    if(t.setTemp(200)==true){

        System.out.println("OK");
    } else{
        System.out.println("NO");
    }


        if(t.setTemp(73)==true){

        System.out.println("OK");
    } else{
        System.out.println("NO");
    }
}
}
