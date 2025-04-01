package list.pesquisa;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }


    @Override
    public int compareTo(Livro o) {
        return Integer.compare(anoPublicacao, o.anoPublicacao);
    }

}

class ComparatorPorTitulo implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        return CharSequence.compare(o1.getTitulo(),o2.getTitulo());
    }
}