package command;

import trabalho.Usuario;
import trabalho.Repositorio;

public class ConsultarNotificacoes implements Comando {
	
	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		usuario.consultarNotificacoes();
	}
}
