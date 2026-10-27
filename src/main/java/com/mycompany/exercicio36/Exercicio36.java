package com.mycompany.exercicio36;


import java.util.Scanner;
import java.util.Arrays;

public class Exercicio36 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numeros = new int[20];
            
            // Leitura dos 20 números
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite um numero inteiro: ");
                numeros[i] = sc.nextInt();
            }
            
            // Ordena os números em ordem crescente
            Arrays.sort(numeros);
            
            // Mostra os números ordenados
            System.out.println("Numeros em ordem crescente:");
            
            for (int i = 0; i < 20; i++) {
                System.out.println(numeros[i]);
            }
        }
    }
}
