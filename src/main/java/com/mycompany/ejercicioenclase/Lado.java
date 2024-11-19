/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioenclase;
import java.lang.Math;
/**
 *
 * @author estudiante
 */
public class Lado {
    private Punto punto1;
    private Punto punto2;

    public Lado() {
    }

    public Lado(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    
    public double CalcularLado(){
       double Lado1 = Math.sqrt(Math.pow(punto2.getCoordX()-punto1.getCoordX(), 2));
       double Lado2 = Math.sqrt(Math.pow(punto2.getCoordY()-punto1.getCoordY(), 2));
       double lado =Math.sqrt(Lado1+Lado2);
       return lado;
    }
}
