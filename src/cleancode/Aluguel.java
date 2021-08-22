package cleancode;


public class Aluguel {

	private Filme filme;

	private int diasAluguel;

	public Aluguel(Filme filme, int diasAluguel) {
		super();
		this.filme = filme;
		this.diasAluguel = diasAluguel;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setDiasAluguel(int diasAluguel) {
		this.diasAluguel = diasAluguel;
	}

	public int getDiasAluguel() {
		return diasAluguel;
	}

	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	public double getValor() {
		return filme.getPreco();
	}

	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	int getPontos() {
		return filme.getPontos(diasAluguel);
	}
}
