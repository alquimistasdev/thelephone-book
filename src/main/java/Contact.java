import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private List<Phone> fonesContato = new ArrayList<>();

    public Contact(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public Contact(String nome, String sobrenome, String cpf, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getFonesContato() {
        return fonesContato;
    }

    public void setFonesContato(List<Phone> fonesContato) {
        this.fonesContato = fonesContato;
    }

    @Override
    public String toString() {
        return "Contato: " +
                "\nnome: " + nome +
                "\nsobrenome: " + sobrenome +
                "\nCPF: " + cpf +
                "\nemail: " + email +
                "\ntelefones: " + fonesContato +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return cpf.equals(contact.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
