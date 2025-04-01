package map;

import set.pesquisa.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionaContato("Nome", 123456);
        agendaContato.adicionaContato("Nome", 1234533);
        agendaContato.adicionaContato("Nome 1", 123457);
        agendaContato.adicionaContato("Nome 2", 123458);
        agendaContato.adicionaContato("Nome 3", 123459);
        agendaContato.adicionaContato("Nome 4", 123450);

        agendaContato.exibirContato();
        agendaContato.removerContato("Nome 1");

        System.out.println("Numero do Telefone recuperado " + agendaContato.pesquisaPorNome("Nome"));
        agendaContato.exibirContato();
    }

}
