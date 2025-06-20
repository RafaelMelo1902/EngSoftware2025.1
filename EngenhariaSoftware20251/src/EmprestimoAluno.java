
public class EmprestimoAluno implements ICalculadorEmprestimo {

	@Override
	public boolean fazerEmprestimo(Usuario usuario, Livro livro) {
		if (!livro.getExemplares().isEmpty()) {
			if(!usuario.verificaDevedor()) {
				//if(usuario.getLimiteEmprestimo){}?
				return true;
			}
		}
		
		return false;
	}

}
