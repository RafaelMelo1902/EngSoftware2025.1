package regrasEmprestimo;
import console.Console;
import trabalho.Emprestimo;
import trabalho.Livro;
import trabalho.Reserva;
import trabalho.Usuario;

public class RegraUmEmprestimo implements IRegraEmprestimo {

	@Override
	public boolean verificaEmprestimo(Usuario usuario, Livro livro) {
		
		
		for(Emprestimo emprestimo : usuario.getEmprestimosAtuais()) {
			if (emprestimo.getExemplar().getLivro() == livro) {
				Console.InsucessoEmprestimoEmAndamento();
				return false;
			}
		}
		
		if (!livro.obterExemplaresDisponiveis().isEmpty()) {
			if(!usuario.verificaDevedor()) {
				if(usuario.getEmprestimosAtuais().size() < usuario.getLimiteEmprestimo()) {
					if (livro.getReservas().size() < livro.obterExemplaresDisponiveis().size()) {
						for(Reserva reserva : livro.getReservas()) {
							if (reserva.getUsuario() == usuario) {
								Console.InsucessoEmprestimoReservaAberta();
								return false;
							}
						}
						return true;
					}
					else {
						for( Reserva reserva : livro.getReservas()) {
							if (reserva.getUsuario() == usuario) {
								return true;
							}
						}
						Console.InsucessoEmprestimoReservasExemplares();
					}
				}
				else {
					Console.InsucessoEmprestimoLimiteEmprestimo();
				}
			}
			else {
				Console.InsucessoEmprestimoUsuarioDevedor();
			}
		}
		else {
			Console.InsucessoEmprestimoSemExemplar();
		}
		
		return false;
	}

}
