
public class Exemplar {
	private Livro livro;
	private String codigo;
	private Emprestimo emprestimo;
	private boolean disponivel;
	
	
	public Exemplar(Livro livro, String codigo) {
		this.livro = livro;
		this.codigo = codigo;
		this.disponivel = true;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	
}
