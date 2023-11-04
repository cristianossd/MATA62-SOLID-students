package correcao;

interface BancoDeDados {
    void salvardado(String dado);
}

class BancoDeDadosMySQL implements BancoDeDados {
    @Override
    public void salvardado(String dado) {
        System.out.println("Salvando dado " + dado + " no MySQL");
    }
}

/*
    Agora, a classe Aplicacao depende de uma abstração, e não de uma
    implementação específica de BancoDeDados. Isso faz com que a classe
    Aplicacao não fique acoplada à classe BancoDeDados, o que é bom, pois se a
    classe BancoDeDados for alterada, a classe Aplicacao não precisará ser
    alterada.
 */

public class Aplicacao {
    private BancoDeDados bancoDeDados;

    public Aplicacao(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void registrarNovoNome(String nome) {
        this.bancoDeDados.salvardado(nome);
    }
}
