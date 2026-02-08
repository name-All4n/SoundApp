# 🎵 SoundApp - Gerenciador de Músicas e Artistas

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![JPA](https://img.shields.io/badge/Spring_Data_JPA-gray?style=for-the-badge&logo=spring&logoColor=6DB33F)

## 📝 Sobre o Projeto

O **SoundApp** é uma aplicação desenvolvida em Java utilizando o framework **Spring Boot**. O objetivo do projeto é gerenciar um catálogo de artistas e suas respectivas músicas através de uma interface de linha de comando (CLI).

A aplicação permite o cadastro de artistas (classificados por tipo), a associação de músicas a estes artistas e consultas persistidas em um banco de dados relacional.

## ⚙️ Funcionalidades

O sistema conta com um menu interativo que oferece as seguintes opções:

- **Cadastrar Artistas:** Registra novos artistas no banco de dados, categorizando-os entre:
  - Solo
  - Dupla
  - Banda
- **Cadastrar Músicas:** Associa novas músicas a um artista previamente cadastrado.
- **Listar Músicas:** Exibe todas as músicas cadastradas e seus respectivos intérpretes.
- **Buscar Músicas por Artista:** Permite pesquisar todas as músicas de um artista específico buscando por trechos do nome (Case Insensitive).

## 🛠️ Tecnologias Utilizadas

- **Java:** Linguagem principal do projeto.
- **Spring Boot:** Framework para configuração e inicialização da aplicação.
- **Spring Data JPA:** Para persistência de dados e abstração de consultas SQL.
- **Hibernate:** Implementação da JPA para mapeamento Objeto-Relacional.
- **Banco de Dados:** (Configure no `application.properties`, ex: PostgreSQL ou MySQL. Utilizei variaveis locais no `aplication.propertis`, subtitua as variaveis locais pelas creddenciais do seu banco de dados).

## 📂 Estrutura do Projeto

O projeto segue a arquitetura padrão do Spring Boot:

- `model`: Classes de entidade (`Artista`, `Musica`) e Enums (`TipoArtista`).
- `repository`: Interfaces que estendem `JpaRepository` para comunicação com o banco de dados.
- `principal`: Classe que contém a lógica de interação com o usuário (Menu e Scanners).
- `SoundappApplication`: Classe principal que inicia o contexto do Spring e executa o `CommandLineRunner`.

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior.
- Maven.
- Um banco de dados configurado (utilizei o PostgreSQL).
