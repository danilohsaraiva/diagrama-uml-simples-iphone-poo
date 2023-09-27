package modelos;

public abstract class Aplicativo {
    private String nome;
    private String versao;

    public Aplicativo(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public abstract void sairApp();
}
