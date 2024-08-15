package aplicacao;
import aparelho.IPhone;

public class Program {

	    public static void main(String[] args) {
	        // Instanciando um iPhone
	        IPhone meuIphone = new IPhone();

	        // Utilizando métodos do ReprodutorMusical
	        meuIphone.tocar();
	        meuIphone.pausar();
	        meuIphone.selecionarMusica("Minha Música");

	        // Utilizando métodos do AparelhoTelefonico
	        meuIphone.ligar("123456789");
	        meuIphone.atender();
	        meuIphone.iniciarCorreioVoz();

	        // Utilizando métodos do NavegadorNaInternet
	        meuIphone.exibirPagina("https://www.exemplo.com");
	        meuIphone.adicionarNovaAba();
	        meuIphone.atualizarPagina();
	    }
	}

