public class Phone {

    private Contact contatoFone;
    private String numeroTelefone;


    public Phone(Contact contatoFone, String numeroTelefone) {
        this.contatoFone = contatoFone;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Contact getContatoFone() {
        return contatoFone;
    }

    public void setContatoFone(Contact contatoFone) {
        this.contatoFone = contatoFone;
    }

    @Override
    public String toString() {
        return numeroTelefone;
    }
}
