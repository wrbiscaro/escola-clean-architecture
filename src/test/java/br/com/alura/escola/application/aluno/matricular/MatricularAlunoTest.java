package br.com.alura.escola.application.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.infra.aluno.AlunoRepositoryMemory;

// Teste unitario do Use Case MatricularAluno
class MatricularAlunoTest {

	@Test
	void test() {
		// Como estamos usando o objeto concreto da camada de repository, acaba se tornando um teste de integracao
		// O ideal seria mockar o repository, para criar um teste unitario sem dependencia da camada de repository
		AlunoRepository alunoRepository = new AlunoRepositoryMemory();
		MatricularAluno useCase = new MatricularAluno(alunoRepository);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Wall", "111.111.111-11", "wall@wall.com");
		useCase.executa(dados);
		
		// Caso o repository fosse mockado, poderiamos ver se o teste deu certo usando o verify() do Mockito
		// Como ja estamos usando o repository concreto, vamos usá-lo para ver se o teste deu certo
		Aluno alunoMatriculado = alunoRepository.buscarPorCPF(new CPF("111.111.111-11"));
		
		assertEquals("Wall", alunoMatriculado.getNome());
		assertEquals("111.111.111-11", alunoMatriculado.getCpf().getNumero());
		assertEquals("wall@wall.com", alunoMatriculado.getEmail().getEndereco());
	}

}
