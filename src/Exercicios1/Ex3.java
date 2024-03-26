package Exercicios1;
import java.util.Scanner; // 1. importando a classe Scanner

public class Ex3 {

  public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in); //Criando objeto scanner
	  int a, b;
	  
	  System.out.printf("INFORME O PRIMEIRO NÚMERO:");
	  a = ler.nextInt();
	  
	  System.out.printf("INFORME O SEGUNDO NÚMERO:");
	  b = ler.nextInt();
	  
	  System.out.printf("%d + %d = %d\n", a,b, (a + b));
  }
 
}

