package Bonificacoes;

public class Designer extends InfoFuncionarios {
	public Designer(String nome,String cargo, double salario) {
		super(nome,cargo,salario);
	}
	
	public double calculoBonificacao() {
		double bonificacao = salario * 0.12;
		return bonificacao;
	}
}
