
import java.util.Scanner;

/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class EjercicioCond1 {
    public static void main(String[] args) {
        int n;double subtotal,total,descuento,PRECIO_COMPUTADORA = 500;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de computadoras que vas a comprar: ");
        n=input.nextInt();
        subtotal = n*PRECIO_COMPUTADORA;
        if (n<5){
            descuento=0.10;
        } else if (n>=5 && n<10){
            descuento=0.20;
        } else {
            descuento=0.40;
        }
        total=subtotal*(1-descuento);
        System.out.println("El total de la compra sin descuento es: "+subtotal);
        System.out.println("El descuento aplicado es: "+descuento);
        System.out.println("El total de la compra con descuento es: "+total);
    }
}
