import java.util.Scanner;

public class MVCPadraoDemo {
   public static void main(String[] args) {

      Usuario modelo = new Usuario();

      UsuarioView visao = new UsuarioView();

      UsuarioController controlador = new UsuarioController(modelo, visao);

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o nome do usuário: ");
      String nome = scanner.nextLine();
      controlador.setNomeDoUsuario(nome);

      System.out.print("Digite o email do usuário: ");
      String email = scanner.nextLine();
      controlador.setEmailDoUsuario(email);

      controlador.atualizarVisao();

      System.out.print("\nDeseja atualizar o nome ou email? (nome/email): ");
      String opcao = scanner.nextLine();

      if (opcao.equalsIgnoreCase("nome")) {
         System.out.print("Digite o novo nome: ");
         nome = scanner.nextLine();
         controlador.setNomeDoUsuario(nome);
      } else if (opcao.equalsIgnoreCase("email")) {
         System.out.print("Digite o novo email: ");
         email = scanner.nextLine();
         controlador.setEmailDoUsuario(email);
      }

      controlador.atualizarVisao();

      scanner.close();
   }
}

