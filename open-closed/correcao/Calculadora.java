package correcao;

import java.security.InvalidParameterException;

interface OperacaoCalculadora {
    void perform();
}

class Adicao implements OperacaoCalculadora {
    private double termoEsquerda;
    private double termoDireita;
    private double resultado;

    @Override
    public void perform() {
        this.resultado = this.termoEsquerda + this.termoDireita;
    }
}

class Subtracao implements OperacaoCalculadora {
    private double termoEsquerda;
    private double termoDireita;
    private double resultado;

    @Override
    public void perform() {
        this.resultado = this.termoEsquerda - this.termoDireita;
    }
}

public class Calculadora {
    public static void calcular(OperacaoCalculadora operacao) {
        if (operacao == null) {
            throw new InvalidParameterException("Operação inválida");
        }

        operacao.perform();
    }
}
