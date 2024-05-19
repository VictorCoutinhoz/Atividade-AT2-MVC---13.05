public class EstudanteController {
    private Estudante modelo;
    private EstudanteView visao;
 
    public EstudanteController(Estudante modelo, EstudanteView visao){
       this.modelo = modelo;
       this.visao = visao;
    }
 
    public void setNomeDoEstudante(String nome){
       modelo.setNome(nome);		
    }
 
    public String getNomeDoEstudante(){
       return modelo.getNome();		
    }
 
    public void setMatriculaDoEstudante(String matricula){
       modelo.setMatricula(matricula);		
    }
 
    public String getMatriculaDoEstudante(){
       return modelo.getMatricula();		
    }
 
    public void atualizarVisao(){				
       visao.imprimirDetalhesDoEstudante(modelo.getNome(), modelo.getMatricula());
    }	
 }
 