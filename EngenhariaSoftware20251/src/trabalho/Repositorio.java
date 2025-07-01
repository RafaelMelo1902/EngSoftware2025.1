package trabalho;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Repositorio {
	
	private static Repositorio instancia;
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Livro> livros = new ArrayList<Livro>();
	
	private Repositorio() {
		inicializarDados();
	};
	
	public static Repositorio obterInstancia() {
		if (instancia == null)
			instancia = new Repositorio();
		return instancia;
	}
	
	public Usuario obterUsuarioPorCodigo(String codigo) {
	    for (Usuario usuario : usuarios) {
	        if (usuario.getCodigo().equals(codigo)) {
	            return usuario;
	        }
	    }
	    return null;
	}
	
	public Livro obterLivroPorCodigo(String codigo) {
		for (Livro livro : livros) {
			if (livro.getCodigo().equals(codigo)) {
				return livro;
			}
		}
		return null;
	}
	public void inicializarDados() {
        // Usuários
        usuarios.add(new AlunoGraduacao("123", "João da Silva"));
        usuarios.add(new AlunoPosgraduacao("456", "Luiz Fernando Rodrigues"));
        usuarios.add(new AlunoGraduacao("789", "Pedro Paulo"));
        usuarios.add(new Professor("100", "Carlos Lucena"));

        // Livros
        Livro l1 = new Livro("100", "Engenharia de Software", "Addison Wesley", "Ian Sommerville", "6ª", criarData(2000));
        Livro l2 = new Livro("101", "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7ª", criarData(2000));
        Livro l3 = new Livro("200", "Code Complete", "Microsoft Press", "Steve McConnell", "2ª", criarData(2014));
        Livro l4 = new Livro("201", "Agile Software Development, Principles, Patterns and Practices", "Prentice Hall", "Robert Martin", "1ª", criarData(2002));
        Livro l5 = new Livro("300", "Refactoring: Improving the Design of Existing Code", "Addison Wesley Professional", "Martin Fowler", "1ª", criarData(1999));
        Livro l6 = new Livro("301", "Software Metrics: A rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", "3ª", criarData(2014));
        Livro l7 = new Livro("400", "Design Patterns: Element of Reusable Object-Oriented Software", "Addison Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1ª", criarData(1994));
        Livro l8 = new Livro("401", "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional", "Martin Fowler", "3ª", criarData(2003));

        livros.addAll(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8));

        // Exemplares
        new Exemplar(l1, "01");
        new Exemplar(l1, "02");
        new Exemplar(l2, "03");
        new Exemplar(l3, "04");
        new Exemplar(l4, "05");
        new Exemplar(l5, "06");
        new Exemplar(l5, "07");
        new Exemplar(l7, "08");
        new Exemplar(l7, "09");
    }

    private static Date criarData(int ano) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, Calendar.JANUARY); // ou 0
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

}
