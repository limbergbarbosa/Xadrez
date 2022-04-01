package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peça[][] peças;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroExceções(" Erro ao criar tabuleiro, é necesario ao menos 1 linha e uma coluna ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peça[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peça peça(int linha, int coluna) {
		if (!posiçãoExiste(linha, coluna)) {
			throw new TabuleiroExceções(" Posição não existe no tabuleiro ");
		}
		return peças[linha][coluna];
	}

	public Peça peça(Posição p) {
		if (!posiçãoExiste(p)) {
			throw new TabuleiroExceções(" Posição não existe no tabuleiro ");
		}

		return peças[p.getLinha()][p.getColuna()];
	}

	public void ColocarPeça(Peça peça, Posição p) {

		if (existePeça(p)) {
			throw new TabuleiroExceções(" Existe uma peça nessa posição  " + p);
		}

		peças[p.getLinha()][p.getColuna()] = peça;
		peça.posicao = p;
	}

	private boolean posiçãoExiste(int linha, int coluna) {

		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posiçãoExiste(Posição p) {

		return posiçãoExiste(p.getLinha(), p.getColuna());
	}

	public boolean existePeça(Posição p) {
		if (!posiçãoExiste(p)) {
			throw new TabuleiroExceções(" Posição não existe no tabuleiro ");
		}

		return peça(p) != null;
	}
}
