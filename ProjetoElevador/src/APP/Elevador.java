package APP;

public class Elevador {

	private int andarAtu; // atributos
	private int totalAnd;
	private int capacidade;
	private int qPessoas;

	public int getAndarAtu() {
		return andarAtu;
	}

	public void setAndarAtu(int andarAtu) {
		this.andarAtu = andarAtu;
	}

	public int getTotalAnd() {
		return totalAnd;
	}

	public void setTotalAnd(int totalAnd) {
		this.totalAnd = totalAnd;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getqPessoas() {
		return qPessoas;
	}

	public void setqPessoas(int qPessoas) {
		this.qPessoas = qPessoas;
	}

	public void inicializa(int capacidade, int totalAnd) { // inicializa os parametros
		this.capacidade = capacidade;
		this.totalAnd = totalAnd;
	}

	public void entra(int entrando) {// metodo para adicionar pessoas

		if (this.qPessoas + entrando <= this.capacidade) {
			this.qPessoas = this.qPessoas + entrando;
		}
	}

	public void sai(int saindo) { // metodo para retirar pessoas

		this.qPessoas = this.qPessoas - saindo;
	}

	public void sobe() { // metodo para subir o elevador

		if (this.andarAtu < 10) {
			this.andarAtu++;
		}
	}

	public void desce() { // metodo para descer o elevador

		if (this.andarAtu <= 10 && this.andarAtu > 0) {
			this.andarAtu--;
		}
	}
}