public class UsuarioController {
    private Usuario modelo;
    private UsuarioView visao;
 
    public UsuarioController(Usuario modelo, UsuarioView visao){
       this.modelo = modelo;
       this.visao = visao;
    }
 
    public void setNomeDoUsuario(String nome){
       modelo.setNome(nome);		
    }
 
    public String getNomeDoUsuario(){
       return modelo.getNome();		
    }
 
    public void setEmailDoUsuario(String email){
       modelo.setEmail(email);		
    }
 
    public String getEmailDoUsuario(){
       return modelo.getEmail();		
    }
 
    public void atualizarVisao(){				
       visao.imprimirDetalhesDoUsuario(modelo.getNome(), modelo.getEmail());
    }	
 }
 
