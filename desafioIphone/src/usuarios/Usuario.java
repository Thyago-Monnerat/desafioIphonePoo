package usuarios;
import smartphone.modelo.Iphone;
/**Classe que representa um usuário de um modelo específico de telefone.
 * Utilizando o conceito Herança nos métodos.
*/
public class Usuario extends Iphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("----------Funções de Contato----------\n");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("\n");
        
        System.out.println("----------Funções de Mídia----------\n");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("\n");

        System.out.println("----------Funções de Navegação----------\n");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("\n");
    }
}
