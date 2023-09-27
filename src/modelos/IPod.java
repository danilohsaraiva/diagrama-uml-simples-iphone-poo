package modelos;

import java.util.List;

public class IPod extends Aplicativo{

    private List<Musica> listaMusicas;
    private List<Video> listaVideos;
    public IPod(String nome, String versao) {
        super(nome, versao);
    }

    public void iniciarMidia() {

    }
    public void pausarMidia() {

    }
    public void selecionarMidia(Midia midia) {

    }
    @Override
    public void sairApp() {
        System.out.println("Modo de sair do IPod");
    }

}
