# GestaoPessoas2026

API REST desenvolvida com Spring Boot para simular operações de cadastro, consulta, atualização e remoção de pessoas.

## Objetivo

Projeto acadêmico desenvolvido para demonstrar os conceitos de:

* Arquitetura em camadas
* Injeção de Dependência (Dependency Injection)
* APIs REST com Spring Boot
* Tratamento centralizado de exceções
* Serialização de objetos
* Manipulação de JSON

## Tecnologias Utilizadas

* Java 17
* Spring Boot 3.2.0
* Spring Web
* Spring Boot DevTools
* Maven

## Estrutura do Projeto

```text
src/main/java/br/com/exemplo/gestaopessoas2026

├── controller
│   ├── PessoaController
│   └── TesteExcecoesController
│
├── services
│   └── PessoaService
│
├── model
│   └── Pessoa
│
├── exceptions
│   ├── ExceptionResponse
│   ├── RequisicaoInvalidaException
│   └── AcessoNaoAutorizadoException
│
├── handle
│   └── CustomExceptionHandler
│
└── GestaoPessoas2026Application
```

## Modelo Pessoa

A entidade Pessoa possui os seguintes atributos:

| Campo     | Tipo   |
| --------- | ------ |
| id        | Long   |
| nome      | String |
| sobrenome | String |
| endereco  | String |
| genero    | String |

A classe implementa Serializable e sobrescreve os métodos equals() e hashCode().

## Endpoints da API

### Buscar pessoa por ID

```http
GET /pessoas/{id}
```

Exemplo:

```http
GET /pessoas/1
```

### Buscar todas as pessoas

```http
GET /pessoas
```

### Criar pessoa

```http
POST /pessoas
Content-Type: application/json
```

Exemplo:

```json
{
  "id": 1,
  "nome": "João",
  "sobrenome": "Silva",
  "endereco": "Rua Central",
  "genero": "Masculino"
}
```

### Atualizar pessoa

```http
PUT /pessoas
Content-Type: application/json
```

Exemplo:

```json
{
  "id": 1,
  "nome": "João",
  "sobrenome": "Souza",
  "endereco": "Rua Atualizada",
  "genero": "Masculino"
}
```

### Remover pessoa

```http
DELETE /pessoas/{id}
```

Exemplo:

```http
DELETE /pessoas/1
```

## Teste de Exceções

A aplicação possui endpoints específicos para testar o tratamento centralizado de exceções.

### Erro Interno

```http
GET /teste/int/{v1}
```

Exemplo:

```http
GET /teste/int/0
```

### Requisição Inválida

```http
GET /teste/bad/{v1}
```

Exemplo:

```http
GET /teste/bad/0
```

### Acesso Não Autorizado

```http
GET /teste/nao/{v1}
```

Exemplo:

```http
GET /teste/nao/0
```

## Tratamento de Exceções

A API utiliza uma classe global de tratamento de erros chamada:

```java
CustomExceptionHandler
```

As seguintes exceções são tratadas:

* Exception
* RequisicaoInvalidaException
* AcessoNaoAutorizadoException

Resposta padrão de erro:

```json
{
  "timestamp": "2026-01-01T10:00:00",
  "message": "Mensagem da exceção",
  "detail": "Descrição detalhada do erro"
}
```

## Executando o Projeto

### Clonar o repositório

```bash
git clone <url-do-repositorio>
```

### Entrar na pasta do projeto

```bash
cd GestaoPessoas2026
```

### Executar via Maven

```bash
mvn spring-boot:run
```

Ou:

```bash
./mvnw spring-boot:run
```

## URL Base

```text
http://localhost:8080
```

## Autor

Projeto desenvolvido para a disciplina de Desenvolvimento Web com Spring Boot, com foco em APIs REST, Injeção de Dependência e Tratamento de Exceções.
