package ClinicaMedico;

public class Medico {
	private String nome;
	private String especialidade;
	private String sexo;
	private Endereco endereco;//by GPT
	private String codigo;
	
	public Medico(String nome, String especialidade, String sexo, Endereco endereco, String codigo) {
		
		this.nome = nome;
		this.especialidade = especialidade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
