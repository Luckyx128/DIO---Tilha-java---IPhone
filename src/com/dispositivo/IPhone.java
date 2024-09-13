package com.dispositivo;

import com.dispositivo.funcionalidades.Internet;
import com.dispositivo.funcionalidades.Musica;
import com.dispositivo.funcionalidades.Telefonia;

public class IPhone {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Internet internet = new Internet();
        Telefonia telefonia = new Telefonia();

        musica.selecionarMusica("To the moon - Bruno Mars");
        musica.tocar();
        musica.pausar();

        internet.exibirPagina("www.google.com");
        internet.adicionarAba();
        internet.atualizarPagina();

        telefonia.atender();
        telefonia.ligar("041979814684");
        telefonia.iniciarCorreioVoz();
    }
}
