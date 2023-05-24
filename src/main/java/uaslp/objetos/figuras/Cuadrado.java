package uaslp.objetos.figuras;

public class Cuadrado {
    private double lado;

    public Cuadrado(){
        lado = 0;
    }

    public Cuadrado(double lado){
        this();
        this.lado = lado;
    }


    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }
    public double getArea() {
        return lado*lado;
    }
}
