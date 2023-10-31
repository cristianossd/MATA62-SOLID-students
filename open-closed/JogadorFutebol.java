// Violação do principio de Open-Closed
enum Posicao {
    GOLEIRO, ZAGUEIRO, LATERAL, MEIO, ATACANTE
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

    /*
        Violação do Open-Closed:
        - Toda vez que adicionarmos uma nova posição, teremos que alterar
          o getPosicao para retornar a nova posição
     */
    public String getPosicao() {
        switch (this.posicao) {
            case GOLEIRO:
                return "Esse jogador é um goleiro";
            case ZAGUEIRO:
                return "Esse jogador é um zagueiro";
            case LATERAL:
                return "Esse jogador é um lateral";
            case MEIO:
                return "Esse jogador é um meio de campo";
            case ATACANTE:
                return "atacante";
            default:
                return "Posição inválida";
        }
    }
}
