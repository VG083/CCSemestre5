public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);

        Contato contato1 = new Contato("João", "joao@gmail.com");
        Contato contato2 = new Contato("Maria", "maria@gmail.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        System.out.println("Contato buscado: " + agenda.buscarContato("João").getEmail());

        agenda.excluirContato("Maria");

        System.out.println("Contato buscado: " + agenda.buscarContato("Maria"));

    }
}