
import java.util.Scanner;

/* Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTORIA
 */
public class EjercicioCond2 {
    public static void main(String[] args) {
        int n;
        int e;
        double VALOR_HORA=5000,aumento,salario;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero de horas trabajadas a la semana: ");
        n=input.nextInt();
        aumento=VALOR_HORA*0.2;
        if (n<=40){
            salario=n*VALOR_HORA;
        } else {
            e = n-40;
            salario=(40* VALOR_HORA)+ (e)*(VALOR_HORA+aumento);
       }
        System.out.println("El salario semanal es: "+salario);
    }
}
