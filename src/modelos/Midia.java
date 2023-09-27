package modelos;

public abstract class Midia {
    private int duracao;
    private String nome;
    private int avaliacao;
    private String formato;

    public Midia(int duracao, String nome, int avaliacao, String formato) {
        this.duracao = duracao;
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.formato = formato;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
