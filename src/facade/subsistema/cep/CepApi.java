package facade.subsistema.cep;

import singleton.SingletonEager;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Aparecida";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
