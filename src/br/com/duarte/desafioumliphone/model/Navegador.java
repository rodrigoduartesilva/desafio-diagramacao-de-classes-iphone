package br.com.duarte.desafioumliphone.model;

import br.com.duarte.desafioumliphone.interfaces.Teclado;

public class Navegador extends Iphone implements Teclado {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void acessarSite(String url) {
        System.out.println("Acessando página web");
    }

    public void atualizarSite() {
        System.out.println("Atualizando página web");
    }

    public void adicionarAba() {
        System.out.println("Adicionando uma nova aba ao navegador");
    }
}
