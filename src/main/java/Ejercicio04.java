/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Dougl
 */
public class Ejercicio04 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los grados Centigrados:");
        int n1 = sc.nextInt();
        double n2= 32+(9*n1/5);
        System.out.println(n1+" grados centigrados, es igual a : "+n2+" grados fahrenheit");
    }
}
