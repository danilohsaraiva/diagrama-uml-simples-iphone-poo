package modelos;

public class Musica extends Midia{

    private String artista;
    private String capa;
    public Musica(int duracao, String nome, int avaliacao, String formato) {
        super(duracao, nome, avaliacao, formato);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
}
