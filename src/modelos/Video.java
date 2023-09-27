package modelos;

public class Video extends Midia{
    private String produtora;
    private String genero;
    public Video(int duracao, String nome, int avaliacao, String formato) {
        super(duracao, nome, avaliacao, formato);
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
