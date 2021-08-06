/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaidentificador;

import java.util.Scanner;

/**
 * 
 * @author Estuardo Ramos
 */
public class PruebaCaracteres {
    
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        
        int num;
        
        System.out.println("Ingrese una cadena de texto; ");
        cadena = scanner.nextLine();
         num = cadena.length();
         char car[]=cadena.toCharArray();
         
         for (int i = 0; i < num; i++) {
             if(Character.isSpaceChar(car[i])){
                 int n=i-(i-1);
                 
             }
             if (Character.isLetter(car[i])){
                 System.out.println(car[i]+" Es un id");
             } else if (Character.isDigit(car[i])){
                 System.out.println(car[i]+" Es un numero");
             } else {
                 System.out.println(car[i]+" Es un simbolo");
             }
             
            
            
        }
         
        
        
    }

}
