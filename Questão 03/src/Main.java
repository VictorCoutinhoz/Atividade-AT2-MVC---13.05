public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView(controller);

        view.exibirMenu();
    }
}
