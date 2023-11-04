package correcao;

interface Dispositivo {
    void ligar();
}

class Televisao implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Ligando televisão");
    }
}

class DVDPlayer implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Ligando DVD player");
    }
}

/*
    Nessa correção, ControleRemoto depende de uma abstração, e não de uma
    implementação específica de Dispositivo. Isso faz com que a classe
    ControleRemoto não fique acoplada à classe Dispositivo, o que é bom, pois se
    a classe Dispositivo for alterada, a classe ControleRemoto não precisará ser
    alterada.
 */
public class ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDispositivo() {
        this.dispositivo.ligar();
    }
}
