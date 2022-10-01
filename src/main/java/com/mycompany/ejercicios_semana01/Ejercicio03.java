/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana01;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio03 {
    
   private static Scanner sc;
public static void main(String[] args){
 
 double perimetro, area;
 double base = leerNumeroReal("Introduce la base del romboide: ");
 double altura = leerNumeroReal("Introduce la altura del romboide: ");
 perimetro = 2 * (base+altura);
 area = base * altura;
 
 System.out.printf("%nEl perímetro del romboide de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
 System.out.printf("%nEl área del romboide de base %.2f y altura %.2f es %.2f.", base, altura, area);
 }
 
 private static double leerNumeroReal(String s){
 sc = new Scanner(System.in);
 System.out.print(s);
 return sc.nextDouble();
 }
}

