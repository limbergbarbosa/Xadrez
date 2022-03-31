package chess;

import chess.peça.Rei;
import chess.peça.Torre;
import tabuleiro.Posição;
import tabuleiro.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro t;

	public PartidaXadrez() {

		t = new Tabuleiro(8, 8);
		iniciarPartida();
	}

	public PeçaXadrez[][] getPeças() {

		PeçaXadrez[][] mat = new PeçaXadrez[t.getLinhas()][t.getColunas()];

		for (int i = 0; i < t.getLinhas(); i++) {
			for (int j = 0; j < t.getColunas(); j++) {
				mat[i][j] = (PeçaXadrez) t.peça(i, j);
			}
		}
		return mat;
	}
	private void iniciarPartida() {
		
		t.ColocarPeça(new Torre(t,Color.BRANCO), new Posição(2, 1));
		t.ColocarPeça(new Rei(t, Color.NEGRO), new Posição(0, 4));
		t.ColocarPeça(new Rei(t, Color.BRANCO), new Posição(7, 4));

		
	}
}
