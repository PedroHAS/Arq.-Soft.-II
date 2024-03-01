interface CadastroLivro {
    void cadastrarLivro(String titulo, String autor, int quantidade);
}
class SistemaRealCadastroLivro implements CadastroLivro {
    @Override
    public void cadastrarLivro(String titulo, String autor, int quantidade) {
        System.out.println("Livro cadastrado: " + titulo + " - " + autor + " - Quantidade: " + quantidade);
    }
}
class ProxyCadastroLivro implements CadastroLivro {
    private SistemaRealCadastroLivro sistemaRealCadastroLivro;

    public ProxyCadastroLivro() {
        this.sistemaRealCadastroLivro = new SistemaRealCadastroLivro();
    }
    @Override
    public void cadastrarLivro(String titulo, String autor, int quantidade) {

        System.out.println("Verificando permissões para cadastrar livro...");

        sistemaRealCadastroLivro.cadastrarLivro(titulo, autor, quantidade);

        System.out.println("Livro cadastrado com sucesso!");
    }
}