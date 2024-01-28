package br.com.alura.escola;

import java.util.Scanner;

import br.com.alura.escola.application.aluno.matricular.MatricularAluno;
import br.com.alura.escola.application.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.AlunoRepositoryMemory;

public class MatricularAlunoPorLinhaComando {

	// Metodo que recebe os dados via linha de comando e faz a matricula usando o Use Case
	// Tambem poderia ser feito via view, controller do Spring, etc
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
        System.out.print("Digite o nome: ");
        String nome = input.next();
        
        System.out.print("Digite o CPF: ");
        String cpf = input.next();
        
        System.out.print("Digite o e-mail: ");
        String email = input.next();

		MatricularAluno matricularAluno = new MatricularAluno(new AlunoRepositoryMemory());
		matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
		
		System.out.print("Aluno matriculado com sucesso!");
	}

}
