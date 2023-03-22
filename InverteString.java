
package com.mycompany.inverterstring;

/**
 *
 * @author Mateus
 */
public class InverteString {
    public static void main(String[] args) {
        String original = "Matheus de Sousa Pinho"; 
        
        char[] caracteres = original.toCharArray();
        //Inversão
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        
        String invertida = new String(caracteres);
        
        // Resultado
        System.out.println(invertida);
    }
}

