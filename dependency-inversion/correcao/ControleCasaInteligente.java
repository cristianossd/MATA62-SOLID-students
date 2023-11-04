interface DispositivoInteligente {
    void ligar();
    void desligar();
}

class LampadaInteligente implements DispositivoInteligente {
    @Override
    public void ligar() {
        // Code to turn on the smart light
    }

    @Override
    public void desligar() {
        // Code to turn off the smart light
    }
}


class ControleCasaInteligente {
    private DispositivoInteligente dispositivo;

    public ControleCasaInteligente(DispositivoInteligente dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operarDisposistivo() {
        dispositivo.ligar();
        // ... operacoes adicionais
        dispositivo.desligar();
    }
}


public class Main {
    public static void main(String[] args) {
        DispositivoInteligente lampada = new LampadaInteligente();

        ControleCasaInteligente controleCasa = new ControleCasaInteligente(lampada);
        controleCasa.operarDisposistivo();
    }
}
