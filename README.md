# 📌 Spring MockMVC Demo

Este projeto demonstra como **habilitar testes com Spring Boot** utilizando **MockMvc** para testar endpoints de forma simples e isolada.

---

## 🚀 Objetivo
- Criar um Controller simples com endpoint `GET /hello`.
- Testar o endpoint usando **MockMvc**.
- Demonstrar um teste de integração simulando requisições HTTP sem precisar subir o servidor.

---

## 🗂 Estrutura do Projeto

```text
spring-mockmvc-demo/
├── build.gradle.kts
├── src
│ ├── main
│ │ └── java/com/example/springmockmvc
│ │ ├── SpringMockMvcDemoApplication.java
│ │ └── controller/HelloController.java
│ └── test
│ └── java/com/example/springmockmvc/controller
│ └── HelloControllerTest.java
```
---

## 📜 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Web**
- **JUnit 5**
- **MockMvc**
- **Gradle Kotlin DSL**

---

## 🔹 Exemplo de Endpoint
**Request:**
```http
GET /hello
```

## 🧪 Executando os Testes

```bash

./gradlew test

```

## 📊 Fluxograma – Ciclo de Teste com MockMvc

```mermaid
flowchart TD
    A[Início do Teste] --> B[MockMvc envia requisição GET /hello]
    B --> C[Controller processa a requisição]
    C --> D[Retorna resposta "Hello World"]
    D --> E[MockMvc valida Status HTTP 200]
    E --> F[MockMvc valida conteúdo da resposta]
    F --> G[Fim do Teste - Sucesso]
```
