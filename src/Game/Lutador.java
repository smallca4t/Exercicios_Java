package Game;

public class Lutador {
	
	public String nome;
	public int energia;
	public int forca;	
	public int golpes;
	
	public Lutador(String nome, int energia, int forca, int golpes) {
		this.nome = nome;
		this.energia = energia;
		this.forca =forca;
		this.golpes = golpes;	
	}
	
	int fazerDano() {
		return forca * golpes;
	}
	
	void sofrerDano(int dano) {
		energia -= dano;
	}
}
	
