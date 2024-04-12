package ClinicaPaciente;

public class Paciente {
	public static void main(String[] args) {
	
		dadosPaciente meuPaciente = new dadosPaciente("Marianasa", "27/02/2006", "F", "Premium","Sem alergias", "A+", "234");
		
		System.out.println("Dados do paciente");
		System.out.println(meuPaciente.getNome());
		System.out.println(meuPaciente.getDataNascimento());
		System.out.println(meuPaciente.getSexo());
		System.out.println(meuPaciente.getPlanoSaude());
		System.out.println(meuPaciente.getAlergia());
		System.out.println(meuPaciente.getTipoSanguineo());
		System.out.println(meuPaciente.getCodigo());		
		
		meuPaciente.setNome("Maria");
		meuPaciente.setDataNascimento("24/09/1965");
		meuPaciente.setSexo("F");
		meuPaciente.setTipoSanguineo("AB+");
		meuPaciente.setCodigo("876");
		
		System.out.println("Dados do paciente");
		System.out.println(meuPaciente.getNome());
		System.out.println(meuPaciente.getDataNascimento());
		System.out.println(meuPaciente.getSexo());
		System.out.println(meuPaciente.getPlanoSaude());
		System.out.println(meuPaciente.getAlergia());
		System.out.println(meuPaciente.getTipoSanguineo());
		System.out.println(meuPaciente.getCodigo());

	}
}
