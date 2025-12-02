# Sistema Bancário Simples (Java POO)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Um sistema bancário via console desenvolvido para praticar os 4 pilares da Programação Orientada a Objetos (POO): **Abstração, Encapsulamento, Herança e Polimorfismo**.

O projeto simula operações bancárias essenciais sem o uso de frameworks, focando na lógica pura do Java.

## Funcionalidades

- [x] **Cadastro de Contas:** Criação de Conta Corrente e Conta Poupança.
- [x] **Saque com Polimorfismo:**
  - *Conta Corrente:* Cobra taxa de R$ 0,50 por saque.
  - *Conta Poupança:* Isenta de taxas.
- [x] **Depósito:** Adição de saldo com validação de valores positivos.
- [x] **Transferência entre Contas:** Validação de saldo na origem antes de enviar ao destino.
- [x] **Consultas:** Listagem de todas as contas cadastradas e busca por número.

## Tecnologias e Conceitos Utilizados

- **Java**
- **POO (Programação Orientada a Objetos):**
  - **Encapsulamento:** Atributos protegidos (`private`/`protected`) acessados via métodos.
  - **Herança:** `ContaCorrente` e `ContaPoupanca` herdam de `Conta`.
  - **Polimorfismo:** O método `sacar()` se comporta de forma diferente em cada tipo de conta.
  - **Abstração:** Uso de classe abstrata `Conta` para impedir a criação de contas genéricas.
- **Collections Framework:** Uso de `ArrayList` para gerenciar os dados em memória.

##  Estrutura do Projeto

```text
SistemaBancarioJava/
├── src/
│   ├── modelo/
│   │   ├── Conta.java
│   │   ├── ContaCorrente.java
│   │   └── ContaPoupanca.java
│   ├── servico/
│   │   └── BancoService.java
│   └── Main.java
└── README.md
