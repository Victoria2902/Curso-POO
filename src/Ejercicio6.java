
import java.util.Scanner;
/*Pide un nombre y una edad. Luego nos dice por consola: "El señor/a XXXXX hace YYYY años
que es mayor de edad".
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre; int MAYOR_DE_EDAD = 18;
        System.out.println("Ingresa tu nombre:");
        nombre=input.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();
        int resta = edad - MAYOR_DE_EDAD;
        System.out.println("El señor/a " + nombre + " hace " + resta + " años que es mayor de edad");
    }
}
