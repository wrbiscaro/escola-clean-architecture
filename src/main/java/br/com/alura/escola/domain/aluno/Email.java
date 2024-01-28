package br.com.alura.escola.domain.aluno;

// Conceito de Value Object, onde podemos ter varios objetos com o mesmo valor 
// Diferente da Entidade, onde cada objeto � unico (tem identificador)
public class Email {
	
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inv�lido!");
		}
		
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
}
