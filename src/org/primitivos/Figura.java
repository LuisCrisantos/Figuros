package org.primitivos;
import java.util.List;

public class Figura {
    Figura(String nombre){
        this._nombre = nombre;
        this._es_valido = false;
    }

    private String _nombre;
    protected boolean _es_valido;
    protected List<Puntos>_coordenadas;

    public boolean EsValido(){
        return this._es_valido;
    }

    public void Dibujar(MiCanvas donde){
        System.out.println("Dibujar Figura");
    }
}
