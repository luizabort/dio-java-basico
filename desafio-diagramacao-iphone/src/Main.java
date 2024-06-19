public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        //Métodos de telefone
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //Métodos de reprodutor musical
        iPhone.tocarMusica();
        iPhone.pausarMusica();
        iPhone.selecionarMusica();

        //Métodos de navegador de internet
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();
    }
}
