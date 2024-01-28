package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.domain.aluno.SenhaEncryptor;

// Classe Service que faz a implementacao para criptografar e validar senhas usando MD5
public class SenhaEncryptorMD5 implements SenhaEncryptor {

	@Override
	public String criptografarSenha(String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validarSenha(String senhaCriptografada, String senha) {
		return senhaCriptografada.equals(this.criptografarSenha(senha));
	}

}
