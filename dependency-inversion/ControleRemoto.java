class Televisao {
    public void ligar() {
        // ligar televisao
    }
}

/*
    Nesse cenário, ControleRemoto viola o princípio de inversão de dependência,
    pois depende de uma implementação específica de Televisao, e não de uma
    abstração. Isso faz com que a classe ControleRemoto fique acoplada à classe
    Televisao, o que é ruim, pois se a classe Televisao for alterada, a classe
    ControleRemoto também precisará ser alterada.
 */
public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto() {
        this.tv = new Televisao();
    }

    public void ligarDispositivo() {
        this.tv.ligar();
    }
}