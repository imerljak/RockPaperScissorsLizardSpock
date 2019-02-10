package jokenpo;

import jokenpo.Jokenpo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokenpoJogadaPedraTest {

    @Test
    public void pedraEmpataComPedra() {
        assertEquals(0, Jokenpo.PEDRA.contra(Jokenpo.PEDRA));
    }

    @Test
    public void pedraQuebraTesoura() {
        assertEquals(1, Jokenpo.PEDRA.contra(Jokenpo.TESOURA));
    }

    @Test
    public void pedraEsmagaLagarto() {
        assertEquals(1, Jokenpo.PEDRA.contra(Jokenpo.LAGARTO));
    }

    @Test
    public void pedraEhCobertaPorPapel() {
        assertEquals(-1, Jokenpo.PEDRA.contra(Jokenpo.PAPEL));
    }

    @Test
    public void pedraEhVaporizadaPorSpock() {
        assertEquals(-1, Jokenpo.PEDRA.contra(Jokenpo.SPOCK));
    }

}
