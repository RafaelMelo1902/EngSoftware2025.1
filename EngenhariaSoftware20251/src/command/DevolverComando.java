package command;

import trabalho.Exemplar;
import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Usuario;

public class DevolverComando implements Comando {

	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		Exemplar exemplar = usuario.devolverLivro(livro);
		exemplar.setEmprestimo(null);
		exemplar.setDisponivel(true);
		
		
	}

}
