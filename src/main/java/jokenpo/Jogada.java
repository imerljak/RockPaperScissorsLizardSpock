package jokenpo;

import java.util.Set;

abstract class Jogada {

    protected abstract Set<Jogada> ganhaDe();

    int validar(Jogada jogada) {
        if (this.equals(jogada)) {
            return 0;
        }

        if (ganhaDe().contains(jogada)) {
            return 1;
        }

        return -1;
    }

}
