# Projeto de Exercícios de Lógica em Java

Este projeto é uma coleção de exercícios de lógica de programação resolvidos em Java, demonstrando a aplicação de conceitos de Programação Orientada a Objetos (OOP) de forma estruturada e organizada. Cada problema é isolado em seu próprio pacote, seguindo um padrão de arquitetura simples para separar responsabilidades.

## 🚀 Tecnologias e Conceitos Utilizados

* **Java**: A linguagem de programação principal do projeto. O código utiliza recursos modernos e boas práticas da plataforma.
* **Programação Orientada a Objetos (OOP)**: Este é o pilar do projeto. Todos os exercícios são resolvidos usando classes e objetos, com um foco claro em:
    * **Encapsulamento**: Os dados (atributos) e as operações (métodos) que os manipulam são agrupados em classes. O uso de atributos `private` com métodos `public` (getters e setters) é um exemplo claro.
    * **Abstração**: As classes (Modelos) criam uma representação simplificada de conceitos do mundo real (um Ponto, um Jogo, um Pedido), escondendo a complexidade interna.
* **Spring Boot**: Embora o projeto não utilize os recursos web do Spring Boot, a anotação `@SpringBootApplication` e a estrutura de pacotes são heranças dele. Isso estabelece uma base robusta e escalável, comumente usada no mercado de trabalho.

## 🏛️ Arquitetura do Projeto

O projeto segue um padrão de arquitetura simples, mas eficaz, que separa o código em duas camadas principais para cada exercício: **Model** e **Controller**.

* **Model**:
    * **Responsabilidade**: Armazenar os dados e conter a lógica de negócio principal. Por exemplo, na classe `Funcionario`, é o Model que sabe *como* calcular o aumento salarial.
    * **Localização**: `com.provas.Prova.exercicioN/NomeDoModelo.java`

* **Controller**:
    * **Responsabilidade**: Atuar como o intermediário entre o usuário e o Model. Ele é responsável por pedir os dados de entrada ao usuário (usando `Scanner`), passar esses dados para o Model, chamar os métodos de lógica e, por fim, exibir o resultado.
    * **Localização**: `com.provas.Prova.exercicioN.controller/NomeDoController.java`

* **Application (Main)**:
    * **Responsabilidade**: Servir como o ponto de entrada do programa. Nesta aplicação, ela também tem o papel de apresentar um menu interativo para que o usuário possa escolher qual exercício executar.
    * **Localização**: `com.provas.Prova/ProvaApplication.java`

## ⚙️ Como Implementar e Executar

Siga os passos abaixo para compilar e executar o projeto em seu ambiente de desenvolvimento.

### Pré-requisitos

* **JDK (Java Development Kit)**: Versão 11 ou superior.
* **IDE (Ambiente de Desenvolvimento Integrado)**: IntelliJ IDEA, Eclipse ou VS Code com o pacote de extensões para Java.

### Passos para Execução

1.  **Clone ou Baixe o Projeto**:
    Se estiver usando Git, clone o repositório. Caso contrário, baixe os arquivos e extraia-os em uma pasta.

2.  **Abra o Projeto na IDE**:
    Abra sua IDE de preferência e importe o projeto. A maioria das IDEs modernas reconhecerá a estrutura do projeto automaticamente.

3.  **Execute a Aplicação**:
    * Navegue até o arquivo principal: `src/main/java/com/provas/Prova/ProvaApplication.java`.
    * Clique com o botão direito sobre o arquivo e selecione a opção **"Run 'ProvaApplication.main()'"**.
    * O menu de exercícios aparecerá no seu console, pronto para receber sua escolha.
