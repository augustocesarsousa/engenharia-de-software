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
