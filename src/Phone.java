import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String numeroTelefone;
    static List<Phone> telefones = new ArrayList<>();

    public Phone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        Phone.telefones.add(this);
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
                "numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
