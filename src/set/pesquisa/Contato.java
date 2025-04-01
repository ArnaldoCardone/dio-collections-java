package set.pesquisa;

import java.util.Comparator;
import java.util.Objects;

public class Contato implements Comparable<Contato> {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" + nome + " - " + numero +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public int compareTo(Contato o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class ComparatorPorNumero implements Comparator<Contato>{

    @Override
    public int compare(Contato o1, Contato o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }
}