package Bonificacoes;

public abstract class InfoFuncionarios {
	
	public String nome;
	public String cargo;
	public double salario;
	
	public InfoFuncionarios(String nome,String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public double getSalario() { 
		return salario;
	}
	
	public abstract double calculoBonificacao();
	public double salarioTotal() {
		return salario + calculoBonificacao();	
	}
	
	public String toString() {
		return "\nNome: " + nome + 
				"\nCargo: "+ cargo + 
				"\nSalario: "+ salario+
				"\nSalário Bonificado: " + String.format("R$ %.2f", salarioTotal());
	}
}