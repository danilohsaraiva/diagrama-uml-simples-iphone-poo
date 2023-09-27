package modelos;

import java.util.Set;

public class IPhoneLancamento extends IPhone{
    Set<Aplicativo> listaAplicativos;

    public IPhoneLancamento(String imei) {
        super(imei);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando com iphone2007");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com iphone2007");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio com iphone2007");
    }
}
