package com.mycompany.teste2_faturamento_de_loja;

/**
 *
 * @author Mateus
 */
import java.util.Arrays;
public class Faturamentomensal {
    
    public static void main(String[] args) {
    // cria matriz com duas colunas e trinta linhas
    double[][] matriz = new double[30][2];
    
    // preenche matriz com dados fictícios
    for (int i = 0; i < 30; i++) {
      matriz[i][0] = i + 1; // dia do mês
      matriz[i][1] = Math.random() * 1000; // faturamento do dia
    }
       matriz[0][1] = 22174.16;
       matriz[1][1] = 24537.67;
       matriz[2][1] = 26139.61;
       matriz[3][1] = 0.0;
       matriz[4][1] = 0.0;
       matriz[5][1] = 26742.66;
       matriz[6][1] = 0.0;
       matriz[7][1] = 42889.22;
       matriz[8][1] = 46251.17;
       matriz[9][1] = 11191.47;
       matriz[10][1] = 0.0;
       matriz[11][1] = 0.0;
       matriz[12][1] = 3847.48;
       matriz[13][1] = 373.79;
       matriz[14][1] = 2659.75;
       matriz[15][1] = 48924.24;
       matriz[16][1] = 18419.26;
       matriz[17][1] = 0.0;
       matriz[18][1] = 0.0;
       matriz[19][1] = 35240.18;
       matriz[20][1] = 43829.17;
       matriz[21][1] = 1823.07;
       matriz[22][1] = 4355.06;
       matriz[23][1] = 13327.10;
       matriz[24][1] = 0.00;
       matriz[25][1] = 0.0;
       matriz[26][1] = 25681.83;
       matriz[27][1] = 1718.12;
       matriz[28][1] = 13220.495;
       matriz[29][1] = 8414.61;
       
    
    // encontra o menor e o maior faturamento do mês
    double menorFaturamento = matriz[0][1];
    double maiorFaturamento = matriz[0][1];
    double diaDomesMenor = matriz [0][0];
    double diaDomesMaior = matriz [0][0];
    double total = matriz[0][1];
    for (int i = 1; i < 30; i++) {
      if (matriz[i][1] < menorFaturamento) {
        menorFaturamento = matriz[i][1];
        diaDomesMenor = matriz[i][0];
      }
      if (matriz[i][1] > maiorFaturamento) {
        maiorFaturamento = matriz[i][1];
        diaDomesMaior = matriz[i][0];
        
      }
    }
    for (int i = 1; i < 30; i++) {
       total = matriz[i][1]++;
    }
    double media = total / 30;
    
    // exibe os resultados
    
    System.out.println("Menor faturamento do mês: R$ " + menorFaturamento +" dia: "+diaDomesMenor);
    
    System.out.println("Maior faturamento do mês: R$ " + maiorFaturamento+" dia: "+diaDomesMaior);
    for (int i = 1; i < 30; i++) {
      if(matriz[i][1] > media){
          System.out.println("Media mensal: "+media);
          System.out.println("este dia: "+matriz[i][0]+" teve media maior que a media mensal sendo : "+matriz[i][1]);
      }
    }
  }
}
