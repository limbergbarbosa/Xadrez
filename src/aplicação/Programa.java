package aplicação;

import chess.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		

		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		IU.printBorda(partidaXadrez.getPeças());
	}
	
  
}
