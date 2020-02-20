package org.primitivos;
import java.util.ArrayList;

public class Triangulo extends Figura {
    Triangulo(String nombre, double ladoa, double ladob, double ladoc){
        super(nombre);
        this._lado_a = ladoa;
        this._lado_b = ladob;
        this._lado_c = ladoc;
        this._angulo_a = 0;
        this._angulo_b = 0;
        this._angulo_c = 0;
        this._coordenadas = new ArrayList<Puntos>();
        this._es_valido = this.ValidarTriangulo();
    }

    private double _lado_a;
    private double _lado_b;
    private double _lado_c;
    private double _angulo_a;
    private double _angulo_b;
    private double _angulo_c;

    private boolean ValidarTriangulo(){
        return((this._lado_a + this._lado_b > this._lado_c) && (this._lado_b + this._lado_c > this._lado_a) && (this._lado_a + this._lado_c > this._lado_b));
    }

    public void SacarAngulos(){
        double anguloA = (Math.pow(this._lado_a,2) - Math.pow(this._lado_b,2) - Math.pow(this._lado_c,2) / (-2*this._lado_b*this._lado_c));
        this._angulo_a = Math.acos(anguloA * (180/Math.PI));
        System.out.println("Angulo A: "+ this._angulo_a);

        double anguloB = (Math.pow(this._lado_b,2) - Math.pow(this._lado_c,2) - Math.pow(this._lado_a,2) / (-2*this._lado_a*this._lado_c));
        this._angulo_b = Math.acos(anguloB * (180/Math.PI));
        System.out.println("Angulo B: "+ this._angulo_b);

        this._angulo_c = 180-(this._angulo_a + this._angulo_b);
        System.out.println("Angulo C: " + this._angulo_c);
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        System.out.println("Dibujar-Triangulo");
    }
}
