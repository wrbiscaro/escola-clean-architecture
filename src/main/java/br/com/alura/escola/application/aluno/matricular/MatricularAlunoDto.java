package br.com.alura.escola.application.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.domain.aluno.Email;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}	
	
	// Responsabilidade do DTO receber os dados raw e retornar um objeto do dominio
	public Aluno criarAluno() {
		return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
	}
}
