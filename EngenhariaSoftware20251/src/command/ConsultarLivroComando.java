package command;

import trabalho.Emprestimo;
import trabalho.Exemplar;
import trabalho.Livro;

import trabalho.Repositorio;
import trabalho.Reserva;

public class ConsultarLivroComando implements Comando{

	public void executar(CarregadorParametros carregadorParametros) {
		Repositorio repositorio = Repositorio.obterInstancia();
		
		Livro livro = repositorio.obterLivroPorCodigo(carregadorParametros.getParametroUm());
		
			System.out.println("Titulo: " + livro.getTitulo() + "\nQuantidade de reservas: " + livro.getReservas().size());
			for(Reserva reserva : livro.getReservas()) {
				System.out.println("---> " + reserva.getNomeUsuario());
			}
			System.out.println("Exemplares:");
			for(Exemplar exemplar : livro.getExemplares()) {
				System.out.println("---> Exemplar " + exemplar.getCodigo()+ ":" );
				if (exemplar.isDisponivel()) {
			        System.out.println("     Status: Disponível.");
			    } else {
			        System.out.println("     Status: Emprestado");
			        System.out.println("     Detalhes do empréstimo:");
			        System.out.print("     ");
			        Emprestimo emprestimo = exemplar.getEmprestimo();
			        System.out.println("		Usuario: " + emprestimo.getUsuario().getNome() + 
			        		"\n		Data de emprestimo: " + emprestimo.getDiaEmprestimo() + 
			        		"\n		Prazo de devolucao:" + emprestimo.getPrazoDevolucao());
			    }
			}
		System.out.println("Consulta Livros realizada!");
	}

}
