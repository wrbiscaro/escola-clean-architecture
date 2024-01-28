package br.com.alura.escola.application.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;

// Use Case para a matricula de aluno
public class MatricularAluno {
	private final AlunoRepository alunoRepository;

	public MatricularAluno(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	// Use Case recebe os dados raw (json da view, do gateway, etc) em um DTO e converte para o objeto de dominio
	// O DTO esta com a responsabilidade de fazer a conversao, mas poderiamos fazer aqui tambem
	// Design Pattern "Command"
	public void executa(MatricularAlunoDto dados) {
		Aluno aluno = dados.criarAluno();
		alunoRepository.matricular(aluno);
	}
}
