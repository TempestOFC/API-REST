# 🚀 GestaoPessoas2026

API REST desenvolvida com **Spring Boot** para simular operações de gerenciamento de pessoas, aplicando conceitos de arquitetura em camadas, injeção de dependência e tratamento centralizado de exceções.

## 📋 Sobre o Projeto

O projeto foi desenvolvido com o objetivo de praticar os principais conceitos do desenvolvimento de APIs REST utilizando Spring Boot.

A aplicação permite:

* ✅ Cadastrar pessoas
* ✅ Consultar uma pessoa por ID
* ✅ Listar todas as pessoas
* ✅ Atualizar dados de uma pessoa
* ✅ Remover pessoas
* ✅ Testar tratamento personalizado de exceções

> Este projeto utiliza armazenamento em memória (mock), sem integração com banco de dados.

---

## 🛠 Tecnologias Utilizadas

* Java 17
* Spring Boot 3.2.0
* Spring Web
* Spring Boot DevTools
* Maven

---

## 📂 Estrutura do Projeto

```text
src/main/java/br/com/exemplo/gestaopessoas2026

├── controller
│   ├── PessoaController.java
│   └── TesteExcecoesController.java
│
├── services
│   └── PessoaService.java
│
├── model
│   └── Pessoa.java
│
├── exceptions
│   ├── ExceptionResponse.java
│   ├── RequisicaoInvalidaException.java
│   └── AcessoNaoAutorizadoException.java
│
├── handle
│   └── CustomExceptionHandler.java
│
└── GestaoPessoas2026Application.java
```

---

## 👤 Modelo Pessoa

```json
{
  "id": 1,
  "nome": "João",
  "sobrenome": "Silva",
  "endereco": "Rua Central",
  "genero": "Masculino"
}
```

---

## 🔗 Endpoints

### Buscar pessoa por ID

```http
GET /pessoas/{id}
```

### Buscar todas as pessoas

```http
GET /pessoas
```

### Criar pessoa

```http
POST /pessoas
```

#### Body

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
```

### Excluir pessoa

```http
DELETE /pessoas/{id}
```

---

## ⚠️ Tratamento de Exceções

A aplicação possui um manipulador global de exceções implementado através da classe:

```java
CustomExceptionHandler
```

### Exceções Personalizadas

* `RequisicaoInvalidaException`
* `AcessoNaoAutorizadoException`

### Exemplo de resposta

```json
{
  "timestamp": "2026-01-01T10:00:00",
  "message": "Pessoa não encontrada",
  "detail": "uri=/pessoas/10"
}
```

---

## 🧪 Endpoints de Teste

### Erro interno

```http
GET /teste/int/{v1}
```

### Bad Request

```http
GET /teste/bad/{v1}
```

### Unauthorized

```http
GET /teste/nao/{v1}
```

---

## ▶️ Executando o Projeto

### Clonar o repositório

```bash
git clone https://github.com/SEU-USUARIO/gestaopessoas2026.git
```

### Entrar na pasta

```bash
cd gestaopessoas2026
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

Ou

```bash
./mvnw spring-boot:run
```

---

## 🌐 Acesso

Após iniciar a aplicação:

```text
http://localhost:8080
```

Exemplo:

```text
http://localhost:8080/pessoas
```

---

## 🎓 Projeto Acadêmico

Projeto desenvolvido para a disciplina de Desenvolvimento Web utilizando Spring Boot, com foco em:

* APIs REST
* Injeção de Dependência
* Arquitetura em Camadas
* Tratamento de Exceções
* Serialização de Objetos

---

## 👨‍💻 Autor

Desenvolvido por **Victor Hugo Marques Leite**.
