import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    void testeAdicionarPessoaNaLista(){
        Notebook notebook = new Notebook();
        Contact contato4 = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato4);
        Assertions.assertEquals(1,notebook.mostrarTamanhoLista());
    }
}
