public class Phone extends Contact {
    public Contact contato;
    private String numeroTelefone;

    public Phone(String nome, String sobrenome, String cpf, String numeroTelefone) {
        super(nome, sobrenome, cpf);
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "contato=" + contato +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
