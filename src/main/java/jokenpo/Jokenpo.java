package jokenpo;

public enum Jokenpo {

    PEDRA(new JogadaPedra()),
    PAPEL(new JogadaPapel()),
    TESOURA(new JogadaTesoura()),
    LAGARTO(new JogadaLagarto()),
    SPOCK(new JogadaSpock());

    private Jogada jogada;

    Jokenpo(Jogada jogada) {
        this.jogada = jogada;
    }

    Jogada getJogada() {
        return jogada;
    }

    public int contra(Jokenpo inimigo) {
        return getJogada().validar(inimigo.getJogada());
    }
}
