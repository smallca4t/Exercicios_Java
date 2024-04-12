package ClinicaPaciente;

public class dadosPaciente {
	
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String planoSaude;
	private String alergia;
	private String tipoSanguineo;
	private String codigo;
	//ATRIBUTOS utilizados na ENCAPSULAÇÃO do estado do paciente.
	
	public dadosPaciente(String nome, String dataNascimento, String sexo, String planoSaude, 
						String alergia, String tipoSanguineo, String codigo) {
						//CONSTRUTOR iniciado, recebendo parâmetros para inicalizar os atributos.
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.planoSaude = planoSaude;
		this.alergia = alergia;
		this.tipoSanguineo = tipoSanguineo;
		this.codigo = codigo;
		//valores passados como parametros aos atributos.
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	//GETTERS = retorna o atributo
	//SETTERS = modifica o atributo
}
