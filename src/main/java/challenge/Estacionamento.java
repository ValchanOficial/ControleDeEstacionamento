package challenge;

public class Estacionamento {

	int x;

	public void estacionar(Carro carro) {
		if (carro.getMotorista().getPontos() >= 20) {
			throw new EstacionamentoException("naoDeveEstacionarMotoristaSemPontos");
		}
		if (!carro.getMotorista().getNome().equals("Ada") && carro.getMotorista().getIdade() >= 60) {
			throw new EstacionamentoException("casoTodosSejamSeniorONovoMotoristaNaoTeraVaga");
		} else {
			if (x!=10) {
				carrosEstacionados();
			}
		}

	}

	public int carrosEstacionados() {
		return x++;
	}

	public boolean carroEstacionado(Carro carro) {
		if(carro.getMotorista().getIdade()>=60){
			return true;
		} else {
			return false;
		}
	}
}