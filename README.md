# BarberShop SaaS (Fullstack)

Sistema de agendamento para barbeiros em desenvolvimento, composto por uma API backend e uma interface web.

---

## Status do Projeto

Projeto em desenvolvimento

Atualmente implementado:
- Sistema de cadastro e login de usuários

Em desenvolvimento:
- Sistema de agendamentos
- Dashboard do barbeiro
- Controle de horários

---

## Estrutura do Projeto

barbershop/
├── backend/   # API Spring Boot
├── frontend/  # Interface web

---

## Tecnologias

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL

### Frontend
- HTML5
- CSS3
- JavaScript

---

## Problema

Barbeiros utilizam ferramentas informais como WhatsApp e papel para gerenciar agendamentos, causando conflitos de horário e desorganização.

---

## Solução (visão do projeto)

Sistema web onde barbeiros poderão:
- Gerenciar sua agenda
- Definir horários disponíveis
- Receber agendamentos de clientes

---

## Funcionalidades

### Implementado
- Cadastro de usuário
- Login com autenticação

### Em desenvolvimento
- Criação de agendamentos
- Listagem de agendamentos
- Controle de horários disponíveis

---

## Como rodar o projeto

### Backend

cd backend

Configurar application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/barbershop  
spring.datasource.username=SEU_USUARIO  
spring.datasource.password=SUA_SENHA  

Executar:

./mvnw spring-boot:run

---

### Frontend

cd frontend

npx serve .

---

## Endpoints disponíveis

POST   /register   -> Cadastro de usuário  
POST   /login      -> Login  

---

## Decisões técnicas

- Arquitetura em camadas (Controller → Service → Repository)
- Separação entre frontend e backend
- API REST

---

## Contribuidores

- Edimar David dos Santos Junior (Backend)
- Fernando Mendes de Oliveira Filho

---

## Próximos passos

- Implementar sistema de agendamento com validação de conflito
- Adicionar autenticação com JWT
- Criar dashboard do barbeiro
- Realizar deploy da aplica
