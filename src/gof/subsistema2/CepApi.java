package gof.subsistema2;

import gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi() {
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidiade(String cep){
        return "Balsas";
    }

    public String recuperarEstado(String cep){
        return "Ma";
    }
}
