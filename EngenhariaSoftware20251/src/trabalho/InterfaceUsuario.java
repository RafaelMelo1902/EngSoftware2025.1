package trabalho;

import java.util.HashMap;

import java.util.Scanner;

import command.AdicionarObservadorComando;
import command.CarregadorParametros;
import command.Comando;
import command.ConsultarLivroComando;
import command.ConsultarNotificacoes;
import command.ConsultarUsuarioComando;
import command.DevolverComando;
import command.EmprestarComando;
import command.ReservarComando;


public class InterfaceUsuario {
	private HashMap<String,Comando> comandos = new HashMap<String,Comando>();
	
	private void inicializarComandos() {
		comandos.put("emp", new EmprestarComando());
		comandos.put("usu", new ConsultarUsuarioComando());
		comandos.put("dev", new DevolverComando());
		comandos.put("res", new ReservarComando());
		comandos.put("obs", new AdicionarObservadorComando());
		comandos.put("liv", new ConsultarLivroComando());
		comandos.put("ntf", new ConsultarNotificacoes());
		
	}
	
	public void executarComando(String strComando, CarregadorParametros parametros) {
		Comando comando = comandos.get(strComando);
		comando.executar(parametros);
	}
	
	public void iniciarInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema. Digite um comando ou 'sai' para encerrar.");
        inicializarComandos();

        while (true) {
            System.out.print("> ");
            String linha = scanner.nextLine().trim();

            if (linha.equalsIgnoreCase("sai")) {
                System.out.println("Encerrando o sistema...");
                System.out.println("Sistema encerrado.");
                break;
            }

            if (linha.isEmpty()) {
                continue;
            }

            String[] partes = linha.split("\\s+");
            String nomeComando = partes[0];

            CarregadorParametros parametros = null;

            if (partes.length == 2) {
                parametros = new CarregadorParametros(partes[1]);
            } else if (partes.length >= 3) {
                parametros = new CarregadorParametros(partes[1], partes[2]);
            } else {
                System.out.println("Número insuficiente de parâmetros.");
                continue;
            }

            executarComando(nomeComando, parametros);
        }

        scanner.close();
    }
	public static void main(String[] args) {
	    InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
	    Repositorio repositorio = Repositorio.obterInstancia();
	    interfaceUsuario.iniciarInterface();
	    
	    
	}

}
