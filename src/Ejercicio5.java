
import java.util.Scanner;
/*Crear un programa que pide dos valores, el nombre y la edad de una persona, y escribe en consola
“me llamo XXX y tengo FF años”
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre=input.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
