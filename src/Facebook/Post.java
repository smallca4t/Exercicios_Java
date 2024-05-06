package Facebook;

public record Post(String texto,String link,int numeroCurtidas, int numeroCompartilhamentos ) {

		public void curtir(int numeroCurtidas) {
				numeroCurtidas++;
		}
		
		public void compartilhar(int numemeroCompartilhamentos) {
				numemeroCompartilhamentos++;
		}
}
