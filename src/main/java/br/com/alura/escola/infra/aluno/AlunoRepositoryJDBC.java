package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.domain.aluno.Telefone;

// Classe Service que faz a implementacao para salvar alunos em BD usando JDBC
public class AlunoRepositoryJDBC implements AlunoRepository {

	private final Connection connection;
	
	public AlunoRepositoryJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		try {
			String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getCpf().getNumero());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail().getEndereco());
			ps.execute();
			
			sql = "INSERT INTO TELEFONE VALUES(?, ?)";
			ps = connection.prepareStatement(sql);
			
			for(Telefone telefone : aluno.getTelefones()) {
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());
				ps.execute();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
