package command;

import java.util.Date;
import trabalho.Emprestimo;
import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Usuario;
import trabalho.Exemplar;

public class DevolverComando implements Comando {

	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		for (Emprestimo emprestimo : usuario.getEmprestimosAtuais()) {
			Exemplar exemplar = emprestimo.getExemplar();
			if(exemplar.getLivro() == livro) {
				exemplar.setEmprestimo(null);
				exemplar.setDisponivel(true);
				emprestimo.setDiaDevolucao(new Date());
				usuario.atualizarEmprestimos(emprestimo);
				System.out.println("dev realizada!");
				return;
			}
		}
		
		
		
	}

}
