# Lógica de Programação

## Introdução à Computação e à Lógica Computacional

### Introdução à computação

- O computador é uma máquina eletrônica programável capaz de processar, armazenar e recuperar informações de dados;
- No começo serviam apenas para calcular operações básicas, como: soma, subtração, multiplicação e divisão;
- Em 1946 foi anunciado o primeiro computador digital, conhecido como ENIAC (Electrical Numerical Integrator and Calculator);
- No período de 1951 a 1959 surgiu a primeira geração de computadores. Esses eram capazes de realizar cálculos em milésimos de segundos e programados utilizando a linguagem de máquina;
- De 1959 a 1965 surgiu a segunda geração dos computadores, os quais calculavam a uma velocidade de microssegundos e eram programados em linguagem de montadora;
- A terceira geração surgiu entre 1965 a 1975, quando os equipamentos passaram a ter diversos componentes miniaturizados e montados em um único chip, bem como a realizar operações em nano segundos;
- Durante o período de 1975 a 1981 apareceram os computadores da quarta geração. Seguindo a tendência da geração anterior, os componentes continuaram miniaturizados e os circuitos integrados (CI) aperfeiçoados;
- Na Idade Moderna o computador é dividido em unidades lógicas, sendo elas:
  - **Unidade de entrada**: recebe informações obtidas por meio de periféricos, como: teclado, mouse, impressora, câmera, touch, dentre outros, que fornecem dados ao computador;
  - **Unidade de saída**: ilustra as informações ao usuário, que podem ser exibidas por meio do monitor de computador ou impressas em uma folha de papel usando dispositivo de impressão, ou seja, tornando a informação acessível externamente;
  - **Memória principal**: o computador possui a opção de armazenamento de informações para processamento no sistema operacional e em programas computacionais;
  - **Unidade de processamento central**: do inglês central process unit (CPU), concentra todas as operações lógicas e aritméticas, tornando-se o principal item do computador;
  - **Unidade de armazenamento secundária**: quando tratamos dessa unidade, pensamos em dispositivos que possuem grande capacidade de armazenamento a longo prazo, exemplos: HD, SSD, pen drive, DVD, CD etc.

### Noções de lógica

- Pensar logicamente se refere ao ato de raciocinar a fim de resolver determinado problema, ou refletir sobre um assunto;
- Pensar logicamente é muitas das vezes utilizado em pesquisas científicas, testando hipóteses e ajustando as metodologias conforme se obtém os resultados.

#### O que é lógica

- A lógica está correlacionada aos pensamentos que têm coerência e racionalidade, sendo assim um conjunto de ideias para atingir o objetivo, esse tema foi estudado por Aristóteles (384 a.C - 322 a.C);
- Compreender e utilizar a lógica em nossas atividades consequentemente gera facilidades durante a resolução de problemas;
- Podemos nos tornar mais estrategistas em organizar e desenvolver ideias brilhantes para qualquer atividade que tenhamos que realizar.

#### Relação entre lógica e programação

- Podemos definir _programação_ como o processo de escrita do programa de computador, a realização de testes e a manutenção;
- O programa escrito utiliza todo o conjunto de semântica e sintaxe de uma linguagem, reunindo um conjunto de técnicas, como lógica, conhecimento na linguagem de programação e compreensão do problema;
- A relação da lógica com a programação pode ser definida como o conjunto de pensamentos e ideias que nos faz refletir sobre as estratégias até chegarmos a uma solução viável.

### Algoritmos

- Um algoritmo é considerado uma sequência lógica ordenada de ações aplicadas à resolução de algum problema;
- São amplamente utilizados em áreas da ciência e principalmente em exatas;
- O algoritmo está diretamente associado à etapa do desenvolvimento de um software;
- Exemplo de um algoritmo para calcular três números:
  - Passo 1: receba três números;
  - Passo 2: multiplique os três números;
  - Passo 3: mostre o resultado.

#### A importância da construção de algoritmos

- A construção de um algoritmo é realizada quando as ações já estão definidas para a solução de um problema;
- O próprio sistema operacional é um conjunto de soluções implementado utilizando a lógica e as pesquisas científicas para chegar à solução atual;
- A importância dos algoritmos é tão grande que outras áreas, como a medicina, a bioinformática, a engenharia, entre outras, utilizam softwares implementados por desenvolvedores para avaliar ou simular alguma solução.

#### Modos de retratar a lógica

##### Fluxogramas

- O fluxograma consiste na análise e na escrita do problema por meio de símbolos gráficos que representam as ações ou as instruções a serem seguidas;
- A estrutura de um fluxograma é muito utilizada na organização do pensamento, na documentação de rotinas de sistemas, e seu uso é recomendado para problemas pequenos, como ilustrado a seguir:
  ![Diagrama multiplicação três números](/02_logica_de_programacao/img/diagrama001.png)
- Para a construção de fluxogramas utilizamos uma simbologia. Iniciamos com o terminal; em seguida, utilizamos as setas para mostrar qual o próximo processamento, no caso, o símbolo de teclado para entrada dos dados e o de retângulo, também conhecido como processamento, para realização dos cálculos; depois, usamos o símbolo de vídeo para exibir o resultado; por fim, finalizamos com o terminal;
- Simbologia do fluxograma:
  ![Simbologia do fluxograma](/02_logica_de_programacao/img/diagrama002.png)

##### Pseudocódigos

- Pseudocódigo, também conhecido como portugol, é a maneira utilizada para analisar e escrever a solução de um problema de fácil entendimento;
- Possui a vantagem de ser escrito em linguagem próxima à linguagem de programação, respeitando a sintaxe e a semântica;
- Descrição do algoritmo de multiplicação de três números em pseudocódigo:

  ```
  Var
    N1, N2, N3: Numerico
  Inicio
    Escreva “Digite três números: ”
    Leia (N1, N2, N3)
    R <- (N1 * N2 * N3)
    Escreva (“Multiplicação = ”, R)
  Fimalgoritmo
  ```

- O pseudocódigo possui uma desvantagem que muitos poderiam dizer ser redundante.

### Teste de mesa

- Testes de mesa tem como finalidade o teste lógico do algoritmo, no qual, conhecendo a entrada de informação e todo o processamento interno do algoritmo, a saída deve corresponder ao resultado esperado;
- Testes de mesa geralmente são utilizados para problemas simples;
- Para testes complexos existem ferramentas que auxiliam nos teste e até mesmo do desenvolvimento, realizando o teste de modo indireto e exibindo a linha do provável erro.

### Ambientes de programação

- IDE (Integrated Development Environment - Ambiente de Programação Integrado);
  - Sistema desenvolvido que unifica vários plugins em um única ferramente (DEITEL; DEITEL, 2009);
  - No geral, inclui um editor para a escrita e a edição dos arquivos, depuradores utilizados na localização de prováveis erros lógicos;
  - A utilização de uma IDE traz benefícios como o aumento na produtividade do desenvolvedor, a economia financeira e, principalmente, o desempenho no desenvolvimento.

## Linguagem de programação Java I

### A linguagem de programação Java

- A primeira versão estável da linguagem Java ficou concluída em 1996;
- O Java possui 11 características-chave que fazem com que seja um bom recurso para o desenvolvedor, são elas:
  - Simplicidade;
  - Orientação a objetos;
  - Compatibilidade com redes;
  - Robustez;
  - Segurança;
  - Arquitetura neutra;
  - Portabilidade;
  - Interpretação;
  - Alto desempenho;
  - Múltiplas threads;
  - Dinamicidade.
- É uma linguagem _compilada e interpretada_;
  - O código Java (.java) é compilado em _bytecode_ (.class);
  - O bytecode é interpretado pela **JVM** (Java Virtual Machine - Máquina Virtual Java), isso permite a portabilidade da linguagem, pois basta o sistema operacional possuir a JVM instalada que os programas feitos em Java podem ser executados.

### Conceitos básicos da linguagem Java

- Abaixo um exemplo de um programa que exibe a mensagem **Hello World** feito em Java:

  ```
  public class HelloWorld {
    public static void main (String [] args) {
      System.out.println ("Hello World!");
    }
  }
  ```

  - Na primeira linha informamos que se trata de uma _classe_ (class), _publica_ (public), seu nome é _HelloWorld_, e por fim, a _abertura da chave de bloco_ ({);
    - Uma boa prática no desenvolvimento da linguagem Java é a nomenclatura das **classes** usar o padrão **PascalCase**, onde a primeira letra de cada palavra é iniciada com letra maiúscula, exemplo: **NomeDaClasseEmPascalCase**;
  - Na segunda linha define o método principal que inicia a execução do programa Java, nela definimos que é um método _publico_ (public), possui um modificador de acesso _estático_ (static), não possui _retorno_ (void), seu nome é _main_, possui como entrada um _lista de textos_ (String [] args), e por fim, a abertura da chave de bloco ({);
    - Para nomenclatura de **métodos** e **variáveis** em Java, usamos o padrão **camelCase**, onde a primeira letra da primeira palavra é minúscula, seguindo da primeira letra das palavras restantes em maiúscula, exemplo: metodoEmCamelCase;
  - Na terceira linha utilizamos o **objeto** _System.out.println_ para comandar o computador à fazer a saída do texto ("Hello World!"), por fim, utilizamos o _ponto e vírgula_ ( ; ) para finalizar o comando;
    - Todo comando em Java tem que ser finalizado com ponto e vírgula;
  - Na quarta e quinta linha, temos os fechamentos das chaves de blocos da classe e do método;
    - Toda classe e método em Java precisam ter as chaves de abertura e fechamento, chamamos isso de **escopo**, onde todo o código inserido entre as chaves de abertura e fechamento, pertencem ao escopo daquele bloco;
  - **Observação**: a nomenclatura de classes, métodos e variáveis em Java, não poder ser iniciados com número ou caracteres especiais, salvo o caractere _underline_ ( \_ ), já no corpo no do nome é permitido números, mas não é permitido caracteres especiais salvo o underline, exemplos:
    Nome | Permissão
    --------|----------
    001Classe | N
    Classe001 | S
    metodoAçúcar | N
    metodoAcucar | S
    $variavel | N
    \_variavel | S

#### Comentários

- Muitas das vezes precisamos deixar comentários nos códigos, no Java existem dois tipos de comentários:

  - _Comentário de Linha_: utilizamos duas barras // e em seguida o texto do comentário, muito utilizado para comentários simples;
  - _Comentário de bloco_: utilizamos a barra com asteriscos, onde o texto fica entre elas, mais utilizado para comentários maiores ou documentação;
  - Exemplo:

    ```
    /*
      Esse é um
      comentário de
      bloco
    */

    public class HelloWorld {

      // Esse é um comentário de linha

      public static void main (String [] args) {
        System.out.println ("Hello World!");
      }
    }
    ```

  - Na hora da compilação do código Java para bytecode, o compilador ignora os texto descritos nos comentários.

#### Tipos de dados primitivos

- O Java é considerado uma linguagem **fortemente tipada**, isso significa todos os dados que são utilizados pela linguagem devem possuir um tipo definido, abaixo temos uma tabela com os dados _primitivos_ suportados pela linguagem:
  Tipo | Categoria | Quantidade de bits | Valores | Observação
  -----|-----------|--------------------|---------|-----------
  char | numérico | 16 | \u000 a \uFFF | utilizado para caracteres
  byte | numérico | 8 | -128 a 127 | números inteiros
  short | numérico | 16 | -32.768 a 32.767 | números inteiros
  int | numérico | 32 | -2.147.483.648 a 2.147.483.647 | números inteiros
  long | numérico | 64 | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | números inteiros
  float | numérico | 32 | -3.40292347E+38 a 3.40292347E+38 | números com casas decimais
  double | numérico | 64 | -1.797.693.134.862.315.70E+308 a 1.797.693.134.862.315.70E+308 | números com casas decimais
  boolean | lógico |8 | true ou false | controle de decisão

#### Variáveis

- Podemos definir uma variável como uma _caixinha_ na memória onde iremos guardar um valor;
- Na linguagem de programação Java, as variáveis são utilizadas para armazenar os dados que serão utilizados posteriormente;
- Uma variável em Java precisa ter o seu tipo definido;
- Variáveis em Java podem ter seus valores trocados, mas não os seus tipos;
- Exemplo de uma variável:

  ```
  int numero1 = 10;
  ```

  - No exemplo acima, criamos uma variável do tipo _inteiro_ (int), seu nome é _numero1_, atribuímos à ela o valor _10_, e por fim, finalizamos o comando com ponto e vírgula;

#### Operadores aritméticos, relacionais e lógicos

##### Operadores aritméticos

| Operador | Significado   |
| :------: | ------------- |
|    -     | Subtração     |
|    +     | Soma          |
|    \*    | Multiplicação |
|    /     | Divisão       |

- Exemplos:

```
 public class OperadoresAritmeticos {
   public static void main (String [] args) {
     int subtracao = 25 - 10;
     int soma = 25 + 25;
     int multiplicacao = 15 * 10;
     int divisao = 36 / 6;

     System.out.println("Resultado da subtração: " + subtracao);
     System.out.println("Resultado da soma: " + soma);
     System.out.println("Resultado da multiplicação: " + multiplicacao);
     System.out.println("Resultado da divisão: " + divisao);
   }
 }
```

##### Operadores relacionais

| Operador | Significado        |
| :------: | ------------------ |
|    ==    | Igual a            |
|    !=    | Diferente          |
|    >     | Maior que          |
|    <     | Menor que          |
|    >=    | Maior ou igual que |
|    <=    | Menor ou igual que |

- Exemplos:

```
 public class OperadoresRelacionais {
   public static void main (String [] args) {
     System.out.println(2 == 2);
     System.out.println(2 != 2);
     System.out.println(2 > 2);
     System.out.println(2 < 2);
     System.out.println(2 >= 2);
     System.out.println(2 <= 2);
   }
 }
```

##### Operadores lógicos

| Operador |      Significado      |
| :------: | :-------------------: |
|    &     |          AND          |
|    \|    |          OR           |
|    ^     |  XOR (exclusive OR)   |
|   \|\|   | OR de curto-circuito  |
|    &&    | AND de curto-circuito |
|    !     |          NOT          |

##### Ordem de procedência

|   Classificação mais alta    |             |     |     |            |           |
| :--------------------------: | :---------: | :-: | :-: | :--------: | :-------: |
|         ++(prefixo)          | --(prefixo) |     |     |            |           |
|         ++(posfixo)          | --(prefixo) |  ~  |  !  | +(unário)  | -(unário) |
|              \*              |      /      |  %  |     |            |           |
|              +               |      -      |     |     |            |           |
|              >>              |     >>>     | <<  |     |            |           |
|              >               |     >=      |  <  | <=  | Instanceof |           |
|              ==              |     !=      |     |     |            |           |
|              &               |             |     |     |            |           |
|              ^               |             |     |     |            |           |
|              \|              |             |     |     |            |           |
|              &&              |             |     |     |            |           |
|             \|\|             |             |     |     |            |           |
|              ?:              |             |     |     |            |           |
|              ->              |             |     |     |            |           |
|              =               |     op=     |     |     |            |           |
| **Classificação mais baixa** |             |     |     |            |           |

### Estruturas de decisão

- As estruturas de decisão são aplicadas no fluxo de execução dos algoritmos, possibilitando caminhos alternativos e a leitura de blocos que satisfaçam as condições (FILGUEIRAS, 2015);

#### IF - ELSE

- Exemplo de **IF** para aplicar um desconto de 15%:

```
  public class ExemploIF {
    public static void main (String [] args) {
      double valorProduto = 29.99;
      boolean temDesconto = true;
      double percentualDesconto = 0.15;

      if(temDesconto == true) {
        valorProduto = valorProduto - (valorProduto * percentualDesconto);
      }

      System.out.println("Valor do produto: " + valorProduto);
    }
  }
```

- Exemplo de **IF - ELSE** para verificar se o número é par:

```
  public class ExemploIFELSE {
    public static void main (String [] args) {
      int numero = 15;

      if(numero % 2 == 0) {
        System.out.println("O número é par!");
      } else {
        System.out.println("O número é ímpar!");
      }
    }
  }
```

- Exemplo de **IF - ELSE aninhado** para verificar o dia da semana:

```
  public class ExemploIFELSEAninhado {
    public static void main (String [] args) {
      int diaDaSemana = 3;

      if(diaDaSemana == 1) {
        System.out.println("Domingo");
      } else if(diaDaSemana == 2) {
        System.out.println("Segunda-feira");
      } else if(diaDaSemana == 3) {
        System.out.println("Terça-feira");
      } else if(diaDaSemana == 4) {
        System.out.println("Quarta-feira");
      } else if(diaDaSemana == 5) {
        System.out.println("Quinta-feira");
      } else if(diaDaSemana == 6) {
        System.out.println("Sexta-feira");
      } else if(diaDaSemana == 7) {
        System.out.println("Sábado");
      } else {
        System.out.println("Dia incorreto");
      }
    }
  }
```

#### Operador ternário

- Exemplo de **Operador ternário** para verificar se um número é par:

```
  public class ExemploIFELSEAninhado {
    public static void main (String [] args) {
      int numero = 12;
      String resposta = (numero % 2 == 0) ? "O número é par!" : "O número é ímpar!";

      System.out.println(resposta);
  }
```

## Linguagem de programação Java II

### Estrutura de controle

- O fluxo de controle SWITCH é uma abordagem na qual são verificados os valores na chamada do fluxo, em que somente podemos utilizar alguns tipos de dados, como int, short, byte e char;
- Exemplo da estrutura de controle **Switch Case**, para verificar o dia da semana:

```
  public class ExemploSwitchCase {
    public static void main (String [] args) {
      int diaDaSemana = 3;

      switch (diaDaSemana) {
        case 1:
          System.out.println("Domingo");
          break;
        case 2:
          System.out.println("Segunda-feira");
          break;
        case 3:
          System.out.println("Terça-feira");
          break;
        case 4:
          System.out.println("Quarta-feira");
          break;
        case 5:
          System.out.println("Quinta-feira");
          break;
        case 6:
          System.out.println("Sexta-feira");
          break;
        case 7:
          System.out.println("Sábado");
          break;
        default:
          System.out.println("Dia incorreto");
          break;
      }
    }
  }
```

### Fluxo de repetição

O fluxo de repetição, também conhecido como laços de repetição (do inglês, loops), é muito útil quando queremos repetir uma série de operações que serão executadas.

#### Operador de incremento e decremento

| Operador | Nome do operador | Expressão de exemplo |
| :------: | :--------------: | :------------------: |
|    ++    |  Pré-incremento  |         ++a          |
|    --    |  Pré-decremento  |         --a          |
|    ++    |  Pós-incremento  |         b++          |
|    --    |  Pós-decremento  |         b--          |

- Exemplo:

```
  public class ExemploIncrementoDecremento {
    public static void main (String [] args) {
      int a = 7;
      int b = 8;

      System.out.println(“Valor da variável A: ” + a);
      System.out.println("");

      System.out.println(“Pós-incremento: ” + a++);
      System.out.println(“Valor da variável A: ” + a);
      System.out.println("");

      System.out.println(“Pré-incremento: ” + ++a);
      System.out.println(“Valor da variável A: ” + a);
      System.out.println("");

      System.out.println(“Valor da variável B: ” + b);
      System.out.println("");

      System.out.println(“Pós-decremento: ” + b--);
      System.out.println(“Valor da variável B: ” + b);
      System.out.println("");

      System.out.println(“Pré-decremento: ” + --b);
      System.out.println(“Valor da variável B: ” + b);
      System.out.println("");
    }
  }
```

#### Fluxo de repetição FOR

- O fluxo, ou laço, de repetição FOR é utilizado quando se conhece quantas iterações ou repetições serão realizadas;
- Sintaxe:

  ```
  for (valor inicial; teste booleano; incremento)
  { <expressão> }
  ```

- Exemplo de **FOR** calculando a tabuada de um número:
  ```
    public class ExemploFOR {
      public static void main (String [] args) {
        for(int i = 1; i < 11; i++) {
          System.out.println("5 x " + i + " = " + 5 * i);
        }
      }
    }
  ```

#### Fluxo de repetição WHILE

- Utilizamos a repetição WHILE quando a informação de quantas vezes o bloco de expressão será executado é desconhecida, até que determinada condição booleana seja verdadeira.
- Sintaxe:

  ```
  While ( condição ) { <instrução> }
  ```

- Exemplo de **WHILE** para calcular o juros de um investimento por 30 à uma taxa de 10% ao ano:

  ```
    public class ExemploWHILE {
      public static void main (String [] args) {
        double valorInvestimento = 5000.0;
        double taxaJuros = 0.10;
        int ano = 1;

        System.out.printf("Investimento inicial: %.2f", valorInvestimento);
        System.out.println("");

        while (ano < 31) {
            valorInvestimento += valorInvestimento * taxaJuros;
            System.out.printf("Ano %d = %.2f", ano++, valorInvestimento);
            System.out.println("");
        }
      }
    }
  ```

#### Fluxo de repetição DO... WHILE

- O repetidor DO... WHILE, diferente do WHILE, é executado pelo menos uma vez, ou seja, o bloco de instrução é efetuado uma única vez. Posteriormente, ele verifica se as condições foram satisfeitas para sair da repetição;

- Sintaxe:
  ```
    do {
    <instrução>
    }while( <condição> )
  ```
- Exemplo **DO... WHILE**:

  ```
    public class ExemploWHILE {
      public static void main (String [] args) {
        boolean validador = false;

        do{
          System.out.println("Exemplo DO... WHILE");
        } while (validador == true);
      }
    }
  ```
