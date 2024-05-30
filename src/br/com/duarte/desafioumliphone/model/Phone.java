package br.com.duarte.desafioumliphone.model;

import br.com.duarte.desafioumliphone.interfaces.Teclado;

public class Phone extends Iphone implements Teclado {
    private String numeroDeTelefone;

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void realizarChamada(String numeroDeTelefone){
        System.out.println("Realizando uma chamada!");
    }

    public void atenderChamada() {
        System.out.println("Atendendo uma chamada!");
    }

    public void verificarCorreioDeVoz(){
        System.out.println("verificando o correio de voz!");
    }

    public void enviarSms(String numeroDeTelefone) {
        System.out.println("Enviando SMS!");
    }
}
