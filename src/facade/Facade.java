package facade;

import facade.subsistema.cep.CepApi;
import facade.subsistema.crm.CrmService;

public class Facade {

    public void migarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
