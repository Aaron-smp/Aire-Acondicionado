public class aireAcondicionado{
    // Temperatura del agua
    private double temperatura;
    
    public aireAcondicionado(){
        temperatura = 15.0;
    }
    public void subirTemperatura(){
        temperatura += 5.0;
    }
    public void bajarTemperatura(){
        temperatura -= 5.0;
    }
    public double getTemperatura(){
        return temperatura;       
    }
}