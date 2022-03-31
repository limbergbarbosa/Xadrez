package chess.peça;

import chess.Color;
import chess.PeçaXadrez;
import tabuleiro.Tabuleiro;

public class Rei extends PeçaXadrez {

	public Rei(Tabuleiro borda, Color color) {
		super(borda, color);
	}

	public String toString() {
		
		return " R ";
	}

}
