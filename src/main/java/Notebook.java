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

//    Receber como parâmetro o Contato e todos os telefones do contato
//    Validar o contato
//    Remover o contato
//    Remover todos os telefones do contato da Lista Telefonica
//    Remover todos os telefones do Contato


    public void removerPessoaLista(Contact contact){

        if(buscarContatoPorCpf(contact.getCpf()) == contact) {
            contact.getFonesContato().forEach(telefone -> {
                fonesAgenda.removeIf(t -> t.getNumeroTelefone().equals(telefone.getNumeroTelefone()));
            });
            contatos.remove(contact);
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

    public void atualizarTelefoneLista(Contact contact, Phone phone){
        if(buscarContatoPorCpf(contact.getCpf())==contact){
            //phone.setNumeroTelefone("6666-6666");
        }
    }

    public void atualizarDadosPessoaLista(Contact contact){
        validarInformacoesObrigatoriasContato(contact);
        if (buscarContatoPorCpf(contact.getCpf()).getCpf().equals(contact.getCpf())){
            //achar posição do contato na lista
            for(int i = 0; i < contatos.size(); i++) {
                if(contatos.get(i).getCpf().equals(contact.getCpf())){
                    contatos.get(i).setNome(contact.getNome());
                    contatos.get(i).setSobrenome(contact.getSobrenome());
                    contatos.get(i).setEmail(contact.getEmail());
                }
            }
        }else{
            System.out.println("Esta pessoa não está cadastrada.");
        }
    }

    public void mostrarListaContatos() {
        contatos.forEach(System.out::println);
    }

    public int mostrarTamanhoListaContatos(){
        return contatos.size();
    }

    public int mostrarTamanhoListaTelefones() {
        return fonesAgenda.size();
    }

}
