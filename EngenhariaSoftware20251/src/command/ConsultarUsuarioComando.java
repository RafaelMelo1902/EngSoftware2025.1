package command;

import trabalho.Usuario;
import trabalho.Emprestimo;
import trabalho.Repositorio;
import trabalho.Reserva;

public class ConsultarUsuarioComando implements Comando {

	@Override
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
				
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		System.out.println("Emprestimos atuais:");
		for(Emprestimo emprestimo : usuario.getEmprestimosAtuais()) {
			System.out.println("		Titulo: " + emprestimo.obterTituloLivro() + 
					"\n		Data do emprestimo: " + emprestimo.getDiaEmprestimo() + 
					"\n		Status: em curso \n		Prazo de devolucao: " + emprestimo.getPrazoDevolucao());
			System.out.println("		================================================");
		}
		System.out.println("Emprestimos Passados:");
		for(Emprestimo emprestimo : usuario.getEmprestimosPassados()) {
			System.out.println("		Titulo: " + emprestimo.obterTituloLivro() + 
					"\n		Data do emprestimo: " + emprestimo.getDiaEmprestimo() + 
					"\n		Status: finalizado \n 		data de devolucao: " + emprestimo.getDiaDevolucao());
			System.out.println("		================================================");
		}
		System.out.println("Reservas:");
		for(Reserva reserva : usuario.getReservas()) {
			System.out.println("		Titulo: " + reserva.obterTituloLivro());
			System.out.println("		Data de Solicitacao da reserva: " + reserva.getDataReserva());
			System.out.println("		================================================");
		}
		System.out.println("usu realizada!");
	}

}
