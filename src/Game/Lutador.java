package Game;

public class Lutador {
	
	private String nome;
	private int energia;
	private int forca;	
	
	public Lutador(String nome, int energia, int forca) {
		this.setNome(nome);
		this.setEnergia(energia);
		this.setForca(forca);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public void reduzirEnergia(int golpes) {
		this.energia -= golpes;
		if(this.energia < 0) {
			this.energia =0;
		}
	}
	
	public void aplicarGolpe(Lutador adversario) {
		adversario.reduzirEnergia(this.forca);
	}
}
	
