public interface ServicoPedido {
    void pedidoHamburguer(int quantidade);
    void pedidoBatataFrita(int tamanhoFritas);
    void pedidoCombo(int quantidade, int tamanhoFritas);
}

class ServicoPedidoHamburguer implements ServicoPedido {
    @Override
    public void pedidoHamburguer(int quantidade) {
        System.out.println("Pedido de " + quantidade + " hamburguer(es) realizado");
    }

    @Override
    public void pedidoBatataFrita(int tamanhoFritas) {
        throw new UnsupportedOperationException("Não é possível pedir batata frita em um serviço de hamburguer");
    }

    @Override
    public void pedidoCombo(int quantidade, int tamanhoFritas) {
        throw new UnsupportedOperationException("Não é possível pedir combo em um serviço de hamburguer");
    }
}