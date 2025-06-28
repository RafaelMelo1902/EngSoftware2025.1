package command;

import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Usuario;

public class AdicionarObservadorComando implements Comando {

	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		livro.registerObserver(usuario);
		
	}

}
