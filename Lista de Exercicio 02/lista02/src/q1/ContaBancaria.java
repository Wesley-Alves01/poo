package q1;

public class ContaBancaria {
	private String numero;
	
	public void setNumero(String numero) {
		if (numero.trim().isEmpty()) {
			throw new IllegalArgumentException("Numero invalido");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}
	
	
	
}
