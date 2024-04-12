package Bonificacoes;

public class Gerente extends InfoFuncionarios {
	public Gerente(String nome,String cargo, double salario) {
		super(nome,cargo, salario);
	}
	
	public double calculoBonificacao() {
		double bonificacao = salario * 0.2;
		return bonificacao;
	}
}
