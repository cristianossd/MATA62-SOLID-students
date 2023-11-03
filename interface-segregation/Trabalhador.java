public interface Trabalhador {
    void trabalhar();
    void alimentar();
    void dormir();
}

class TrabalhadorHumano implements Trabalhador {
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

/*
    Violação do princípio de Interface Segregation:
    - A interface Trabalhdor força a utilização
      de métodos que não são necessários para
      todos os tipos de trabalhadores.
 */
class TrabalhadorRobo implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Robôs não comem");
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Robôs não dormem");
    }
}
