import java.util.ArrayList;

public class BibliotecaController {
    private ArrayList<Livro> livros;

    // Construtor
    public BibliotecaController() {
        livros = new ArrayList<>();
    }

    // Métodos para gerenciar livros
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
