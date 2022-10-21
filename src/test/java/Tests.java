import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class Tests {
    @Test
    void testeAdicionarPessoaNaLista() {
        Notebook notebook = new Notebook();
        Contact contato = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato);
        Assertions.assertEquals(1,notebook.mostrarTamanhoListaContatos());
    }

    @Test
    void testeAdicionarTelefoneNaLista() {
        Notebook notebook = new Notebook();
        Contact contato = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato);
        Phone phone = new Phone(contato, "99660-8010");
        notebook.adicionarTelefone(phone, contato);

        Assertions.assertEquals(1, notebook.mostrarTamanhoListaTelefones());
        Assertions.assertEquals(1, contato.mostrarTamanhoListaFonesContato());
//        Verificar se o elemento da lista é o esperado.
//        Criar variável com o numero de telefone salvo.
//        Verificar se o telefoneSalvo salvo é igual o salvo na lista.

       var telefoneSalvo = contato.getFonesContato().get(0);
        Assertions.assertEquals(telefoneSalvo.getNumeroTelefone(), phone.getNumeroTelefone());

    }

    @Test
    void testeRemoverTelefoneDaLista() {
        Notebook notebook = new Notebook();
        Contact contato = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato);
        Phone phone = new Phone(contato, "99660-8010");
        notebook.adicionarTelefone(phone, contato);
        Phone phone2 = new Phone(contato, "99999-0000");
        notebook.adicionarTelefone(phone2, contato);

        Assertions.assertEquals(2, notebook.mostrarTamanhoListaTelefones());
        Assertions.assertEquals(2, contato.mostrarTamanhoListaFonesContato());

        notebook.removerTelefoneLista(phone2, contato);

        Assertions.assertEquals(1, notebook.mostrarTamanhoListaTelefones());
        Assertions.assertEquals(1, contato.mostrarTamanhoListaFonesContato());
    }

    @Test
    void testeRemoverPessoaDaLista() {
        Notebook notebook = new Notebook();

        Contact contato = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato);

        Phone phone = new Phone(contato, "99660-8010");
        notebook.adicionarTelefone(phone, contato);

        Phone phone2 = new Phone(contato, "99999-0000");
        notebook.adicionarTelefone(phone2, contato);

        notebook.removerPessoaLista(contato);

        Assertions.assertEquals(0, notebook.mostrarTamanhoListaTelefones());
        Assertions.assertEquals(0, notebook.mostrarTamanhoListaContatos());

    }



//    testeAtualizarTelefone
//    testeAtualizarPessoa
//    testeMostrarListaNaTela
//    Testar CPF único

}
