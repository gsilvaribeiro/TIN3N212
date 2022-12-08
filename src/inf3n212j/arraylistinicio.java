/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf3n212j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182120011
 */
public class arraylistinicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leia = new Scanner (System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size()); 
        
        
        nomes.add("Paulatejano");
        System.out.println("Depois de add valor");
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros:" + nomes.size());
        
        System.out.print(" Digite um nome:");
        nomes.add(leia.next());
          System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
          nomes.add(0,"Gabriel");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        
          nomes.add(3,"Severino");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        System.out.println(" Index de Paulatejano " + nomes.indexOf("Paulatejano"));
        boolean remove = nomes.remove("Paulatejano");
        System.out.println("Resultados depois de remover Paulatejano");
          System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        nomes.add("André");
        nomes.add("Silvano");
        nomes.add("Bagre");
        nomes.add("Godzilla");
         System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        
        Collections.sort(nomes);
        System.out.println(" Array ordenado");
        System.out.println("Nomes:" + nomes.toString());
        
}

}
