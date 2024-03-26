package MetodosJava;

import java.util.Scanner;

public class dobro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira o número desejado:");
		int n = ler.nextInt();
		
		int dobro = dobrarNumero(n);
		
		System.out.println("O dobro do número inserido é "+ dobro);
	}
	
	public static int dobrarNumero(int n) {
		int dobro = n * 2;
		return dobro;
	
	}
}