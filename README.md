# 📅 Projeto Agenda

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![POO](https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-blue?style=for-the-badge)
![XML](https://img.shields.io/badge/XML-Exportação-orange?style=for-the-badge)
![TXT](https://img.shields.io/badge/TXT-Exportação-lightgrey?style=for-the-badge)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)

---

## 📌 Sobre o projeto

O **Projeto Agenda** é uma aplicação desenvolvida em **Java** para geração de compromissos com participantes, data, hora e nível de prioridade.

O projeto foi criado com foco na prática de **Programação Orientada a Objetos**, utilizando conceitos como encapsulamento, enumerações, interfaces, polimorfismo, listas, UUID e exportação de dados em arquivos TXT e XML.

---

## 🚀 Funcionalidades

* ✅ Geração de compromissos
* ✅ Associação de participantes ao compromisso
* ✅ Definição de prioridade
* ✅ Geração de identificadores únicos com UUID
* ✅ Exportação de dados em arquivo TXT
* ✅ Exportação de dados em arquivo XML
* ✅ Escolha dinâmica do formato de exportação

---

## 🧱 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* Swing / JOptionPane
* UUID
* LocalDate
* LocalTime
* TXT
* XML

---

## 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── enums
├── interfaces
└── repositories
```

---

## 📊 Arquitetura

```text
CompromissoController
        │
        ▼
CompromissoRepository (Interface)
        │
        ├── CompromissoRepositoryTXT
        │
        └── CompromissoRepositoryXML
        │
        ▼
Arquivo TXT ou XML
```

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Enum
* Interface
* Polimorfismo
* Manipulação de arquivos
* Listas
* UUID
* Tratamento de exceções
* Separação de responsabilidades

---

## 📦 Exportação dos Dados

O sistema permite escolher o formato de exportação do compromisso:

```text
1 - TXT
2 - XML
```

Após a escolha, o arquivo é gerado contendo os dados do compromisso e seus participantes.

---

## ⚙️ Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoAgenda.git
```

---

### 2. Abrir em uma IDE Java

Abra o projeto em uma IDE de sua preferência, como:

* IntelliJ IDEA
* Eclipse
* VS Code

---

### 3. Executar a aplicação

Execute a classe principal do projeto.

Durante a execução, escolha o formato de exportação desejado:

```text
1 - TXT
2 - XML
```

---

## 📌 Melhorias Futuras

* [ ] Permitir cadastro manual dos dados do compromisso
* [ ] Permitir cadastro manual de participantes
* [ ] Criar menu com mais opções de gerenciamento
* [ ] Adicionar persistência em banco de dados
* [ ] Criar interface gráfica mais completa
* [ ] Adicionar testes automatizados
* [ ] Melhorar a formatação do arquivo XML gerado

---

## 👩‍💻 Autora

**Beatriz Lima de Oliveira**

🔗 GitHub:
https://github.com/beatrizlima-tech
