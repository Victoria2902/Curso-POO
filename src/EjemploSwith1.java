
import java.util.Scanner;

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
  public class EjemploSwith1 {
    public static void main(String[] args) {
        int opcion;
        Scanner in = new Scanner(System.in);
        System.out.println("Menú Areas");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.print("Escriba la opcion deseada: ");
        opcion = in.nextInt();

        switch (opcion) {
            case 1:
                int base, alt;
                System.out.println("Calculo del area del rectangulo:");
                System.out.print("Ingrese en valor de la base :");
                base = in.nextInt();
                System.out.print("Ingrese en valor de la altura :");
                alt = in.nextInt();
                int area = base * alt;
                System.out.println("El area del rectangulo es: " + area);
                break;
            case 2:
                int baseT, alturaT;
                System.out.println("Calculo del area del triangulo:");
                System.out.print("Ingrese en valor de la base :");
                baseT = in.nextInt();
                System.out.print("Ingrese en valor de la altura :");
                alturaT = in.nextInt();
                double areaT = (baseT * alturaT) / 2;
                System.out.println("El area del triangulo es: " + areaT);
                break;
            case 3:
                double radio;
                System.out.println("Calculo del area del circulo:");
                System.out.print("Ingrese en valor del radio :");
                radio = in.nextDouble();
                double areaC = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del circulo es: " + areaC);
                break;
            case 4:
                int baseTra, alturaTra, baseMayor, baseMenor;
                System.out.println("Calculo del area del trapecio:");
                System.out.print("Ingrese el valor de la base mayor :");
                baseMayor = in.nextInt();
                System.out.print("Ingrese el valor de la base menor :");
                baseMenor = in.nextInt();
                System.out.print("Ingrese el valor de la altura :");
                alturaTra = in.nextInt();
                double areaTra = ((baseMayor + baseMenor) * alturaTra) / 2;
                System.out.println("El area del trapecio es: " + areaTra);
                break;
            case 5:
                System.out.println("Salida");
                break;
            default:
                System.out.println("Opción equivocada");
        }
        System.out.println("Finaliza el switch...");
    }
}

