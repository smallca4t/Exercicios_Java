package Exercicios1;
import java.util.Scanner;

public class Exe4 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		int maior = 0;
		
		System.out.printf("Indique três números:\n");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if((a > b) && (a > c))
			maior = a;
		else if ((b > a) && (b > c))
			maior = b;
		else if((c > a) && (c > b))
			maior = c;
		
		System.out.printf("O maior número é %d", maior);
		
	}
}