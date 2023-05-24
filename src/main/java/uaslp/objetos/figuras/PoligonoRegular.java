package uaslp.objetos.figuras;

import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class PoligonoRegular {
    private final int lados;
    private double lado;

    public PoligonoRegular(int lados) {
        this.lados = lados;
    }

    public PoligonoRegular(int lados, double lado){
        this(lados);
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return (getPerimetro() * getApotema()) / 2;
    }

    public double getPerimetro(){
        return lado * lados;
    }

    public double getApotema(){
        double theta = 360.0/(2*lados);
        theta = toRadians(theta);
        return lado/(2*tan(theta));

    }
}
