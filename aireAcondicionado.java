public class aireAcondicionado{
    // Temperatura del agua
    private double temperatura;
    // Maximo de temperatura permitida
    private double max;
    // Minimo de temperatura permitida
    private double min;
    // Incremento sera la cantida de temperatura que aumente
    private double incremento;
    public aireAcondicionado(double temperaturaMax, double temperaturaMin){
        max = temperaturaMax;
        min = temperaturaMin;
        incremento = 5.0;
        temperatura = 15.0;
    }
    public void subirTemperatura(){
        if(temperatura < max){
            temperatura += incremento;
        }
        if(temperatura > max){
            temperatura = max;
        }
    }
    public void bajarTemperatura(){
        if(temperatura > min){
            temperatura -= incremento;
        }
        if(temperatura < min){
            temperatura = min;
        }
    }
    public void setIncremento(double newIncremento){
        if(newIncremento > 0){
            incremento = newIncremento;
        }
    }
    public double getTemperatura(){
        return temperatura;       
    }
}