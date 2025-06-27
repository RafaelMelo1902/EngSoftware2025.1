package regrasEmprestimo;
import console.Console;
import trabalho.Livro;
import trabalho.Usuario;

public class RegraDoisEmprestimo implements IRegraEmprestimo {

	@Override
	public boolean verificaEmprestimo(Usuario usuario, Livro livro) {
		if(livro.obterExemplaresDisponiveis().size() > 0) {
			if(!usuario.verificaDevedor()) {
				return true;
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
