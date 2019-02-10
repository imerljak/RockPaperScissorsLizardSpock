package jokenpo;

import java.util.HashSet;
import java.util.Set;

class JogadaTesoura extends Jogada {
    @Override
    protected Set<Jogada> ganhaDe() {
        return new HashSet<Jogada>() {{
            add(Jokenpo.PAPEL.getJogada());
            add(Jokenpo.LAGARTO.getJogada());
        }};
    }
}
