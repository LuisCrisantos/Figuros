package org.primitivos;

public class Puntos {
    Puntos(double x, double y){
        this._x = x;
        this._y = y;
    }
    private double _x;
    private double _y;

    public double GetX(){
        return this._x;
    }

    public double GetY(){
        return this._y;
    }
}


