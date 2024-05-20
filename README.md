Projeto de Automação Web - Desafio PBTech

Este projeto contém a automação de testes para a página web Challenging DOM do site The Internet, utilizando as seguintes tecnologias:

Selenium WebDriver
JUnit 4.12
Java 17


Descrição
O projeto foi criado como parte do Desafio PBTech para demonstrar a automação de testes funcionais na página Challenging DOM, que contém vários elementos desafiadores para automação.

Funcionalidades
As principais funcionalidades automatizadas incluem:

Acesso e validação do título da página
Validação de cliques em botões com verificação de mudança de texto e cor
Validação de cliques em botões de edição de linhas de uma tabela, verificando mudanças na URL após o clique
Tecnologias Utilizadas
Selenium WebDriver: Ferramenta para automatizar a interação com navegadores web.
JUnit 4: Framework de testes unitários para Java.
Java 17: Linguagem de programação utilizada para desenvolver os testes.

Pré-requisitos
Para executar o projeto em sua máquina local, é necessário ter instalado:

Java 17 JDK (ou versão mais recente)
Maven
Um navegador web (Chrome)
Driver do navegador (ChromeDriver)

Instalação e Execução
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
Importe o projeto em sua IDE preferida (IntelliJ, Eclipse, etc.).

Baixe as dependências do Maven.

Configure o WebDriver:

Certifique-se de que o WebDriver (ChromeDriver, GeckoDriver, etc.) está configurado corretamente.
Execute os testes:

Execute os testes diretamente pela IDE ou via linha de comando usando Maven:
mvn test


Estrutura do Projeto
A estrutura do projeto está organizada da seguinte maneira:

          automacao-desafio-pbtech/
          ├── src/
          │   ├── main/
          │   │   └── java/
          │   │       └── Pages/
          │   │           └── homePage.java
          │   ├── test/
          │   │   └── java/
          │   │       └── tests/
          │   │           └── runTest.java
          │   └── pom.xml
          └── README.md


Contribuições
Contribuições são bem-vindas! Para mudanças importantes, abra primeiro uma issue para discutir o que você gostaria de mudar.


Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
