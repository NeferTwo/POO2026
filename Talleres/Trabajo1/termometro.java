package Talleres.Trabajo1;

public class termometro {
    private float temp;

    public float getTemp(){
        return temp;

    }

    public boolean setTemp(float newTemp){
        if (newTemp>=-50&&temp<=100){
            temp= newTemp;
            return true;
        }
        else{
            return false;
        }
    }
    


}
