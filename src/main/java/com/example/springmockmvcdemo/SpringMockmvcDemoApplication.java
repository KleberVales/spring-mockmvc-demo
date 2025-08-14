package com.example.springmockmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMockmvcDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMockmvcDemoApplication.class, args);
    }
}

/*

    - Criar projeto spring-mockmvc-demo.
    - Configurar dependências de teste (spring-boot-starter-test).
    - Criar um Controller simples e testar com MockMvc usando:

            mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
*/
