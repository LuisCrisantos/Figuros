package org.primitivos;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        /*Circulo mi_circulo = new Circulo("circulo",50);
        Triangulo mi_triangulo = new Triangulo("triangulo", 30, 30,30);

        if(mi_circulo.EsValido()){
            mi_circulo.Dibujar(new MiCanvas());
        }

        if(mi_triangulo.EsValido()){
            mi_triangulo.Dibujar(new MiCanvas());*/

        MiCanvas canvas = new MiCanvas();
        JFrame ventana = new JFrame("Canvas");
        ventana.getContentPane().add(canvas);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
