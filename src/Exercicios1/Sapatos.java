package Exercicios1;

import java.util.Scanner;

public class Sapatos {
			public static void main(String[] args) {	
						
				Scanner ler = new Scanner(System.in); 
					
				double[] valorSapatos = new double[50];
				
				for(int f = 0; f < valorSapatos.length; f++) {
					System.out.print("Digite o valor do " + (f + 1)+"º sapato:");
					valorSapatos[f] = ler.nextDouble();
				    System.out.println();

				}
				
				for (int f = 0; f < valorSapatos.length; f++) {
					double desconto = descontarValor(valorSapatos[f]);
				    double acrescimo = acrescentarValor(valorSapatos[f]);
				    
					System.out.println("Valor original do " + (f + 1) + "º sapato: R$" + valorSapatos[f]);
				    System.out.println("Valor com desconto: R$" + descontarValor(valorSapatos[f]));
				    System.out.println("Valor com acréscimo: R$" + acrescentarValor(valorSapatos[f]));
				    System.out.println();
				}
			}
			
			public static double descontarValor(double valor) {
				double porcentagem = valor * 0.05;
				return valor - porcentagem;
			}
			
			public static double acrescentarValor(double valor) {
				double porcentagem = valor * 0.05;
				return valor + porcentagem;
			}
		}
