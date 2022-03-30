package chess;

import tabuleiro.Borda;

public class PartidaXadrez {

	private Borda borda;

	public PartidaXadrez() {

		borda = new Borda(8, 8);
	}

	public PeçaXadrez[][] getPeças() {

		PeçaXadrez[][] mat = new PeçaXadrez[borda.getLinhas()][borda.getColunas()];

		for (int i = 0; i < borda.getLinhas(); i++) {
			for (int j = 0; j < borda.getColunas(); j++) {
				mat[i][j] = (PeçaXadrez) borda.peça(i, j);
			}
		}
		return mat;
	}
}
