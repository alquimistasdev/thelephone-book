public class Phone {

    private Contact contatoNome;
    private String numeroTelefone;


    public Phone(Contact contatoNome, String numeroTelefone) {
        this.contatoNome = contatoNome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Contact getContatoFone() {
        return contatoNome;
    }

    public void setContatoFone(Contact contatoFone) {
        this.contatoNome = contatoFone;
    }

    @Override
    public String toString() {
        return numeroTelefone;
    }
}
