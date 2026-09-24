package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralDeControleTest {

    @Test
    public void deveRetornarStatus() {
        CentralDeControle.getInstance().setStatus("Ativo");

        assertEquals(
                "Ativo",
                CentralDeControle.getInstance().getStatus()
        );
    }

    @Test
    public void deveRetornarModoOperacao() {
        CentralDeControle.getInstance().setModoOperacao("Automatico");

        assertEquals(
                "Automatico",
                CentralDeControle.getInstance().getModoOperacao()
        );
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        CentralDeControle central1 =
                CentralDeControle.getInstance();

        CentralDeControle central2 =
                CentralDeControle.getInstance();

        assertSame(central1, central2);
    }
}