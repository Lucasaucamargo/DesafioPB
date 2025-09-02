<h1>Projeto de Automação Web</h1>

Este projeto contém a automação de testes para a página web Challenging DOM do site The Internet, utilizando as seguintes tecnologias:

Selenium WebDriver
JUnit 5
Java 17


<h3>Descrição</h3>
O projeto foi criado como parte do Desafio PBTech para demonstrar a automação de testes funcionais na página Challenging DOM, que contém vários elementos desafiadores para automação.

<h3>Funcionalidades</h3>
As principais funcionalidades automatizadas incluem:

Acesso e validação do título da página
Validação de cliques em botões com verificação de mudança de texto e cor
Validação de cliques em botões de edição de linhas de uma tabela, verificando mudanças na URL após o clique

Tecnologias Utilizadas:

Selenium WebDriver: Ferramenta para automatizar a interação com navegadores web.
JUnit 5
Java 17

<h3>Pré-requisitos</h3>
Para executar o projeto em sua máquina local, é necessário ter instalado:

Java 17 JDK (ou versão mais recente)
Maven
Um navegador web (Chrome)
Driver do navegador (ChromeDriver)

<h3>Instalação e Execução</h3>
Clone o repositório:

bash
Copiar código
git clone https://github.com/Lucasaucamargo/DesafioPB
Importe o projeto em sua IDE preferida (IntelliJ, Eclipse, etc.).

Baixe as dependências do Maven.

Configure o WebDriver:

Certifique-se de que o WebDriver (ChromeDriver) está configurado corretamente.
Execute os testes:

Execute os testes diretamente pela IDE ou via linha de comando usando Maven:
mvn test


<h3>Estrutura do Projeto</h3>
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


<h3>Contribuições</h3>
Contribuições são bem-vindas! Para mudanças importantes, abra primeiro uma issue para discutir o que você gostaria de mudar.


<h3>Licença</h3>
Este projeto está licenciado sob a licença MIT. Veja o arquivo (https://github.com/Lucasaucamargo/DesafioPB/blob/bada9413a99bb91ff9720d5c528ce984b14e4535/License.md) para mais detalhes.
