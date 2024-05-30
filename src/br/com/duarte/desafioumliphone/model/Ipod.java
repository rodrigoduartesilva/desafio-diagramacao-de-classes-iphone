package br.com.duarte.desafioumliphone.model;

import br.com.duarte.desafioumliphone.interfaces.Teclado;

public class Ipod extends Iphone implements Teclado {
    private String musica;
    private String artista;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void tocarMusica(String musica) {
        System.out.println("Música tocando");
    }

    public void selecionarArtista(String artista) {
        System.out.println("Artista selecionado!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada!");
    }

    public void pausarMusica(String musica) {
        System.out.println("Música pausada!");
    }
}
