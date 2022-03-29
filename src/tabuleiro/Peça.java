package tabuleiro;

public class Peça {

	protected Posição posicao;
	private Borda borda;

	public Peça(Borda borda) {

		this.borda = borda;
		posicao = null;
	}

	protected Borda getBorda() {
		return borda;
	}

}
