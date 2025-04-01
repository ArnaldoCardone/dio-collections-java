package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero de elementos " + listaTarefa.obterNumeroTotal());
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");
        listaTarefa.adicionarTarefa("Tarefa3");
        listaTarefa.adicionarTarefa("Tarefa4");
        listaTarefa.adicionarTarefa("Tarefa1");
        System.out.println("Numero de elementos " + listaTarefa.obterNumeroTotal());
        listaTarefa.imprimeDescricaoTarefa();
        listaTarefa.excluirTarefa("Tarefa1");
        System.out.println("Numero de elementos " + listaTarefa.obterNumeroTotal());
    }

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        tarefaList.add(new Tarefa(tarefa));
    }

    public void excluirTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }

    public int obterNumeroTotal(){
        return tarefaList.size();
    }

    public void imprimeDescricaoTarefa(){
        System.out.println(tarefaList);
    }

}
