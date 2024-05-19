public class MVCPadraoDemo {
    public static void main(String[] args) {
 
       // Recupera o registro do estudante baseado na matrícula do banco de dados
       Estudante modelo = recuperarEstudanteDoBancoDeDados();
 
       // Cria uma visualização: para escrever os detalhes do estudante no console
       EstudanteView visao = new EstudanteView();
 
       EstudanteController controlador = new EstudanteController(modelo, visao);
 
       controlador.atualizarVisao();
 
       // Atualiza os dados do modelo
       controlador.setNomeDoEstudante("João");
 
       controlador.atualizarVisao();
    }
 
    private static Estudante recuperarEstudanteDoBancoDeDados(){
       Estudante estudante = new Estudante();
       estudante.setNome("Carlos");
       estudante.setMatricula("12345");
       return estudante;
    }
 }
 