package jokenpo;

import java.util.HashSet;
import java.util.Set;

class JogadaSpock extends Jogada {
    @Override
    protected Set<Jogada> ganhaDe() {
        return new HashSet<Jogada>() {{
            add(Jokenpo.TESOURA.getJogada());
            add(Jokenpo.PEDRA.getJogada());
        }};
    }
}
