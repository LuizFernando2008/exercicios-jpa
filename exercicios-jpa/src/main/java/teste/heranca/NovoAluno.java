package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDao = new DAO<>();
		Aluno aluno1 = new Aluno(123L, "João");
		Aluno aluno2 = new Aluno(345L, "Maria");
		
		alunoDao.incluirAtomico(aluno1);
		alunoDao.incluirAtomico(aluno2);
		
		alunoDao.fechar();
	}
}
