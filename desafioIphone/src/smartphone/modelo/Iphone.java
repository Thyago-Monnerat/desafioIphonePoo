package smartphone.modelo;

import smartphone.funcoes.AparelhoTelefonico;
import smartphone.funcoes.NavegadorInternet;
import smartphone.funcoes.ReprodutorMusical;
/**Interface simulando um Iphone. A qual poderia ser qualquer outro modelo. */
public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    /**Implementando as interfaces para o modelo iphone. Utilizando polimorfismo. */
    public void tocar(){
        System.out.println("Tocando musica no Iphone");
    }
    public void pausar(){
        System.out.println("Pausando musica no Iphone");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica no Iphone");
    }

    public void ligar(){
        System.out.println("Ligando no Iphone");
    }
    public void atender(){
        System.out.println("Atendendo no Iphone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz no Iphone");
    } 

    public void exibirPagina(){
        System.out.println("Exibindo pagina no navegador do Iphone");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no navegador do Iphone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina no navegador do iphone");
    }

}
