package q1;

public class Pessoa {
	private String nome;
	private double altura;
	private double peso;
	
	public double calcularIMC() {
		double imc = peso / (altura * altura);
		return imc;
	}
	/**
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("peso invalido");
		}
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("altura invalido");
		}
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("nome invalido")
		}
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
