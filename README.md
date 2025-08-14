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
