import java.util.Scanner;

public class BibliotecaView {
    private BibliotecaController controller;
    private Scanner scanner;

    // Construtor
    public BibliotecaView(BibliotecaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    // Método para exibir o menu
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu Biblioteca:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    buscarLivro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Método para adicionar um livro
    private void adicionarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano do livro: ");
        String isbn = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, isbn);
        controller.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    // Método para listar livros
    private void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : controller.listarLivros()) {
            System.out.println(livro);
        }
    }

    // Método para buscar um livro por título
    private void buscarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        Livro livro = controller.buscarLivroPorTitulo(titulo);

        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado!");
        }
    }
}
