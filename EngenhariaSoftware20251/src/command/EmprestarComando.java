package command;
import java.util.Calendar;
import java.util.Date;
import trabalho.Livro;
import trabalho.Repositorio;
import trabalho.Reserva;
import trabalho.Usuario;
import trabalho.Emprestimo;
import trabalho.Exemplar;

public class EmprestarComando implements Comando {
	
	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Usuario usuario = repositorio.obterUsuarioPorCodigo(carregadorParametros.getParametroUm());
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroDois());
		
		boolean  podeEmprestar = usuario.verificaEmprestimo(livro);
		
		if(podeEmprestar) {
			for(Reserva reserva : livro.getReservas()) {
				if (reserva.getUsuario() == usuario) {
					usuario.removerReserva(reserva);
					livro.removerReserva(reserva);
					break;
					}
				}
			Exemplar exemplar = livro.obterExemplarDisponivel();
			
			Date hoje = new Date();
			Calendar cal = Calendar.getInstance();
		    cal.setTime(hoje);
		    cal.add(Calendar.DAY_OF_MONTH, usuario.getTempoEmprestimo());
		    Date dataDevolucao = cal.getTime();
		    
			Emprestimo emprestimo = new Emprestimo(usuario,exemplar, hoje, dataDevolucao);
			exemplar.setEmprestimo(emprestimo);
			exemplar.setDisponivel(false);
			usuario.adicionarEmprestimoAtual(emprestimo);
			
		}
		
		System.out.println("emp realizado!");
	}

}