package console;

public class Console {
	
	public static void InsucessoEmprestimoSemExemplar() {
	System.out.println("Não foi possível realizar o empréstimo, "
			+ "pois não há exemplares disponíveis na biblioteca");
	}
	public static void InsucessoEmprestimoUsuarioDevedor() {
		System.out.println("Não foi possível realizar o empréstimo, "
				+ "pois o usuário é devedor");
		}
	public static void InsucessoEmprestimoLimiteEmprestimo() {
		System.out.println("Não foi possível realizar o empréstimo, "
				+ "pois o usuário já possui o limite de empréstimos em aberto");
		}
	public static void InsucessoEmprestimoReservaAberta() {
		System.out.println("Não foi possível realizar o empréstimo, "
				+ "pois o usuário possui uma reserva desse livro em aberto");
		}
	public static void InsucessoEmprestimoReservasExemplares() {
		System.out.println("Não foi possível realizar o empréstimo, "
				+ "pois o usuário não possui reserva do livro, e a quantidade "
				+ "de reservas é igual ou superior à de exemplares disponíveis,");
		}
	public static void InsucessoEmprestimoEmAndamento() {
		System.out.println("Não foi possível realizar o empréstimo, "
				+ "pois o usuário já possui um empréstimo em andamento do mesmo livro");
		}
	
}
