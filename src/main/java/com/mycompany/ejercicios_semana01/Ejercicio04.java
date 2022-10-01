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
public class Ejercicio04 {
    public static void main(String[] args) {
 Scanner ingreso=new Scanner(System.in); 
 double P, A, B, Bb, h, l1, l2, l3, l4;
 System.out.print("23. TRAPECIO - Mostrar el área y perímetro.\n\n"); 
 System.out.print("INGRESE BASE MAYOR : ");
 B = Double.parseDouble(ingreso.next());
 System.out.print("INGRESE BASE MENOR : ");
 Bb = Double.parseDouble(ingreso.next());
 System.out.print("INGRESE ALTURA : ");
 h = Double.parseDouble(ingreso.next()); 
 A = ((B * Bb) * h) / 2;
 System.out.println("ÁREA : " + A + " cm.");
 System.out.println(""); 
 System.out.print("INGRESE LADO 01 : ");
 l1 = Double.parseDouble(ingreso.next());
 System.out.print("INGRESE LADO 02 : ");
 l2 = Double.parseDouble(ingreso.next());
 System.out.print("INGRESE LADO 03 : ");
 l3 = Double.parseDouble(ingreso.next());
 System.out.print("INGRESE LADO 04 : ");
 l4 = Double.parseDouble(ingreso.next());
 P = l1 + l2 + l3 + l4;
 System.out.println("PERÍMETRO : " + P + " cm.");
 } 
}

    

