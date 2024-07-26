package main;
import main.dio.Iphone;

public class App{
    public static void main(String[] args) {
    Iphone Iphone11 = new Iphone();
    

    Iphone11.ligar("81 94738-7503");
    Iphone11.iniciarCorreioVoz();
    Iphone11.atender();
    Iphone11.exibirPagina("https://www.youtube.com/watch?v=Hd300YfmHc8&list=RDHd300YfmHc8&index=1");
    Iphone11.atualizarPagina();
    Iphone11.adicionarNovaAba();
    Iphone11.selecionarMusica("VMZ - Ego (Gojo)");
    Iphone11.tocar();
    Iphone11.pausar();
    }
}   