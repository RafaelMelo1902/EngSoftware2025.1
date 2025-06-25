
public class CalculadorEmprestimoGraduacao implements ICalculadorEmprestimo {

	@Override
	public boolean fazerEmprestimo(Usuario usuario, Livro livro) {
		
		
		for(Emprestimo emprestimo : usuario.getEmprestimosAtuais()) {
			if (emprestimo.getExemplar().getLivro() == livro) {
				return false;
			}
		}
		
		if (!livro.getExemplares().isEmpty()) {
			if(!usuario.verificaDevedor()) {
				if(usuario.getEmprestimosAtuais().size() <= 2) {
					if (livro.getReservas().size() < livro.getExemplares().size()) {
						for(Reserva reserva : livro.getReservas()) {
							if (reserva.getUsuario() == usuario) {
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
					}
				}
			}
		}
		
		return false;
	}

}
