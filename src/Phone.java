import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String contato;
    private String numeroTelefone;

    public Phone(String contato, String numeroTelefone) {
        this.contato = contato;
        this.numeroTelefone = numeroTelefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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
                "contato='" + contato + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
