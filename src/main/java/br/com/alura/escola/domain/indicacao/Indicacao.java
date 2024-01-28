package br.com.alura.escola.domain.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.domain.aluno.Aluno;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataIndicacao;

	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
}
