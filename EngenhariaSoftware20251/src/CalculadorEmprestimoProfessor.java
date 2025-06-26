
public class CalculadorEmprestimoProfessor implements ICalculadorEmprestimo {

	@Override
	public boolean fazerEmprestimo(Usuario usuario, Livro livro) {
		if(livro.getExemplares().size() > 0) {
			if(!usuario.verificaDevedor()) {
				return true;
			}	
		}
		return false;
	}
	
}
