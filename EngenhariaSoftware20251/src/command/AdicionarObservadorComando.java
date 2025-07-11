package command;

import observer.Observer;
import trabalho.Livro;
import trabalho.Repositorio;


public class AdicionarObservadorComando implements Comando {

	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Observer observer = (Observer) repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		livro.registerObserver(observer);
		System.out.println("obs realizada!");
	}

}
