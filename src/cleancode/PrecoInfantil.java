package cleancode;

public class PrecoInfantil extends Preco {

	@Override
	int getPreco() {
		// TODO Auto-generated method stub
		return Filme.INFANTIL;
	}

	@Override
	double getValor(int diasAluguel) {
		double valor = 2;

		if (diasAluguel > 2)
			valor += (diasAluguel - 2) * 1.5;

		return valor;
	}

}
