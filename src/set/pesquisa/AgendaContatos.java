package set.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void AdicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void ExibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatoResult = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoResult.add(c);
            }
        }
        return contatoResult;
    }

    public Contato atualizaNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equals(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public Set<Contato> ordenaPorNome(){
        Set<Contato> contatoOrdenado = new TreeSet<>(contatoSet);
        return contatoOrdenado;
    }

    public Set<Contato> ordenaPorNumero(){
        Set<Contato> contatoOrdenado = new TreeSet<>(new ComparatorPorNumero());
        contatoOrdenado.addAll(contatoSet);
        return contatoOrdenado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.AdicionarContato("Contato 1", 12345);
        agendaContatos.AdicionarContato("Contato 3", 12344);
        agendaContatos.AdicionarContato("Novo Cont", 12349);
        agendaContatos.AdicionarContato("Contato 2", 123456);

        agendaContatos.ExibirContato();
        System.out.println(agendaContatos.ordenaPorNome());
        System.out.println(agendaContatos.ordenaPorNumero());

        System.out.println(agendaContatos.pesquisaPorNome("Cont"));

        agendaContatos.atualizaNumeroContato("Contato 1",99999);
        agendaContatos.ExibirContato();


    }
}
