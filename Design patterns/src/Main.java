public class Main {
    public static void main(String[] args) {

        CadastroLivroFacade cadastroLivroFacade = new CadastroLivroFacade();
        cadastroLivroFacade.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 10);

        System.out.println("_________________________________________");

        NotificadorLivro notificadorLivro = new NotificadorLivro();

        ObservadorLivro observador = new ExemploObservador();
        notificadorLivro.adicionarObservador(observador);

        notificadorLivro.notificarObservadores("O Silêncio dos Inocentes");
        notificadorLivro.removerObservador(observador);

        System.out.println("_________________________________________");

        CadastroLivroNovo sistemaNovoCadastro = new SistemaNovoCadastroLivro();
        sistemaNovoCadastro.cadastrarLivroNovo("Percy Jackson", "Rick Riordan", 5);

        System.out.println("_________________________________________");

        CadastroLivroAntigo sistemaAntigoCadastro = new SistemaAntigoCadastroLivro();
        CadastroLivroNovo adaptadorCadastroAntigo = new AdaptadorCadastroLivroAntigo(sistemaAntigoCadastro);
        adaptadorCadastroAntigo.cadastrarLivroNovo("O Exorcista", "William Peter Blatty", 3);

        System.out.println("_________________________________________");

        CadastroLivro sistemaReal = new SistemaRealCadastroLivro();
        sistemaReal.cadastrarLivro("Vai Curintia", "Marcelo Torres", 2);

        CadastroLivro proxyCadastro = new ProxyCadastroLivro();
        proxyCadastro.cadastrarLivro("Duna", "Frank Herbert", 3);

        System.out.println("_________________________________________");

    }
}