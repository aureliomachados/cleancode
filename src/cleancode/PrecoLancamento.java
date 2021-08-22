package cleancode;

public class PrecoLancamento extends Preco {

	@Override
	int getPreco() {
		// TODO Auto-generated method stub
		return Filme.LANCAMENTO;
	}

	@Override
	double getValor(int diasAluguel) {
		return diasAluguel * 3;
	}

	@Override
	int getPontos(int diasAluguel) {
		if(diasAluguel > 1) {
			return 2;
		}
		else
		// TODO Auto-generated method stub
		return super.getPontos(diasAluguel);
	}

}
