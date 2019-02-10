package jokenpo;

import jokenpo.Jokenpo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokenpoJogadaPapelTest {

    @Test
    public void papelEmpataComPapel() {
        assertEquals(0, Jokenpo.PAPEL.contra(Jokenpo.PAPEL));
    }

    @Test
    public void papelCobrePedra() {
        assertEquals(1, Jokenpo.PAPEL.contra(Jokenpo.PEDRA));
    }

    @Test
    public void papelRefutaSpock() {
        assertEquals(1, Jokenpo.PAPEL.contra(Jokenpo.SPOCK));
    }

    @Test
    public void papelEhComidoPorLagarto() {
        assertEquals(-1, Jokenpo.PAPEL.contra(Jokenpo.LAGARTO));
    }

    @Test
    public void papelEhCortadoPorTesoura() {
        assertEquals(-1, Jokenpo.PAPEL.contra(Jokenpo.TESOURA));
    }

}
