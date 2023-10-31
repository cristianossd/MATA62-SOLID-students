// Correção do principio de Open-Closed
package correcao;

abstract class Posicao {
    public abstract String getPosicao();
}

class Goleiro extends Posicao {
    @Override
    public String getPosicao() {
        return "Esse jogador é um goleiro";
    }
}

class Zagueiro extends Posicao {
    @Override
    public String getPosicao() {
        return "Esse jogador é um zagueiro";
    }
}

class Lateral extends Posicao {
    @Override
    public String getPosicao() {
        return "Esse jogador é um lateral";
    }
}

class Meio extends Posicao {
    @Override
    public String getPosicao() {
        return "Esse jogador é um meio de campo";
    }
}

class Atacante extends Posicao {
    @Override
    public String getPosicao() {
        return "atacante";
    }
}
public class JogadorFutebol {
    private String nome;
    private int idade;
    private Posicao posicao;

    public JogadorFutebol(String nome, int idade, Posicao posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getPosicao() {
        return this.posicao.getPosicao();
    }
}
