public class Main {
    public static void main(String[] args) {

        Notebook notebook = new Notebook();

        Contact contato = new Contact("Leonardo", "da Costa","098.765.432-10");
        notebook.adicionarPessoaLista(contato);
        Phone phone = new Phone(contato, "99800-2020");
        notebook.adicionarTelefone(phone, contato);

        Contact contato2 = new Contact("Bruno", "Tomaz", "012.345.678-90");
        notebook.adicionarPessoaLista(contato2);
        Phone phone2 = new Phone(contato2, "99600-1010");
        notebook.adicionarTelefone(phone2, contato2);

        Contact contato3 = new Contact("Felipe","Neves", "078.217.081-53");
        notebook.adicionarPessoaLista(contato3);
        Phone phone3 = new Phone(contato3, "99837-4020");
        notebook.adicionarTelefone(phone3, contato3);

        Contact contato4 = new Contact("Pedro","Silva","098.765.432-10");
        Contact contato5 = new Contact("João","Pereira","012.345.678-98");
        notebook.atualizarDadosPessoaLista(contato5);
        notebook.atualizarDadosPessoaLista(contato4);
        notebook.mostrarListaContatos();
    }
}
