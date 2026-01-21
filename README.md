# Uso de Encapsulamento em Java

Este repositório contém exemplos de **encapsulamento em Java** utilizando três classes distintas: `Pessoa`, `JogadorFutebol` e `Elevador`. Cada classe demonstra como proteger os atributos de uma classe, fornecendo **getters** e **setters** para controlar o acesso e modificar os dados de maneira segura.

---

## Classes

### 1. Pessoa

Classe que representa uma pessoa genérica, com atributos privados e métodos públicos para acesso e manipulação.

**Atributos:**
- `nome` (String)
- `dataNascimento` (LocalDate)
- `altura` (float)

**Principais métodos:**
- `calcularIdade()`: Retorna a idade atual da pessoa.
- `imprimirDados()`: Exibe todas as informações da pessoa no console.

**Exemplo de uso:**
```java
Pessoa pessoa = new Pessoa();
pessoa.setNome("João");
pessoa.setDataNascimento(LocalDate.of(1990, 5, 20));
pessoa.setAltura(1.75f);
pessoa.imprimirDados();
```
### 2. Jogador de Futebol

Classe que representa um jogador de futebol, estendendo os conceitos de Pessoa e adicionando atributos específicos da profissão.

**Atributos:**
- `nome` (String)
- `posicao` (String)
- `dataNascimento` (LocalDate)
- `nacionalidade` (String)
- `altura` (float)
- `peso` (float)

**Principais métodos:**
- `calcularIdade()`: Retorna a idade atual do jogador.
- `imprimirDados()`: Exibe todas as informações do jogador, incluindo tempo estimado para aposentadoria.
- `tempoParaAposentadoria()`: Calcula os anos restantes para aposentadoria com base na posição.

**Exemplo de uso:**
```java
JogadorFutebol jogador = new JogadorFutebol();
jogador.setNome("Carlos");
jogador.setPosicao("Atacante");
jogador.setDataNascimento(LocalDate.of(1995, 3, 10));
jogador.setNacionalidade("Brasileiro");
jogador.setAltura(1.82f);
jogador.setPeso(78);
jogador.imprimirDados();
```

### 3. Elevador

Classe que simula o funcionamento de um elevador, protegendo seus atributos internos e fornecendo métodos de interação.

**Atributos:**
- `andarAtual` (int)
- `totalAndares` (int)
- `capacidade` (int)
- `pessoasPresentes` (int)

**Principais métodos:**
- `inicializar(capacidade, totalAndares)`: Configura a capacidade e o total de andares.
- `entrar()`: Adiciona uma pessoa ao elevador se houver espaço.
- `sair()`: Remove uma pessoa do elevador se houver alguém presente.
- `subir()`: Sobe um andar, se não estiver no topo.
- `descer()`: Desce um andar, se não estiver no térreo.
- `status()`: Exibe o status atual do elevador.

  **Exemplo de uso:**
  ```java
  Elevador elevador = new Elevador();
  elevador.inicializar(5, 10);
  elevador.entrar();
  elevador.subir();
  elevador.status();
  ```
