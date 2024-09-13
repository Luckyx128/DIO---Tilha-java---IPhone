---
title: Animal example
---

classDiagram

    IPhone <|-- Musica
    IPhone <|-- Internet
    IPhone <|-- Telefonico
        
    class Musica
        Musica : +tocar()
        Musica : +pausar()
        Musica : +selecionarMusica(String musica)

    class Internet
        Internet : +exibirPagina(String url)
        Internet : +adicionarNovaAba()
        Internet : +atualizarPagina()

    class Telefonico
        Telefonivo : + ligar(String numero)
        Telefonivo : + atender()
        Telefonivo : + iniciarCorreioVoz()
