package Bonificacoes;

public class Programador extends InfoFuncionarios {
	public Programador(String nome,String cargo, double salario) {
		super(nome,cargo, salario);
	}
	
	public double calculoBonificacao() {
		double bonificacao = salario * 0.15;
		return bonificacao;
	}
}
