package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;
import br.com.alura.escola.domain.aluno.CPF;

// Classe Service que faz a implementacao para salvar alunos em memoria
public class AlunoRepositoryMemory implements AlunoRepository{

	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().getNumero().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow();
	}

	@Override
	public List<Aluno> listarMatriculados() {
		return this.matriculados;
	}

}
