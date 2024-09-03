
import java.util.Scanner;
//Crear un programa que pide dos numero por Scanner y escribe en consola “los números son X e Y”
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1; int numero2;//Debe ingresar numeros enteros
        System.out.println("ingresa el primer numero:");
        numero1=input.nextInt();
        System.out.println("ingresa el segundo numero:");
        numero2=input.nextInt();
        System.out.println("Los numeros son:" +numero1+ " e " +numero2);
    }
}
