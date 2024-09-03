
import java.util.Scanner;
//Crear un programa que pide un número por Scanner y escribe en consola “el numero es XX”
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero; //Debe ingresar numeros enteros
        System.out.println("Hola, ingrese un numero:");
        numero=input.nextInt();
        System.out.println("El numero es:" +numero);
    }
}
