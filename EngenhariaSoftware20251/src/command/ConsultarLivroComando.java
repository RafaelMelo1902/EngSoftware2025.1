package command;

import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Usuario;

public class ConsultarLivroComando implements Comando{

	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroUm());
		
		livro.ConsultarLivro();
	}

}
