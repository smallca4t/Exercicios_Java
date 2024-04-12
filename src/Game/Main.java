package Game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Lutador lutador1 = new Lutador("Ryu", 100, 10);
		Lutador lutador2 = new Lutador("Bison",100, 12);

		System.out.println("---Bem vindo ao jogo!!---");
		System.out.println("--------Jogadores--------");
		System.out.println("Nome:" + lutador1.getNome());
		System.out.println("Energia:"+lutador1.getEnergia());
		System.out.println("Força:"+lutador1.getForca());
		System.out.println("-------------------------");
		System.out.println("Nome:"+lutador2.getNome());
		System.out.println("Energia:"+lutador2.getEnergia());
		System.out.println("Força:"+lutador2.getForca());
		System.out.println("-------------------------");
		System.out.println("Golpes aplicados por Ryo: 8");
		System.out.println("Golpes aplicados por Bison: 3");
		System.out.println("-------------------------");
		
		for(int i = 0; i < 3;i++) {
			lutador1.aplicarGolpe(lutador2);
		}
		System.out.println("Energia de "+lutador2.getNome()+": "+lutador2.getEnergia());
		
		for(int i= 0; i < 8; i++){
			lutador2.aplicarGolpe(lutador1);
		}
		
		System.out.println("Energia de "+lutador1.getNome()+": "+lutador1.getEnergia());

	}
}
