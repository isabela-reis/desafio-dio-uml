package aparelho;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    
    public void tocar() {
        System.out.println("Tocando música no meu iPhone");
    }

    public void pausar() {
        System.out.println("Pausando música no meu iPhone");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no meu iPhone");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero + " no meu iPhone");
    }

    public void atender() {
        System.out.println("Atendendo chamada no meu iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no meu iPhone");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no meu iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do meu iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do meu iPhone");
    }
}
