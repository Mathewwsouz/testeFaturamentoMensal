/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_tecnico;

import java.util.Arrays;

/**
 *
 * @author Mateus
 */
public class Sequencia_Fibonacci {
    public static String fibonacci(int n) {
        if (n <= 0) {
            return "O número informado não pertence à sequência de Fibonacci";
        }
        int[] sequence = new int[] {0, 1};
        
        while (sequence[sequence.length - 1] < n) {
            int nextNum = sequence[sequence.length - 1] + sequence[sequence.length - 2];
            sequence = Arrays.copyOf(sequence, sequence.length + 1);
            sequence[sequence.length - 1] = nextNum;
        }
        for (int i = 0; i < sequence.length; i++) {
            if (n == sequence[i]) {
                return "O número " + n + " pertence à sequência de Fibonacci";
            }
        }
        
        return "O número " + n + " não pertence à sequência de Fibonacci";
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(8)); 
        System.out.println(fibonacci(15));  
    }
}
