package jokenpo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokenpoJogadaSpockTest {

    @Test
    public void spockEmpataComSpock() {
        assertEquals(0, Jokenpo.SPOCK.contra(Jokenpo.SPOCK));
    }

    @Test
    public void spockQuebraTesoura() {
        assertEquals(1, Jokenpo.SPOCK.contra(Jokenpo.TESOURA));
    }

    @Test
    public void spockVaporizaPedra() {
        assertEquals(1, Jokenpo.SPOCK.contra(Jokenpo.PEDRA));
    }

    @Test
    public void spockEhEnvenenadoPorLagarto() {
        assertEquals(-1, Jokenpo.SPOCK.contra(Jokenpo.LAGARTO));
    }

    @Test
    public void spockEhRefutadoPorPapel() {
        assertEquals(-1, Jokenpo.SPOCK.contra(Jokenpo.PAPEL));
    }

}
