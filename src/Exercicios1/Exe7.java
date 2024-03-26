package Exercicios1;

import java.util.Scanner;

public class Exe7 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nota;
		System.out.printf("Insira uma nota de 0 a 10: ");
		nota = ler.nextInt();
		
		while((nota > 10) || (nota < 0)){
			System.out.printf("Insira uma nota de 0 a 10: ");
			nota = ler.nextInt();
		}
		if((nota <= 10) || (nota >= 0)) {
			System.out.println("Finalizado!");
		}
	}
}