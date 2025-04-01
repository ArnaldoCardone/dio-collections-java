package map;

public class Evento {
    private String nome;
    private String atracoes;

    public Evento(String nome, String atracoes) {
        this.nome = nome;
        this.atracoes = atracoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(String atracoes) {
        this.atracoes = atracoes;
    }

    @Override
    public String toString() {
        return "{nome='" + nome + "- atracoes =" + atracoes +"}";
    }
}
