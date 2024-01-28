package br.com.alura.escola.domain.aluno;

public interface SenhaEncryptor {

	String criptografarSenha(String senha);
	boolean validarSenha(String senhaCriptografada, String senha);
}
