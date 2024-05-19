##  (2) Criar um aplicativo em Java com orientação a objetos aplicando MVC, onde o usuário do sistema possa inserir um nome e um e-mail e essas inserções sejam exibidas, crie também um método para atualizar o nome ou e-mail desse usuário:

## Explicação:
1) Usuario.java: Define o modelo Usuario com atributos nome e email, incluindo getters e setters.
2) UsuarioView.java: Define a visualização UsuarioView que imprime os detalhes do usuário no console.
3) UsuarioController.java: Define o controlador _UsuarioController que atua como intermediário entre o modelo e a visualização, com métodos para atualizar e obter os dados do usuário._
4) MVCPadraoDemo.java: O ponto de entrada do aplicativo. Utiliza o Scanner para ler a entrada do usuário, configura o modelo com os dados inseridos, atualiza a visualização e permite ao usuário atualizar o nome ou o email.

## Execução:
### Compilar e Executar: Compile e execute o projeto para ver o padrão MVC em ação.

### Interagir com o Aplicativo: Insira o nome e o email quando solicitado e veja os detalhes exibidos. Em seguida, escolha se deseja atualizar o nome ou o email e forneça o novo valor.

_Este exemplo demonstra como criar um aplicativo simples de gerenciamento de usuários em Java utilizando o padrão MVC, permitindo inserção e atualização de dados de forma estruturada e organizada._