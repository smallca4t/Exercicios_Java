package Bonificacoes;

import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Menu {
		
	public static void main(String[] args) {//método principal

		Scanner ler = new Scanner(System.in);

		InfoFuncionarios[] sofridos = new InfoFuncionarios[100];//cria array de tamanho 100 
		int opcao;
		int item = 0;//usa a variavel item para controlar a posição no array

		
		do {
			System.out.println("\n---Sistema de Bonificações---");
			System.out.println();
			System.out.println("1-Cadastro de funcionários.");
			System.out.println("2-Lista de Funcionarios.");
			System.out.println("0-Sair.");
			System.out.println();
			System.out.printf("Insira a opção desejada:");
			opcao = ler.nextInt();
			
			ler.nextLine();//limps buffer

			switch (opcao) {
			case 1:
				System.out.printf("\n1- Insira o nome do funcionário: ");
				String nome = ler.nextLine();
				System.out.printf("2- Insira o valor do salário do funcinário: ");
				double salario = ler.nextDouble();
				System.out.printf("3- Insira o cargo do funcionário: ");
				String cargo = ler.next();
				
                                                                                                                                                                                                         
				InfoFuncionarios funcionarios = null;//criação de objeto(InfoFuncionarios), de acordo com os cargos informados
				if (cargo.equalsIgnoreCase("Gerente")|| cargo.equalsIgnoreCase("gerente")) {
					funcionarios = new Gerente(nome,cargo,salario);//
				} else if (cargo.equalsIgnoreCase("Programador")) {
					funcionarios = new Programador(nome,cargo, salario);
				} else if (cargo.equalsIgnoreCase("Designer")) {
					funcionarios = new Designer(nome,cargo, salario);
				}

				sofridos[item] = funcionarios;
				item++;//adiciona o novo funcionario ao array sofridos, e ao item
				break;

			case 2://imprimir informações dos funcionarios cadastrados
				System.out.println("\nLista de Bonificações");
				for (int i = 0; i < item; i++) {
					System.out.println(sofridos[i]);
				}
				break;

			case 0:
				System.out.println("Fechando menu.");
				break;

			default:
				System.out.println("\nTente novamente");
			}
		} while (opcao != 0);
		
		ler.close();//fecha scanner
	}
}
