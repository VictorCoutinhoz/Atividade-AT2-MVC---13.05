# Introdução ao MVC em Java

## O que é MVC?

O MVC (Model-View-Controller) é um padrão de arquitetura de software que separa a aplicação em três componentes principais: Modelo, Visão e Controlador. Essa separação ajuda a organizar o código, facilitando a manutenção e escalabilidade da aplicação.

### Componentes do MVC

1. **Modelo (Model):**
    - Representa os dados e a lógica de negócios da aplicação.
    - É responsável por acessar a base de dados, validar dados e executar regras de negócios.
    - Não possui conhecimento sobre a interface do usuário.

2. **Visão (View):**
    - Responsável pela apresentação dos dados ao usuário.
    - Pode ser composta por HTML, JSP, Swing ou qualquer outra tecnologia de interface.
    - Recebe dados do Modelo e apresenta ao usuário de forma amigável.

3. **Controlador (Controller):**
    - Atua como intermediário entre o Modelo e a Visão.
    - Recebe as entradas do usuário (por exemplo, através de formulários), processa essas entradas utilizando o Modelo e seleciona a Visão apropriada para apresentar a resposta.
    - Contém a lógica de controle que define o fluxo da aplicação.
    ---