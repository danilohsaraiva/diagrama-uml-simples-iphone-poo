package modelos;

import java.util.ArrayList;
import java.util.List;

public class NavegadorDeInternet extends Aplicativo{
    private List<Aba> abas;
    public NavegadorDeInternet(String nome, String versao) {
        super(nome, versao);
        abas = new ArrayList<Aba>();
    }

    public List<Aba> getAbas() {
        return abas;
    }

    public void setAbas(List<Aba> abas) {
        this.abas = abas;
    }
    public void adicionarAba(String url) {
        abas.add(new Aba(url));
    }
    public void atualizarAba(Aba aba) {
        System.out.println("Atualizando aba de url:> " + aba.getUrl());
    }
    public void exibirEmNovaAba(String url) {
        adicionarAba(url);
    }
    public void fecharAba(int posicaoAba) {
        abas.remove(posicaoAba);
    }
    @Override
    public void sairApp() {
        System.out.println("Modo de sair do Navegador");
    }

}
