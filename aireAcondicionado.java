public class aireAcondicionado{
    // Temperatura del agua
    private float temperatura;
    
    public aireAcondicionado(){
        temperatura = 15.0f;
    }
    public void subirTemperatura(){
        temperatura += 5.0f;
    }
    public void bajarTemperatura(){
        temperatura -= 5.0f;
    }
    public float getTemperatura(){
        return temperatura;       
    }
}