// Exemplo que viola o princípio de Dependency Inversion

interface DispositivoInteligente {
    void ligar();
    void desligar();
}

class LampadaInteligente implements DispositivoInteligente {
    @Override
    public void ligar() {
        // código para ligar a lampada
    }

    @Override
    public void desligar() {
        // código para desligar a lampada
    }
}

class ControlarCasaInteligente {
    private DispositivoInteligente dispositivo;

    public ControlarCasaInteligente() {
        this.dispositivo = new LampadaInteligente();
    }

    public void operarDispositivo() {
        dispositivo.ligar();
        // ... operacoes adicionais
        dispositivo.desligar();
    }
}
