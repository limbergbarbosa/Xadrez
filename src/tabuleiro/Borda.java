package tabuleiro;

public class Borda {

	private int linhas;
	private int colunas;
	private Peça[][] peças;

	public Borda(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peça[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public Peça peça(int linha, int coluna) {
		return peças[linha][coluna];
	}

	public Peça peça(Posição p) {

		return peças[p.getLinha()][p.getColuna()];
	}

}
