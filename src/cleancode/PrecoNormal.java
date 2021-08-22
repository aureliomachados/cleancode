package cleancode;

public class PrecoNormal extends Preco {

	@Override
	int getPreco() {
		// TODO Auto-generated method stub
		return Filme.NORMAL;
	}

	@Override
	double getValor(int diasAluguel) {
		double valor = 1.5;

		if (diasAluguel > 3)
			valor += (diasAluguel - 3) * 1.5;
		return valor;
	}

}
