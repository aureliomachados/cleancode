package cleancode;

public abstract class Preco {

	abstract int getPreco();

	abstract double getValor(int diasAluguel);

	int getPontos(int diasAluguel) {
		return 1;
	}
}
