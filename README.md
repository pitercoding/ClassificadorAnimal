# Classificador de Animais

Este projeto é um sistema simples em Java para classificar animais com base nos seus **filos**. Ele permite cadastrar animais, listar todos os cadastrados e buscar por filos específicos. A aplicação é interativa via terminal e foi desenvolvida usando **Programação Orientada a Objetos (POO)**.

## Funcionalidades

- **Cadastrar Animais**: Permite cadastrar um animal informando nome, filo, simetria e habitat.
- **Listar Animais**: Exibe todos os animais cadastrados.
- **Buscar por Filo**: Permite buscar animais de um filo específico.
- **Interface Simples**: A interação é feita via terminal.

## Filos do Reino Animalia

O sistema classifica os animais com base nos seguintes **filos**:

- Porifera
- Cnidaria
- Platyhelminthes
- Nematoda
- Annelida
- Mollusca
- Arthropoda
- Echinodermata
- Chordata

## Estrutura do Projeto

O código está organizado da seguinte forma:

ClassificadorAnimal/ ├── Main.java # Ponto de entrada do programa ├── model/ │ ├── Animal.java # Classe que representa o Animal │ └── Filo.java # Enum com os Filos do Reino Animalia ├── service/ │ └── AnimalService.java # Lógica para cadastrar, listar e buscar animais └── util/ └── Menu.java # Interface de terminal para interação com o usuário


## Tecnologias Utilizadas

- **Java 17 ou superior**
- **Programação Orientada a Objetos (POO)**
- **Estruturas de Dados**: Lista (`ArrayList`)

## Como Rodar o Projeto

1. **Baixar o código**:
   Clone este repositório para sua máquina local:

```bash
git clone https://github.com/seu-usuario/ClassificadorAnimal.git
```
2. **Compilar o código**: Navegue até a pasta do projeto e compile os arquivos Java:

```bash
javac Main.java
```
3. **Executar o programa**: Após compilar, execute o programa:

```bash
java Main
```

4. **Interação**: O menu será exibido no terminal, permitindo que você:

* Cadastrar animais.
* Listar todos os animais.
* Buscar animais por filo.
* Sair do programa.

## Exemplo de Uso

### Cadastro de Animais:
```
=== Classificador Animal ===
1 - Cadastrar novo animal
2 - Listar todos os animais
3 - Buscar por filo
0 - Sair
Escolha uma opção: 1

Nome do animal: Minhoca
Simetria: Bilateral
Habitat: Terrestre
Escolha o filo:
- PORIFERA
- CNIDARIA
- PLATYHELMINTHES
- NEMATODA
- ANNELIDA
- MOLLUSCA
- ARTHROPODA
- ECHINODERMATA
- CHORDATA
Digite exatamente como está acima: ANNELIDA
Animal cadastrado com sucesso!
```

### Listagem de Animais:
```
=== Classificador Animal ===
1 - Cadastrar novo animal
2 - Listar todos os animais
3 - Buscar por filo
0 - Sair
Escolha uma opção: 2

Nome: Minhoca, Filo: ANNELIDA, Simetria: Bilateral, Habitat: Terrestre
```

### Buscar por Filo:
```
=== Classificador Animal ===
1 - Cadastrar novo animal
2 - Listar todos os animais
3 - Buscar por filo
0 - Sair
Escolha uma opção: 3

Digite o filo para buscar:
- PORIFERA
- CNIDARIA
- PLATYHELMINTHES
- NEMATODA
- ANNELIDA
- MOLLUSCA
- ARTHROPODA
- ECHINODERMATA
- CHORDATA
Digite exatamente como está acima: ANNELIDA
Nome: Minhoca, Filo: ANNELIDA, Simetria: Bilateral, Habitat: Terrestre
```

## Contribuições
Se você quiser contribuir com o projeto, fique à vontade para enviar um pull request. Sugestões, melhorias e correções são sempre bem-vindas!

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
