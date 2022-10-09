import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Notebook {
    public static List<Contact> contatos = new ArrayList<>();
    public static List<Phone> fonesAgenda = new ArrayList<>();

    public void adicionarPessoaLista(Contact contact){

        validarInformacoesObrigatoriasContato(contact);

        if(buscarContatoPorCpf(contact.getCpf()) == null) {
            contatos.add(contact);
        } else {
            System.out.println("Esse contato já existe");
        }
    }

    public Contact buscarContatoPorCpf(String cpf) {

        return contatos.stream()
                .filter(contact -> contact.getCpf().equals(cpf))
                .findAny()
                .orElse(null);

    }

    private void validarInformacoesObrigatoriasContato(Contact contact) {

        Objects.requireNonNull(contact, "Contato não pode ser nulo");
        Objects.requireNonNull(contact.getNome(), "Nome obrigatório");
        Objects.requireNonNull(contact.getSobrenome(), "Sobrenome Obrigatório");
        Objects.requireNonNull(contact.getCpf(), "CPF obrigatório");

    }

    public void removerPessoaLista(Contact contact, Phone phone){

        if(buscarContatoPorCpf(contact.getCpf()) == contact) {
            contatos.remove(contact);
            fonesAgenda.remove(phone);
            contact.getFonesContato().remove(phone);
        } else {
            System.out.println("Esse contato não existe");
        }

    }

    public void adicionarTelefone(Phone phone, Contact contact){

        if (buscarContatoPorCpf(contact.getCpf()) == phone.getContatoFone()) {
            fonesAgenda.add(phone);
            contact.getFonesContato().add(phone);
        } else {
            System.out.println("Escolha um contato valido para adicionar o telefone.");
        }
    }

    public void removerTelefoneLista(Phone phone, Contact contact){

        if (buscarContatoPorCpf(contact.getCpf()) == contact) {
            fonesAgenda.remove(phone);
            contact.getFonesContato().remove(phone);
        } else {
            System.out.println("Escolha um contato válido para remover o telefone.");
        }

    }

    public void atualizarTelefoneLista(){

    }

    public void atualizarPessoaLista(Contact contact){

        validarInformacoesObrigatoriasContato(contact);

    }

    public void mostrarListaContatos() {
        contatos.forEach(System.out::println);
    }

}
