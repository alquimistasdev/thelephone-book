public class Main {
    public static void main(String[] args) {
        Contacts contato = new Contacts("Leonardo", "da Costa","11111111111");
        Phone fone1 = new Phone("11111-1111");
        Phone fone2 = new Phone("22222-2222");

        System.out.println(Phone.telefones);
        System.out.println(Contacts.contatos);
    }
}
