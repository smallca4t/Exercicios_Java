package ClinicaMedico;

public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco ("Rua Xuxa",845 , "Próximo ao Banco", "Bairro Maria", "Xique-Xique", "Bahia", 47400000);
		
		Medico medico = new Medico ("Dr. Aumir Costa", "Pediatra", "M", endereco, "34");
		
		System.out.println("Dados - Endereço");
		System.out.println(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getUf());
		System.out.println(endereco.getCep());
		System.out.println();
		
		System.out.println("Dados - Médico");
		System.out.println(medico.getNome());
		System.out.println(medico.getEspecialidade());
		System.out.println(medico.getSexo());
		System.out.println(medico.getEndereco().getRua()+","+medico.getEndereco().getNumero()+","+medico.getEndereco().getComplemento()+","+
							medico.getEndereco().getBairro()+","+medico.getEndereco().getCidade()+","+
							medico.getEndereco().getUf()+","+medico.getEndereco().getCep());//by GPT
		System.out.println(medico.getCodigo());
		System.out.println();
		
		
		endereco.setCidade("Salvador");
		medico.setEspecialidade("Clínico-Geral");
		
		System.out.println("Dados - Endereço");
		System.out.println(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getUf());
		System.out.println(endereco.getCep());
		System.out.println();
		
		System.out.println("Dados - Médico");
		System.out.println(medico.getNome());
		System.out.println(medico.getEspecialidade());
		System.out.println(medico.getSexo());
		System.out.println(medico.getEndereco().getRua()+","+medico.getEndereco().getNumero()+","+medico.getEndereco().getComplemento()+","+
							medico.getEndereco().getBairro()+","+medico.getEndereco().getCidade()+","+
							medico.getEndereco().getUf()+","+medico.getEndereco().getCep());//by GPT
		System.out.println(medico.getCodigo());
		System.out.println();

	}
}
