
package com.mycompany.faturamentopercentcidade;

/**
 *
 * @author Mateus
 */
public class Distribuidora {
    public static void main(String[] args) {
        double faturamentoTotal; 
        
        // faturamento mensal por estado
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outras = 19849.53;
        
        //calculo do faturamento total
        faturamentoTotal = SP + RJ + MG + ES + Outras;
        
        double percentSP = (SP / faturamentoTotal) * 100;
        double percentRJ = (RJ / faturamentoTotal) * 100;
        double percentMG = (MG / faturamentoTotal) * 100;
        double percentES = (ES / faturamentoTotal) * 100;
        double percentOutras = (Outras / faturamentoTotal) * 100;
        
        System.out.println("O PERCENTUAL REPRESENTATIVO DE CADA ESTADO E:");
        System.out.printf("SP : %.2f%%\n", +percentSP);
        System.out.printf("RJ : %.2f%%\n", +percentRJ);
        System.out.printf("MG : %.2f%%\n", +percentMG);
        System.out.printf("ES : %.2f%%\n", +percentES);
        System.out.printf("Outras: %.2f%%\n", +percentOutras);
    }
}

