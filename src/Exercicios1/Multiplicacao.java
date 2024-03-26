package Exercicios1;

import java.util.Scanner;

public class Multiplicacao {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.printf("Insira o primeiro número:");
			int n1 = ler.nextInt();
			
			System.out.printf("Insira o segundo número:");
			int n2 = ler.nextInt();
			
			int multiplicacao = multiplicar(n1, n2);
			
			System.out.printf("Resultado: "+ multiplicacao);
			}
		
			public static int multiplicar(int n1,int n2) {
				int multiplicacao = n1 * n2;
				return multiplicacao;
			}
	}

