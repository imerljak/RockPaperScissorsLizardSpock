package jokenpo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokenpoJogadaTesouraTest {

    @Test
    public void tesouraEmpataComTesoura() {
        assertEquals(0, Jokenpo.TESOURA.contra(Jokenpo.TESOURA));
    }

    @Test
    public void tesouraCortaPapel() {
        assertEquals(1, Jokenpo.TESOURA.contra(Jokenpo.PAPEL));
    }

    @Test
    public void tesouraMataLagarto() {
        assertEquals(1, Jokenpo.TESOURA.contra(Jokenpo.LAGARTO));
    }

    @Test
    public void tesouraEhQuebradaPorPedra() {
        assertEquals(-1, Jokenpo.TESOURA.contra(Jokenpo.PEDRA));
    }

    @Test
    public void tesouraEhQuebradaPorSpock() {
        assertEquals(-1, Jokenpo.TESOURA.contra(Jokenpo.SPOCK));
    }

}
