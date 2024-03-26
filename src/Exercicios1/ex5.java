package Exercicios1;
import java.util.Scanner;

public class ex5 {

	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int sH, nH;
		
		System.out.printf("Quanto você ganhar por hora?");
		sH = ler.nextInt();
		
		System.out.printf("Quantas horas você trabalhou este mês?");
		nH = ler.nextInt();
		
		System.out.printf("Você receberá %d,00 reais ao fim do mês.", (sH * nH));
	}
}