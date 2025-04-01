package map;

import set.pesquisa.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracoes){
        agenda.put(data,new Evento(nome,atracoes));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(agenda);
        System.out.println(eventoOrdenado);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(agenda);
        if(!eventoOrdenado.isEmpty()) {

            for (Map.Entry<LocalDate, Evento> entry : eventoOrdenado.entrySet()) {
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    System.out.println("O próximo evento " + entry.getValue() + " será em " + entry.getKey());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2025,10,1), "Evento 1", "Atracoes");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY,12), "Evento 2", "Atracoes2");
        agendaEventos.adicionarEvento(LocalDate.now(), "Evento 3", "Atracoes3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7,10), "Evento 4", "Atracoes4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
