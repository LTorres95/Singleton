package singleton;

public class CentralDeControle {

    private CentralDeControle() {}

    private static CentralDeControle instance = new CentralDeControle();
    public static CentralDeControle getInstance() {
        return instance;
    }

    private String status;
    private String modoOperacao;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModoOperacao() {
        return modoOperacao;
    }

    public void setModoOperacao(String modoOperacao) {
        this.modoOperacao = modoOperacao;
    }
}