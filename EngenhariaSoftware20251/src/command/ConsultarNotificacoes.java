package command;

import observer.Observer;
import trabalho.Repositorio;

public class ConsultarNotificacoes implements Comando {
	
	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Observer observer = (Observer) repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		observer.consultarNotificacoes();
		System.out.println("ntf realizada!");
	}
}
