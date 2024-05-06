package Facebook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Post[] postagens = new Post[30];
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		int posts = 0;
		
		do {
			System.out.println("/-/-/-/-/FACEBOOK/-/-/-/-/-/");
			System.out.println();
			System.out.println("1- Fazer um post");
			System.out.println("2- Ver outros posts");
			System.out.println("3- Sair");
			System.out.println();
			System.out.printf("Escolha: ");
			opcao = ler.nextInt();
		
			ler.nextLine();
		
			switch(opcao) {
			case 1:
				System.out.printf("Digite seu texto: ");
				String texto = ler.nextLine();
				System.out.printf("Insira uma URL: ");
				String link = ler.nextLine();
				
				Post novoPost = null;

					System.out.println("Curtir");
					String curtir = ler.nextLine();
					if(curtir.equalsIgnoreCase("sim")) {
						novoPost = new Post (texto, link, i, i);
						novoPost = new Post(texto, link, i, i);
						postagens[i].numeroCurtidas();
					}
					
					System.out.println("Compartilhar");
					String compartilhar = ler.nextLine();
					if(compartilhar.equalsIgnoreCase("sim")) {
						postagens[i].numeroCompartilhamentos();					
						}
				}
				
				postagens[posts] = novoPost;
				posts++;
				break;
				
			case 2:
				System.out.println("/-/-/-/-/-/FACEBOOK/-/-/-/-/-/");
				for(int i = 0; i < posts;i++) {
				System.out.println(postagens[i]);
				}
				break;
			
			}
		} while(opcao != 0);
		
		ler.close();
	}
}
