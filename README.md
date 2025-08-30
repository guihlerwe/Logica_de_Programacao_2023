# Lógica de Programação

Este repositório contém os conceitos fundamentais da matéria de lógica de programação que eu aprendi durante 2023. 

## 📚 Conteúdo do Curso

### 🔄 Estrutura de Decisão
Conceitos sobre tomada de decisões no código:
- **Estruturas condicionais** (`if`, `else`, `else if`)
- **Operadores de comparação** (`>`, `<`, `==`, `!=`, `>=`, `<=`)
- **Operadores lógicos** (`&&`, `||`, `!`)
- **Estruturas condicionais aninhadas**
- **Switch/Case** para múltiplas condições

**Exemplo prático:**
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### 🔁 Laços de Repetição
Estruturas para executar código repetidamente:
- **For** - loop com contador definido
- **While** - loop com condição no início
- **Do-While** - loop com condição no final
- **Nested loops** - loops aninhados
- **Break e Continue** - controle de fluxo dos loops

**Exemplos:**
```java
// For
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// While
while (condicao) {
    // código a ser executado
}
```

### 🔢 Matrizes
Estruturas de dados bidimensionais:
- **Declaração e inicialização** de matrizes
- **Acesso aos elementos** da matriz
- **Percorrimento** de matrizes com loops aninhados
- **Operações** com matrizes (soma, multiplicação)
- **Matriz identidade, triangular, diagonal**

**Exemplo:**
```java
int[][] matriz = new int[3][3];
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        matriz[i][j] = i + j;
    }
}
```

### 🛠️ Métodos
Organização do código em funções reutilizáveis:
- **Declaração** de métodos
- **Parâmetros e argumentos**
- **Retorno de valores**
- **Sobrecarga** de métodos
- **Métodos estáticos** vs **métodos de instância**
- **Escopo** de variáveis

**Exemplo:**
```java
public static int somar(int a, int b) {
    return a + b;
}
```

### 📊 Vetores
Estruturas de dados unidimensionais:
- **Declaração e inicialização** de vetores/arrays
- **Acesso aos elementos** por índice
- **Percorrimento** com loops
- **Busca** em vetores
- **Ordenação** de vetores
- **Vetores multidimensionais**

**Exemplo:**
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

##  Pré-requisitos

- Conhecimentos básicos de matemática
- Lógica básica de resolução de problemas
- Apache NetBeans IDE instalado
- Java Development Kit (JDK) instalado:
  - **JDK 8** - Versão mínima suportada (recomendada para iniciantes)
  - **JDK 11** - Versão LTS estável
  - **JDK 17** - Versão LTS mais recente em 2023
  - **JDK 21** - Versão mais atual (lançada em setembro 2023)

##  Ferramentas Utilizadas

- **Linguagem:** Java
- **IDE:** Apache NetBeans
- **JDK:** Java Development Kit 8, 11, 17 ou 21 (compatível com NetBeans)
- **Versão NetBeans:** Apache NetBeans 17/18/19 (2023)

##  Progressão Sugerida

1. **Início:** Estrutura de Decisão
2. **Básico:** Laços de Repetição
3. **Intermediário:** Vetores
4. **Avançado:** Matrizes
5. **Organização:** Métodos

##  Dicas de Estudo

- **Pratique diariamente** - A programação requer prática constante
- **Desenhe algoritmos** antes de codificar
- **Use comentários** para explicar seu raciocínio
- **Teste sempre** seu código com diferentes valores
- **Não tenha medo de errar** - os erros são parte do aprendizado
