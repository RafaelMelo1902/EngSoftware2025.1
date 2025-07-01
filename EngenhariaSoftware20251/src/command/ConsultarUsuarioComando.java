package command;

import trabalho.Usuario;
import trabalho.Repositorio;

public class ConsultarUsuarioComando implements Comando {

	@Override
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
				
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		usuario.consultarUsuario();
		System.out.println("usu realizada!");
	}

}
