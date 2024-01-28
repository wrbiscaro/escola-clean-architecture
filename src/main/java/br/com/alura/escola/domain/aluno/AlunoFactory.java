package br.com.alura.escola.domain.aluno;

// Factory (padrao Builder e nao Factory Method) para facilitar a criacao de alunos
public class AlunoFactory {

	private Aluno aluno;
	
	// Indica no nome a ordem dos parametros, para evitar confusao
	// Faz abstracao do construtor de Aluno, pois ele é complexo e envolve a criacao de outros objetos
	// Retorna a propria fabrica, para possibilitar a chamada de metodos encadeados (main comentado abaixo)
	public AlunoFactory comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public AlunoFactory comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar(){
		return this.aluno;
	}
	
	/*
	// Chamada de metodos encadeados
	public static void main(String[] args) {
		AlunoFactory fabrica = new AlunoFactory();
		
		Aluno aluno = fabrica.comNomeCPFEmail(null, null, null)
		.comTelefone(null, null)
		.comTelefone(null, null)
		.criar();
	}
	*/
}
