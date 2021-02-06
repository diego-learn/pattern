package com.company.singleton;


/***
 * Patron singleton nos permitira garantir que siempre existira una instancia del objeto
 *
 * **/
public class Janela {

    private static Janela instancia;

    private Janela() {

    }

    /**
     *aqui validamos si la instacia esta null, para crear la instancia una unica vez..
     *
     * utilizamos la palabra syncronized para controlar la concorrencia en caso que sea requisitado por varias threads al mismo tiempo
     * **/
    public static synchronized Janela getInstance() {
        if (instancia == null) {
            instancia = new Janela();
        }

        return instancia;
    }
}
