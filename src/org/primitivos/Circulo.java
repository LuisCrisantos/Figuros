package org.primitivos;
import java.awt.*;
import java.util.ArrayList;


public class Circulo extends Figura{
    Circulo(String nombre, double radio){
        super(nombre);
        this._radio=radio;
        this._coordenadas= new ArrayList<Puntos>();
        this._es_valido = this.ValidarCirculo();
    }

    private double _radio;

    private boolean ValidarCirculo(){
        return (this._radio>0);
    }

    public double CalcularArea(){
        return Math.PI*(this._radio*this._radio);
    }

    public double CalcularPerimetro(){
        return (2*Math.PI)*this._radio;
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);

        System.out.println("Dibujar-Circulo");
        donde.getGraphics().setColor(Color.BLACK);
        donde.getGraphics().drawArc(100,100, 2*(int)this._radio, 2*(int)this._radio, 0, 360);

    }
}
