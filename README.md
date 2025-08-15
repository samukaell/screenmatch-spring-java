# Screenmatch: Sua biblioteca de séries e filmes! 

[![Java](https://img.shields.io/badge/Java-17-blue?style=flat&logo=java)](https://www.java.com/)
[![Spring Framework](https://img.shields.io/badge/Spring%20Framework-6.0.x-green?style=flat&logo=spring)](https://spring.io/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Descrição 

O Screenmatch é um projeto desenvolvido durante o curso "Java: trabalhando com lambdas, streams e Spring Framework" da Alura. Ele tem como objetivo fornecer uma interface simples e intuitiva para buscar informações sobre suas séries e filmes favoritos, utilizando a API do OMDB.

## Funcionalidades 

*   **Busca de séries e filmes:** Encontre informações detalhadas sobre seus títulos favoritos, como título, total de temporadas, avaliação e muito mais.
*   **Conversão de dados:** Utilize o `ConverteDados` para transformar os dados da API em objetos Java, facilitando a manipulação e exibição das informações.
*   **Integração com Spring Framework:** Aproveite os recursos do Spring Framework para criar um projeto modular, flexível e fácil de manter.
*   **Tratamento de erros:** Utilize o `try/catch` para lidar com exceções e garantir que o programa continue funcionando mesmo em situações inesperadas.
*   **Ignorar propriedades desconhecidas:** Utilize a anotação `@JsonIgnoreProperties` para evitar erros ao receber dados da API que não correspondem aos campos do seu modelo.

## Tecnologias utilizadas 

*   Java
*   Spring Framework
*   Jackson
*   Git
*   Maven

## Como executar o projeto ️

1.  Clone o repositório:

    ```bash
    git clone <https://github.com/samukaell/screenmatch-spring-java/tree/main>
    ```

2.  Abra o projeto no IntelliJ IDEA.
3.  Aguarde o Maven baixar as dependências.
4.  Execute a classe `ScreenmatchApplication`.

## Contribuição 

Sinta-se à vontade para contribuir com o projeto! Se você encontrar algum bug, tiver alguma sugestão de melhoria ou quiser adicionar novas funcionalidades, siga estas etapas:

1.  Crie um fork do repositório.
2.  Crie uma branch com a sua alteração:

    ```bash
    git checkout -b minha-alteracao
    ```

3.  Faça as alterações e adicione um commit:

    ```bash
    git add .
    git commit -m "Adiciona minha alteração"
    ```

4.  Envie as alterações para o seu repositório:

    ```bash
    git push origin minha-alteracao
    ```

5.  Crie um pull request.

