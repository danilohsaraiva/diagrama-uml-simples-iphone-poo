package modelos;

public abstract class IPhone implements AparelhoTelefonico{
    private  String imei = null;
    @Override
    public abstract void ligar();

    @Override
    public abstract void atender();

    @Override
    public abstract void iniciarCorreioDeVoz();

    public String getImei() {
        return imei;
    }

    public IPhone(String imei) {
        this.imei = imei;
    }
}
