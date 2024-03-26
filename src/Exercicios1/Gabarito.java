package Exercicios1;

import java.util.Scanner;

	public class Gabarito {
				
		public static void main(String[] args) {
					
				String[] gabaritoAluno = new String[10];
				int nota = 0;
				        
				Scanner ler = new Scanner(System.in);
				        
				String[] gabaritoOficial = {"A","B","C","D","E","E","D","C","B","A"};

				for (int i = 0; i < gabaritoAluno.length; i++) {
				System.out.print("Digite a " + (i + 1) + "ª alternativa: ");
				gabaritoAluno[i] = ler.nextLine();
				}
				        
				for (int i = 0; i < gabaritoAluno.length; i++) {
				if (gabaritoAluno[i].equals(gabaritoOficial[i])) {
				nota++;
				}
			}
				      
				System.out.println("imprima" + gabaritoAluno);
				System.out.println("RESULTADO: " + nota);
						
				}
			}