package list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;



    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroAutor  = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroAutor.add(l);
                }
            }
        }
        return livroAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livroRet  = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <=anoFinal ){
                    livroRet.add(l);
                }
            }
        }
        return livroRet;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroRet  = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroRet = l;
                    break;
                }
            }
        }
        return livroRet;
    }

    public List<Livro> ordenaPorAnoPublicacao(){
        List<Livro> livroPorAno = new ArrayList<>(livroList);
        Collections.sort(livroPorAno);
        return  livroPorAno;
    }

    public List<Livro> ordenaPorTitulo(){
        List<Livro> livroPorTitulo = new ArrayList<>(livroList);
        livroPorTitulo.sort(new ComparatorPorTitulo());
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Titulo1", "Autor 1", 2025);
        catalogoLivros.adicionarLivro("Titulo2", "Autor 2", 2024);
        catalogoLivros.adicionarLivro("Titulo4", "Autor 1", 2024);
        catalogoLivros.adicionarLivro("Titulo5", "Autor 3", 1999);
        catalogoLivros.adicionarLivro("Titulo3", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Titulo1", "Autor 5", 1990);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(1900,2000));
        System.out.println((catalogoLivros.pesquisarPorTitulo("Titulo1")));

        System.out.println(catalogoLivros.ordenaPorAnoPublicacao());

        System.out.println(catalogoLivros.ordenaPorTitulo());
    }
}
