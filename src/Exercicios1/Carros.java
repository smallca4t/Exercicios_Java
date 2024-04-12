package Exercicios1;

import java.util.Scanner;

public class Carros {
	
	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
        
        int[] volumeDiario = new int [30];
        
        for(int i = 0; i < volumeDiario.length; i++) {
        	System.out.print("Digite a quantidade de carros do " + (i + 1) + "º:");
        	volumeDiario[i] = ler.nextInt();
        }
        
        int diaMaiorVolume = 0;
        int	maiorVolume = volumeDiario[0];
        
        for(int i = 1; i < volumeDiario.length; i++) {
        	if(volumeDiario[i] > maiorVolume) {
        		maiorVolume = volumeDiario[i];
        		diaMaiorVolume = i;
        	}
        }   
        System.out.printf("O dia com maior volume de carros foi o dia " + (diaMaiorVolume + 1) + " e seu volume foi de " + maiorVolume + " carros.");
	}
} 