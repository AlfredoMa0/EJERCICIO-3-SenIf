/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO3SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Mayor;
        int Menor;
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingresa Valor 1:");
        Mayor = Entrada.nextInt();
        System.out.println("Ingresa Valor 2:");
        Menor = Entrada.nextInt();
        
        if (Mayor == Menor) {
            System.out.println("SON VALORES IGUALES ");
        }else if (Mayor > Menor) {
            System.out.println("Valor 1 Mayor, Valor 2 Menor");
        }else if (Mayor < Menor) {
            System.out.println("Valor 2 Mayor, Valor 1 Menor");
        }
        
    }
    
}
