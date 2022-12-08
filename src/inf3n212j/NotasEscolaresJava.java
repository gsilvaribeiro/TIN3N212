/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212j;

import java.util.Scanner;

/**
 *
 * @author 182120011
 */
public class NotasEscolaresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];
        
        System.out.println(" Notas Escolares");
        for(int i = 0; i < 4; i++){
            System.out.print(" Digite a " + (i + 1) + "nota: ");
            notas[i] = leia.nextFloat();
            notas[4] += notas[i];
            
            }
          notas[4] = notas[4] / 4;
          System.out.print(" Sua média foi de " + notas[4]);
          if (notas[4] >= 7) {
              System.out.println(", Parabéns você aprovou");
          }else{
              System.out.println(", Infelizmente você não aprovou, seu BURRO !");
              
            
        }
    
    }
}
