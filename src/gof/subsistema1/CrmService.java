package gof.subsistema1;

public class CrmService {
    public static void gravarCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente Salvo no sistema de CRM\n"+nome+"\n"+cep+"\n"+cidade+"\n"+estado);
    }
}
