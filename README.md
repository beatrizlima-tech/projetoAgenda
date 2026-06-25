# 📅 Projeto Agenda

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![POO](https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-blue?style=for-the-badge)
![XML](https://img.shields.io/badge/XML-Exportação-orange?style=for-the-badge)
![TXT](https://img.shields.io/badge/TXT-Exportação-lightgrey?style=for-the-badge)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Projeto Agenda** é uma aplicação desenvolvida em **Java** para gerenciamento de compromissos, permitindo registrar eventos com participantes, data, horário e nível de prioridade.

O projeto foi desenvolvido com foco na prática de **Programação Orientada a Objetos (POO)**, aplicando conceitos como encapsulamento, interfaces, polimorfismo, enumerações, coleções e exportação de dados em diferentes formatos.

---

# 🚀 Funcionalidades

* Geração de compromissos
* Associação de participantes ao compromisso
* Definição de prioridade (Baixa, Média e Alta)
* Geração automática de identificadores únicos (UUID)
* Exportação dos dados em arquivo TXT
* Exportação dos dados em arquivo XML
* Escolha dinâmica do formato de exportação

---

# 🧱 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Java Swing (JOptionPane)
* UUID
* Collections (List)
* LocalDate
* LocalTime
* Manipulação de arquivos TXT
* Manipulação de arquivos XML

---

# 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── enums
├── interfaces
└── repositories
```

---

# 📊 Arquitetura

```text
Usuário
      │
      ▼
CompromissoController
      │
      ▼
CompromissoRepository (Interface)
      │
      ├── CompromissoRepositoryTXT
      └── CompromissoRepositoryXML
      │
      ▼
Arquivo TXT ou XML
```

---

# 📦 Exportação dos Dados

Durante a execução da aplicação, o usuário escolhe o formato desejado para exportação:

```text
1 - TXT
2 - XML
```

Após a seleção, é gerado automaticamente um arquivo contendo:

* Identificador do compromisso
* Título
* Data
* Hora
* Prioridade
* Lista de participantes

---

# 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Interfaces
* Polimorfismo
* Enumerações
* Coleções (List)
* UUID
* Manipulação de arquivos
* Tratamento de exceções
* Separação de responsabilidades

---

# ⚙️ Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoAgenda.git
```

---

## 2. Abrir o projeto

Abra o projeto em uma IDE Java, como:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

---

## 3. Executar a aplicação

Execute a classe principal.

Durante a execução, escolha o formato de exportação:

```text
1 - TXT
2 - XML
```

O arquivo será gerado automaticamente na pasta do projeto.

---

# 📌 Melhorias Futuras

* Permitir cadastro manual de compromissos
* Permitir cadastro manual de participantes
* Criar menu completo para gerenciamento
* Implementar persistência em banco de dados
* Desenvolver interface gráfica completa
* Adicionar testes automatizados
* Melhorar a formatação dos arquivos XML
* Adicionar importação de compromissos

---

# 📚 Objetivo

Este projeto foi desenvolvido para consolidar conhecimentos em Programação Orientada a Objetos, aplicando conceitos fundamentais como interfaces, polimorfismo, manipulação de arquivos e organização em camadas, simulando um pequeno sistema de gerenciamento de compromissos.

---

# 👩‍💻 Autora

**Beatriz Lima de Oliveira**

🔗 GitHub

https://github.com/beatrizlima-tech

💼 LinkedIn

https://www.linkedin.com/in/beatrizlima-tech
