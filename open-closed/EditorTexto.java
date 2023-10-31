enum TipoSaidaEditor {
    CONSOLE, ARQUIVO
}

/*
    Violação do Open-Closed:
    - E se quisermos adicionar uma nova forma de saída, por exemplo,
        escrever em um banco de dados?
 */
public class EditorTexto {
    public static void escrever(String texto, TipoSaidaEditor tipoSaidaEditor) {
        switch (tipoSaidaEditor) {
            case CONSOLE:
                System.out.println(texto);
                break;
            case ARQUIVO:
                // escrever em arquivo
                break;
            default:
                System.out.println("Tipo de saída inválida");
        }
    }
}
