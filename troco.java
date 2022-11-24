
public class troco {
    ECedula(double valor) {
		this.valor = valor;
	}
	private double valor;
	public double getValor() {
		return valor;
	}
}

private ECedula tipo;
private int quantidade;

public void adicionaQuantidade(int qtde) {
	quantidade += qtde;
}

public troco(ECedula tipo, int quantidade) {
	super();
	this.tipo = tipo;
	this.quantidade = quantidade;
}

public ECedula getTipo() {
	return tipo;
}

public int getQuantidade() {
	return quantidade;
}

@Override
public String toString() {
	return quantidade + " - " + tipo;
}   
}
