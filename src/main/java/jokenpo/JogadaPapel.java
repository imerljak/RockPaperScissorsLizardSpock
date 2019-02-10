package jokenpo;

import java.util.HashSet;
import java.util.Set;

class JogadaPapel extends Jogada {
    @Override
    protected Set<Jogada> ganhaDe() {
        return new HashSet<Jogada>() {{
            add(Jokenpo.PEDRA.getJogada());
            add(Jokenpo.SPOCK.getJogada());
        }};
    }
}
