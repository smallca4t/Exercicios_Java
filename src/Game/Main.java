/*NOTAS: 
 * ESTE CÓDIGO APRESENTA PROBLEMAS!!!
 * 1-Mal funcionamento das ferramentas if, else, while;
 * 2-Mal desempenho do método sofrerDano, que só faz o calculo com a energia inicial;
 */

package Game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String nomeLut1;
		int energiaLut1;
		int forcaLut1;
		int golpesLut1;
		String nomeLut2;
		int energiaLut2;
		int forcaLut2;
		int golpesLut2;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("---Bem vindo ao jogo!!---");
		System.out.println("--------Jogadores--------");
		System.out.println("--------Jogador 1--------");
		System.out.println();
		System.out.print("Nome: ");
		nomeLut1 = ler.nextLine();
		System.out.print("Energia: ");
		energiaLut1 = ler.nextInt();		
		System.out.print("Força de ataque: ");
		forcaLut1 = ler.nextInt();
		System.out.println();
		System.out.println("--------Jogador 2--------");
		System.out.println();
		System.out.print("Nome: ");
		nomeLut2 = ler.next();
		System.out.print("Energia: ");
		energiaLut2 = ler.nextInt();		
		System.out.print("Força de ataque: ");
		forcaLut2 = ler.nextInt();
		System.out.println();
		System.out.println("-------------------------");
		
		while (energiaLut1 > 0 && energiaLut2 > 0){
			System.out.println();
			System.out.println("-----Partida Iniciada-----");
			System.out.println();
			System.out.println(nomeLut1+" aplicará quantos golpes?");
			golpesLut1 = ler.nextInt();
			System.out.println("-------------------------");
			System.out.println();
			System.out.println(nomeLut2+" aplicará quantos golpes?");
			golpesLut2 = ler.nextInt();
			System.out.println("-------------------------");
			
			Lutador lut1 = new Lutador(nomeLut1, energiaLut1, forcaLut1, golpesLut1);
			Lutador lut2 = new Lutador(nomeLut2, energiaLut2, forcaLut2, golpesLut2);
			
			int dano1 = lut1.fazerDano();
			int dano2 = lut2.fazerDano();

			System.out.println(nomeLut1+" levou um dano de "+dano2);
			lut1.sofrerDano(dano2);
			System.out.println(nomeLut2+" levou um dano de "+dano1);
			lut2.sofrerDano(dano1);
			
			System.out.println(nomeLut1+" energia: "+lut1.energia);
			System.out.println(nomeLut2+" energia: "+lut2.energia);
		} 
		
		if(energiaLut1 == 0 && energiaLut2 == 0) {
			System.out.println("EMPATE!");
		}else if(energiaLut1 <= 0){
			System.out.println(nomeLut2+"ganhou!!");
		}else{
			System.out.println(nomeLut1+"ganhou!!");
		}
		ler.close();
	}
}
