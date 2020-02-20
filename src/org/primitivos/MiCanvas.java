package org.primitivos;
import javax.swing.*;
import java.awt.*;

public class MiCanvas extends  JComponent{

    public void init(){
        this.un_circulo = new Circulo("circulo", 30);
        this.un_triangulo = new Triangulo("triangulo", 100,100,100);
    }

    private Triangulo un_triangulo;
    private Circulo un_circulo;

    @Override
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void paintComponent(Graphics g){
        if(un_circulo.EsValido()){
            un_circulo.Dibujar(this);
        }

        update(g);
    }
}
