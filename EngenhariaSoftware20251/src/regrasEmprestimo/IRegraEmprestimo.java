package regrasEmprestimo;
import trabalho.Livro;
import trabalho.Usuario;

public interface IRegraEmprestimo {
	
	public boolean verificaEmprestimo(Usuario usuario, Livro livro);

}
