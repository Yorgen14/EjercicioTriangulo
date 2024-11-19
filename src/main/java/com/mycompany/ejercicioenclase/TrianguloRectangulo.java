/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioenclase;

/**
 *
 * @author estudiante
 */
public class TrianguloRectangulo {
    private Lado lado1;
    private Lado lado2;
    private double hipotenusa;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(Lado lado1, Lado lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    
    }

    public Lado getLado1() {
        return lado1;
    }

    public void setLado1(Lado lado1) {
        this.lado1 = lado1;
    }

    public Lado getLado2() {
        return lado2;
    }

    public void setLado2(Lado lado2) {
        this.lado2 = lado2;
    }

  
    
    public double CalcularHipotenusa(){
        hipotenusa = Math.sqrt(Math.pow(lado1.CalcularLado(), 2)+Math.pow(lado2.CalcularLado(), 2));
                return hipotenusa;
    }
    
}
