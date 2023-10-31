// Violacão do principio de Open-Closed
import java.security.InvalidParameterException;

interface OperacaoCalculadora {}

class Adicao implements OperacaoCalculadora {
    private double termoEsquerda;
    private double termoDireita;
    private double resultado = 0.0;

    public Adicao(double termoEsquerda, double termoDireita) {
        this.termoEsquerda = termoEsquerda;
        this.termoDireita = termoDireita;
    }

    public double getTermoEsquerda() {
        return termoEsquerda;
    }

    public double getTermoDireita() {
        return termoDireita;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

class Subtracao implements OperacaoCalculadora {
    private double termoEsquerda;
    private double termoDireita;
    private double resultado = 0.0;

    public Subtracao(double termoEsquerda, double termoDireita) {
        this.termoEsquerda = termoEsquerda;
        this.termoDireita = termoDireita;
    }

    public double getTermoEsquerda() {
        return termoEsquerda;
    }

    public double getTermoDireita() {
        return termoDireita;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

public class Calculadora {
    public static void calcular(OperacaoCalculadora operacao) {
        if (operacao == null) {
            throw new InvalidParameterException("Operação inválida");
        }

        if (operacao instanceof Adicao) {
            Adicao adicao = (Adicao) operacao;
            adicao.setResultado(adicao.getTermoEsquerda() + adicao.getTermoDireita());
        } else if (operacao instanceof Subtracao) {
            Subtracao subtracao = (Subtracao) operacao;
            subtracao.setResultado(subtracao.getTermoEsquerda() - subtracao.getTermoDireita());
        }
    }
}
