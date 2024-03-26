package Exercicios1;
import java.util.Scanner;

public class Banco {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double il, db, cd;
		
		System.out.printf("Insira seu Saldo inicial: ");
		il = ler.nextDouble();
		
		System.out.printf("Insira seu total de créditos: ");
		cd = ler.nextDouble();
		
		System.out.printf("Insira seu total de débitos: ");
		db = ler.nextDouble();
		
		double total = totalSaldo(il, db, cd);
		
		if(total > 0) {
			System.out.println("Saldo positivo em R$"+total);
		}
		else if(total < 0) {
			System.out.println("Saldo negativo em R$"+total);
		}
		else {
			System.out.println("Saldo Zero");
		}
	}
	
	public static double totalSaldo(double il, double db, double cd) {
		double dif = (il + cd) - db;
		return dif;
	}
}