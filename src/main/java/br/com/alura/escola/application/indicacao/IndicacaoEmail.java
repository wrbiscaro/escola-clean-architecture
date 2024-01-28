package br.com.alura.escola.application.indicacao;

import br.com.alura.escola.domain.aluno.Aluno;

public interface IndicacaoEmail {
	void enviarParaIndicado(Aluno indicado);
}
