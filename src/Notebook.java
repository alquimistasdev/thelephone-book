import java.util.ArrayList;
import java.util.List;

public class Notebook {
    public static List<Contacts> contatos = new ArrayList<>();
    public static List<Phone> fones = new ArrayList<>();

    void adicionarPessoaLista(String nome, String sobrenome, String cpf){

    }

    void removerPessoaLista(){

    }

    void adicionarTelefone(Phone phone){
        fones.add(phone);
    }

    void removerTelefoneLista(Phone phone){
        fones.remove(phone);
    }

    void atualizarTelefoneLista(){

    }

    void atualizarPessoaLista(){

    }
}
