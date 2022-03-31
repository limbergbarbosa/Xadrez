package chess;

import tabuleiro.Tabuleiro;
import tabuleiro.Peça;

public class PeçaXadrez extends Peça {

	private Color color;

	public PeçaXadrez(Tabuleiro borda, Color color) {
		super(borda);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
}
