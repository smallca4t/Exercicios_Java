package Exercicios1;

import java.util.Scanner;

public class Triangulo {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.printf("Insira os valores dos lados: \n");
		lado1 = ler.nextInt();
		lado2 = ler.nextInt();
		lado3 = ler.nextInt();
		
		boolean isTriangulo = ((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2);
		
		if(isTriangulo) {
			boolean isEquilatero = (lado1 == lado2 && lado1 == lado3);
			if(isEquilatero) {
				System.out.println("O triângulo é Equilátero!");
			}
			boolean isIsoceles = (lado1 == lado2 || lado1 == lado3 || lado2 == lado3);
			if(isIsoceles) {
				System.out.println("O triângulo é Isóceles!");
			}
			boolean isEscaleno = (lado1 != lado2 && lado2 != lado3);
			if(isEscaleno) {
				System.out.println("O triângulo é Escaleno!");
			}
		}
		else{
				System.out.println("Incapaz de formar um triangulo");
		}
	}
}