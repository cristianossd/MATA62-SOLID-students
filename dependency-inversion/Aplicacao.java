class BancoDeDados {
    public void salvarDado(String dado) {
        System.out.println("Salvando dado " + dado);
    }
}

/*
    Isso viola o princípio de inversão de dependência, pois a classe Aplicacao
    depende de uma implementação específica de BancoDeDados, e não de uma
    abstração. Isso faz com que a classe Aplicacao fique acoplada à classe
    BancoDeDados, o que é ruim, pois se a classe BancoDeDados for alterada, a
    classe Aplicacao também precisará ser alterada.
 */
public class Aplicacao {
    private BancoDeDados bancoDeDados;

    public Aplicacao(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void registrarNovoNome(String nome) {
        this.bancoDeDados.salvarDado(nome);
    }
}
