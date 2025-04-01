package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite()== codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.adicionaConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionaConvidado("Convidado 2", 1233);
        conjuntoConvidados.adicionaConvidado("Convidado 3", 1233);
        conjuntoConvidados.adicionaConvidado("Convidado 4", 1236);
        conjuntoConvidados.adicionaConvidado("Convidado 5", 1237);
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorConvite(1233);
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

    }
}
