package ej2;

public class Papel implements Jugable {

	@Override
	public Resultado jugar(Jugable jugada) {
		return jugada.jugarContra(this);
	} 

	@Override
	public Resultado jugarContra(Piedra jugada) {
		return Resultado.VICTORIA;
	}

	@Override
	public Resultado jugarContra(Papel jugada) {
		return Resultado.EMPATE;
	}

	@Override
	public Resultado jugarContra(Tijera jugada) {
		return Resultado.DERROTA;
	}

	@Override
	public Resultado jugarContra(Lagarto jugada) {
		return Resultado.DERROTA;
	}

	@Override
	public Resultado jugarContra(Spock jugada) {
		return Resultado.VICTORIA;
	}

	

	

}
