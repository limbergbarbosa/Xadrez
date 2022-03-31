package chess.peça;

import chess.Color;
import chess.PeçaXadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PeçaXadrez {

	public Torre(Tabuleiro borda, Color color) {
		super(borda, color);
	}

	@Override
	
	public String toString() {
		
		return " T ";
	}
}
