package com.example.ejsjava;

import java.util.ArrayList;
import java.util.List;

public class Punto {
    private double x, y;

    public Punto(){
        x=0.0;
        y=0.0;
    }

    public Punto(double newX, double newY){
        x=newX;
        y=newY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString(){
       return ("(" + this.x + ", " + this.y + ")");
    }

    public double distancia(Punto otro){
        double cateto1 = this.x - otro.getX();
        double cateto2 = this.y - otro.getY();
        double hipotenusa = Math.sqrt((Math.pow(cateto1,2)) + (Math.pow(cateto2,2)));
        return hipotenusa;
    }

    public static void main(String[] args) {
        Punto primero = new Punto();
        Punto segundo = new Punto(4.0,3.0);
        primero.setX(2.0);
        System.out.println(primero.getX() + ", " + primero.getY());
        System.out.println(primero.toString());
        System.out.println(primero.distancia(segundo));

        List<Punto> poligono = new ArrayList<>();
        poligono.add(new Punto(0,1));
        poligono.add(primero);
        poligono.add(segundo);
        poligono.add(new Punto(1,4));
        poligono.add(new Punto(1,2));

        double perimetro = 0;
        for (int i = 0; i<= poligono.size()-1; i++){
            if(i< poligono.size()-1){
                perimetro += poligono.get(i).distancia(poligono.get(i+1));
            }
            else{
                perimetro += poligono.get(i).distancia(poligono.get(0));
            }
        }
        System.out.println("perimetro: " + perimetro);
        System.out.println("lado medio: " +perimetro/ poligono.size());

    }
}


