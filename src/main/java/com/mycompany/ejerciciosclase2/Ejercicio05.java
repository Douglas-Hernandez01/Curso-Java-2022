/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclase2;
import java.util.Scanner;
/**
 *
 * @author Dougl
 */
public class Ejercicio05 {
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        int n1 = sc.nextInt();
        double longitud= 2*3.1416*n1;
        double calculo = 3.1416*n1;
        double area=Math.pow(calculo,2);
        System.out.println(" La Longitud de la circunferencia es "+longitud);
        System.out.println(" El area de la  circunferencia es "+ area);
        }
    
}
