package tabuleiro;

public class Peça {

	protected Posição posicao;
	private Tabuleiro borda;

	public Peça(Tabuleiro borda) {

		this.borda = borda;
		posicao = null;
	}

	protected Tabuleiro getBorda() {
		return borda;
	}

}
