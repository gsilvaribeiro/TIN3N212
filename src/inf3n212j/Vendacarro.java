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
public class Vendacarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float CustoF, ValorDis, imposto, ValorCons;
        System.out.println("--Sistema de vendas--");
        System.out.println("informe o custo de fábrica: ");
        CustoF = leia.nextFloat();
        ValorDis = CustoF * 0.28f;
        imposto = CustoF * 0.45f;
        ValorCons = CustoF + ValorDis + imposto;
        System.out.printf("valor ao consumidor:%.2f\n", ValorCons);
        
        
    }
    
}
