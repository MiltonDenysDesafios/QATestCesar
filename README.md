# Estrutura para testes
Documentação Automação de Casos de Testes Java/Cucumber

Resumo: 
Desenvolvimento do escopo para automação de casos de testes utilizando a técnica BDD (Behavior Driven Development) ou Design/Desenvolvimento guiado por comportamento.

### Tags ###

Para utilização de tags nas features, existe algumas nomenclaturas já utilizadas:

- Tag `@Test` para rodar os 2 cenarios automatizados. 
- Tag `@Discourse` para rodar o cenário de Discourse cenarios automatizado. 
- Tag `@CesarSchool` para rodar o cenario de CesarSchool automatizado. 


# Ferramentas utilizadas:
**IDE de desenvolvimento:** Eclipse

# Frameworks: 
- **Maven** – controle de versões.
- **Cucumber** – responsável interação das histórias com desenvolvimento.
- **Selenium Webdriver** – responsável pela manipulação de elementos Web.
- **Junit** -  indicado para criação de testes Unitários.

# Estrutura de pastas utilizadas:
O projeto contém a seguinte estrutura
- **tests** -  configurações de execução do cucumber
- **page** – utilizado para armazenar métodos reutilizáveis e armazena arquivos responsáveis pelas interações dos elementos mapeados.
- **feaures** - Local onde são armazenadas as features do projeto 
- **StepsDefinitions** – Armazena arquivos gerados a partir das features criadas, fazendo a chamada das pages.


# Configuração Ambiente: 
- Instalar ambiente de desenvolvimento java "https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26 ".
- Instalar ambiente Maven “https://maven.apache.org/download.cgi ”.
- Instalação Cucumber:
  - Clicar menu Help/ Install New Software
	- Digitar Work With: 
      “https://cucumber.io/cucumber-eclipse/update-site ”
  - Adicionar dependências no arquivo “pom.xml”.
versões utilizadas na data da criação desta estrutura (17/12/2020).
    - cucumber-java - 1.2.6
    - selenium-java - 3.141.59
    - cucumber-junit - 1.2.6
   
