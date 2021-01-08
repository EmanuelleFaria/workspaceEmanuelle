package br.com.universidade.aplicacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Professor;
import br.com.universidade.modelo.Turma;
import br.com.universidade.modelo.Unidade;

public class AplicacaoUniversidade {

	public static void main(String[] args) {
		
		Turma Turma = new Turma(
				At.s("Sigla"),
				At.s("Período"),
				At.s("Sala"),
				new Aluno(
						At.i("Rm"),
						At.s("Fone"),
						At.s("Nome Aluno"),
						At.b("Ativo")
						),
				new Professor(
						At.s("Nome Professor"),
						At.f("Valor Hora"),
						At.s("Formacao"),
						At.s("Area"),
						At.s("email")
						),
				new Curso(
						At.s("Descricao"),
						At.i("Carga Horaria"),
						At.f("Valor"),
						new Unidade(
								At.s("Nome"),
								At.s("Bairro"),
								At.s("Telefone")
								)
						)
				
				);
		
		System.out.println(Turma.getProfessor().calcularSalario(40));
		System.out.println(Turma.getProfessor().getSaudacao());
		System.out.println(Turma.getAluno().getSaudacao());
		System.out.println(Turma.getCurso().getMensalidade());
		System.out.println(Turma.getResumo());
		

	}

}
