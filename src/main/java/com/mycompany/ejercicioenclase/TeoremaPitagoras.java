/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioenclase;

/**
 *
 * @author estudiante
 */
public class TeoremaPitagoras {
    private Punto punto1;
    private Punto punto2;
    private Lado lado;
    private TrianguloRectangulo triangulo;
    
      public static void main(String[] args) {
      Punto punto1= new Punto(5.2,3.5);
      
      Punto punto2= new Punto(3.2,4.5);
      
      Lado lado1 = new Lado(punto1,punto2);
      Lado lado2= new Lado(punto1,punto2);
      
      lado1.CalcularLado();
      lado2.CalcularLado();
      TrianguloRectangulo triangulo =new TrianguloRectangulo(lado1,lado2);
      
          System.out.println("La hipotenusa del tringulo es : "+triangulo.CalcularHipotenusa());
      
      
    }
}
