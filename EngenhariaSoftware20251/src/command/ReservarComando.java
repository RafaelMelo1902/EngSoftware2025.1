package command;

import java.util.Date;

import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Reserva;
import trabalho.Usuario;

public class ReservarComando implements Comando{

	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		Reserva reserva = new Reserva(usuario, livro, new Date());
		usuario.adicionarReserva(reserva);
		livro.adicionarReserva(reserva);
		System.out.println("res realizado!");
	}

}
