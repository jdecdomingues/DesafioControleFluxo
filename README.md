# Desafio de Controle de Fluxo em Java (DIO)

Este repositório contém a resolução do **Desafio de Controle de Fluxo**, um projeto prático proposto pela **Digital Innovation One (DIO)**. A aplicação foi desenvolvida em **Java** como um programa de console.

O objetivo principal do desafio é demonstrar o entendimento e a aplicação de estruturas condicionais, laços de repetição e o tratamento de exceções em Java para criar um fluxo de execução lógico e à prova de erros.

## 🎯 O Problema Proposto

O programa foi desenhado para seguir uma lógica específica:

1.  A aplicação recebe dois números inteiros como parâmetros via terminal.
2.  Uma validação é realizada para garantir que o segundo parâmetro seja **maior** que o primeiro.
3.  **Cenário de Sucesso**: Se o segundo parâmetro for maior, o programa utiliza um laço de repetição (`for`) para imprimir no console a contagem incremental de números no intervalo entre eles.
4.  **Cenário de Erro**: Se o primeiro parâmetro for maior ou igual ao segundo, o sistema lança uma exceção customizada (`ParametrosInvalidosException`). Essa exceção é capturada e uma mensagem de erro apropriada é exibida ao usuário.

## ✨ Conceitos Aplicados

Este projeto reforça conceitos fundamentais da linguagem Java:

-   **Entrada de Dados pelo Terminal**: Utilização da classe `Scanner` para ler os dados inseridos pelo usuário.
-   **Controle de Fluxo Condicional**: Uso de `if / else` para validar a lógica dos parâmetros.
-   **Tratamento de Exceções**: Implementação de blocos `try-catch` para um tratamento de erros robusto e criação de uma classe de exceção customizada.
-   **Laços de Repetição**: Utilização do laço `for` para iterar e realizar a contagem com base nos parâmetros fornecidos.
-   **Estrutura de Classes**: Organização da lógica dentro da classe `Contador`.

## 🛠️ Tecnologias

-   **Java**: Linguagem de programação.
-   **JDK (Java Development Kit)**: Kit de desenvolvimento utilizado.

## 🚀 Como Executar

Para compilar e executar o projeto em sua máquina local, você precisará ter o JDK instalado.

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/jdecdomingues/DesafioControleFluxo.git
    ```

2.  **Acesse o diretório do projeto:**
    ```bash
    cd DesafioControleFluxo
    ```

3.  **Navegue até a pasta dos fontes:**
    ```bash
    cd src
    ```
4.  **Compile o arquivo Java:**
    ```bash
    javac Contador.java
    ```

5.  **Execute o programa compilado:**
    ```bash
    java Contador
    ```

6.  Siga as instruções que aparecerão no terminal para inserir os dois números e testar a aplicação.
