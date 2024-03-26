package Exercicios1;

import java.util.Scanner;

public class Sanduiches {
			public static void main(String[] args) {
				Scanner ler = new Scanner(System.in);
				
				double queijo = 0.1;
				double presunto = 0.05;
				double hamburguer = 0.1;
				
				System.out.println("Insira a quantida de sanduíches pedidos: ");
				int sanduiches = ler.nextInt();
				
				double quantidadeQueijo = queijar(queijo, sanduiches);
				double quantidadePresunto = presuntar(presunto, sanduiches);
				double quantidadeHamburguer = hamburgar(hamburguer, sanduiches);
				
				System.out.printf("Serão necessários "+quantidadeQueijo+"Kg de queijo, "+quantidadePresunto+"kg de presunto e "+quantidadeHamburguer+"Kg de carne.");
				
			}
			public static double queijar(double queijo, int sanduiches) {
				double quantidadeQueijo = sanduiches * queijo;
				return quantidadeQueijo ;
				
			}
			public static double presuntar(double presunto, int sanduiches) {
				double quantidadePresunto = sanduiches * presunto;
				return quantidadePresunto;
			}
			public static double hamburgar(double hamburguer, int sanduiches) {
				double quantidadeHamburguer = sanduiches * hamburguer;
				return quantidadeHamburguer;
			}
	}
