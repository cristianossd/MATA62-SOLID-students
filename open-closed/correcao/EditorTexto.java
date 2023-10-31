package correcao;

interface SaidaEditorTexto {
    void escrever(String texto);
}

class SaidaConsole implements SaidaEditorTexto {
    @Override
    public void escrever(String texto) {
        System.out.println(texto);
    }
}

class SaidArquivo implements SaidaEditorTexto {
    @Override
    public void escrever(String texto) {
        // escrever em arquivo
    }
}

public class EditorTexto {
    public static void escrever(String texto, SaidaEditorTexto saidaEditorTexto) {
        saidaEditorTexto.escrever(texto);
    }
}
