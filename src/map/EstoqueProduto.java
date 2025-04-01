package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long,Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long id, String nome, Double preco, Integer quantidade ){
        estoqueProdutoMap.put(id,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calculaValorEstoque(){
        double valorTotal = 0;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p: estoqueProdutoMap.values()){
                valorTotal +=p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if(p.getPreco()> maiorValor){
                    maiorValor = p.getPreco();
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(1,"Produto 1", 100.0, 7);
        estoque.adicionarProduto(2,"Produto 2", 70.0, 5);
        estoque.adicionarProduto(3,"Produto 3", 50.0, 3);
        estoque.adicionarProduto(4,"Produto 4", 12.0, 10);
        estoque.adicionarProduto(5,"Produto 5", 10.0, 5);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: " + estoque.calculaValorEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }
}
