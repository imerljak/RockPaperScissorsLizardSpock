package jokenpo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokenpoJogadaLagartoTest {

    @Test
    public void lagartoEmpataComLagarto() {
        assertEquals(0, Jokenpo.LAGARTO.contra(Jokenpo.LAGARTO));
    }

    @Test
    public void lagartoEnvenenaSpock() {
        assertEquals(1, Jokenpo.LAGARTO.contra(Jokenpo.SPOCK));
    }

    @Test
    public void lagartoComePapel() {
        assertEquals(1, Jokenpo.LAGARTO.contra(Jokenpo.PAPEL));
    }

    @Test
    public void lagartoEhEsmagadoPorPedra() {
        assertEquals(-1, Jokenpo.LAGARTO.contra(Jokenpo.PEDRA));
    }

    @Test
    public void lagartoEhMortoPorTesoura() {
        assertEquals(-1, Jokenpo.LAGARTO.contra(Jokenpo.TESOURA));
    }

}
