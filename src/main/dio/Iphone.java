package main.dio;


public class Iphone implements ApareilhoCelular, ReprodutorMusical, NavegadorInternet {
    @Override
    public void atender(){
        System.out.println("Ligação atendida");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Correio iniciado");;
    }
    @Override
    public void ligar(String numero){
        System.out.println("Executando ligação para o número: " + numero);
    }
    @Override
    public void tocar(){
        System.out.println("Tocando música!!");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
    @Override
    public void pausar(){
        System.out.println("Pausando música!!");
    }
    @Override
    public void exibirPagina(String url){
        System.out.println("site: " + url);
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada!!");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Novo aba adicionada!");
    }
}

    


