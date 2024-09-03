
import java.util.Scanner;
//Crear un programa que pide un nombre por Scanner y escribe en consola “buenas tardes, Sr XX”
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre ;
        System.out.println("ingresa tu nombre:");
        nombre=input.nextLine();
        System.out.println("Buenas Tardes, Sr " + nombre);
    }
}

