package correcao;

interface Trabalhador {
    void trabalhar();
}

interface Alimentavel {
    void alimentar();
}

interface Dormivel {
    void dormir();
}

class TrabalhadorHumano implements Trabalhador, Alimentavel, Dormivel {
    @Override
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo...");
    }
}

class TrabalhadorRobo implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }
}
