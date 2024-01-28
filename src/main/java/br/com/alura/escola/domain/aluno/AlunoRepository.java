package br.com.alura.escola.domain.aluno;

import java.util.List;

// Inversao de dependencia, fornece uma interface para implementacao da camada de infra
public interface AlunoRepository {
	void matricular(Aluno aluno);
	Aluno buscarPorCPF(CPF cpf);
	List<Aluno> listarMatriculados();
}
