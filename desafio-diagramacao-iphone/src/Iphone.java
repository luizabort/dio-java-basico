public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender(){
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música desejada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}

