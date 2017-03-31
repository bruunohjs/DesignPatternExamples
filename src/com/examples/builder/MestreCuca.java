package com.examples.builder;

/**
 * A classe MestreCuca funciona como orquestrador. É essa classe que entende como cada objeto deve
 * ser construído (a ordem da chamada dos métodos, por exemplo). Porém é fundamental que essa classe
 * não tenha conhecimento da implementação das especificidades de cada tipo. O método "constructPizza"
 * é o responsável por invocar cada parte da construção.
 */
public class MestreCuca {
    private ConstrutorPizza construtor;

    public void definirTipoPizza(ConstrutorPizza construtor) { this.construtor = construtor; }
    public Pizza getPizza() { return construtor.getPizza(); }

    public void constructPizza() {
        construtor.construirNovaPizza();
        construtor.construirMassa();
        construtor.construirMolho();
        construtor.construirRecheio();
    }

}
