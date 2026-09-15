package Talleres.Taller01;

public class termometro {
    private float temp;

    public float getTemp(){
        return temp;

    }

    public boolean setTemp(float newTemp){
        if (newTemp>=-50 && newTemp<=100){
            temp= newTemp;
            return true;
        }
        else{
            return false;
        }
    }

}
