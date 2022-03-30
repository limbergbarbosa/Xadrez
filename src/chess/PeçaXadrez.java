package chess;

import tabuleiro.Borda;
import tabuleiro.Peça;

public class PeçaXadrez extends Peça {

	private Color color;

	public PeçaXadrez(Borda borda, Color color) {
		super(borda);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
}
