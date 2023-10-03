# Estrutura de Dados

## A informação no computador

- O computador é binário. Isso significa que toda informação em seu interior, até mesmo as instruções dos programas que ele executará, será codificada como uma sequência de vários 0 e 1 intercalados;
- Quem realiza a interpretação de toda essa informação é o processador.

### A memória

- Toda a informação do computador está presente na memória. Porém, ela não é um único componente, uniforme;
- A memória pode variar de maneira tanto física, estando presente em dispositivos diferentes, quanto lógica, em áreas organizadas pelo sistema operacional.

#### Dispositivos de memória

- Existe uma série de dispositivos responsáveis por armazenar informação no computador, que variam em diversas características, como a abundância de informação que são capazes de armazenar, a velocidade de acesso, a durabilidade e o custo;
- De acordo com Tanenbaum e Bos (2016), todos os dispositivos são colocados em duas grandes categorias: os voláteis e os não voláteis;
- Memória volátil:
  - MEMÓRIA CACHE: Pouco abundante, mas muitíssimo veloz. Encontra-se fisicamente perto do processador, quando não está ligada diretamente a ele. Essa proximidade evita a perda de velocidade no transporte da informação;
  - MEMÓRIA RAM: Mais abundante, porém mais lenta que a memória cache. Nela, estão contidos os programas e os dados.
- Memória não volátil:
  - Discos rígidos (HDs): São discos magnéticos que funcionam imantando partes de sua extensão através de uma agulha presa a um braço. Devido a essa característica, eles leem informações sequencialmente, o que é muito mais rápido do que acessar informações aleatórias, pois estas se encontrarão espalhadas no disco;
  - Discos de estado sólido (SSD): São dispositivos sem partes móveis, mais rápidos e silenciosos que os tradicionais discos rígidos e de menor capacidade (os maiores têm em torno de 2 tb);
  - Memória flash (pendrive): São pentes de memória não voláteis. Costumam ser pequenos, portáteis e ligados ao computador por meio de uma porta USB. Os pendrives tornaram o disquete obsoleto por serem portáteis, silenciosos e confiáveis, além de terem milhares de vezes mais capacidade de armazenamento;
  - Fitas de dados (DAT): São fitas magnéticas de baixo custo de armazenamento. Sua grande característica é a resiliência, ou seja, se corretamente armazenadas, duram muitos anos. Por isso, ainda são muito usadas para backup. Sua velocidade de acesso é muito baixa e permite praticamente somente o acesso sequencial;
  - Outras mídias: Várias outras mídias se popularizaram e caíram (ou estão caindo) em desuso com os anos, como os disquetes, CDs e DVDs.

#### Áreas de memória de um processo

- Segundo Tanenbaum e Bos (2016), duas áreas são especialmente importantes na programação: a pilha (stack) e o heap;
- Quando um programa é executado, suas instruções são carregadas em uma área especial de memória conhecida como somente leitura (read only);
- Os projetistas têm a preocupação de tornar seu uso seguro, sem que você sequer perceba que essa área de memória existe
  (SIERRA; BATES, 2010);
- Outras linguagens de mais baixo nível, como o C e o C++, permitem que você tente alterar dados criados nesse local,
  o que ocasiona um erro no tempo de execução (MAIN; SAVITCH, 2005);
- O heap representa toda a memória disponível no sistema. Essa memória precisa ser explicitamente requisitada (alocada) e liberada (desalocada) pelo programador, por meio de comandos específicos;
- Algumas linguagens, como o Java, possuem um sistema especial para realizar automaticamente as desalocações no heap, chamado garbage collector (GOODRICH; TAMASSIA, 2013);
- Esse sistema é capaz de identificar automaticamente um objeto sem referências e eliminá-lo, acabando com a necessidade de comandos como free ou delete utilizados pelas linguagens C e C++.
- Além disso, o garbage collector realiza uma gerência inteligente no processo de alocação e desalocação, sendo capaz de, conforme Goetz (2003):
  - Agrupar dados que precisem ser desalocados em blocos grandes, realizando a operação de uma vez só;
  - Reutilizar áreas de memória recém-desalocadas em novas alocações, evitando o custo do sistema operacional em ambas as operações;
  - Utilizar vários núcleos de processamento para máxima performance.
- Como desvantagem desse sistema está a imprevisibilidade. Apesar de ser um sistema crítico e, portanto, extremamente eficiente, o programador não tem como controlar quando a execução ocorrerá, não tem como prever quanto tempo levará e nem quanta memória será desalocada. Por isso, o Java não costuma ser recomendado em aplicações com exigência de tempo real, como jogos ou vídeo.

### Tipos primitivos

- Os tipos variem de uma linguagem para outra, o conjunto básico geralmente inclui tipos numéricos, caracteres de texto e variáveis booleanas (verdadeiro/falso);
- Conforme a Oracle (2019), no caso do Java, os tipos primitivos são chamados de:
  - Booleano (verdadeiro/falso): boolean;
  - Numéricos inteiros: byte, short, int e long;
  - Numéricos decimais: float e double;
  - Caracteres: char.
- Os tipos primitivos geralmente trabalham por valor, isto é, eles representam apelidos para endereços de memória. Assim, duas variáveis diferentes representarão áreas diferentes da memória, e atribuir o valor de uma a outra gerará a cópia desse valor;
- Os tipos primitivos são alocados na memória **stack**;

### Vetores

- Um vetor é um conjunto de variáveis primitivas associadas;
- A linguagem Java trata os vetores como um tipo especial de dado, armazenado-os na memória **heap**;
- Quando um vetor é alocado, todos os seus valores são dispostos na memória lado a lado (LAFORE, 2005);
- Essa continuidade permite que o acesso sequencial aos dados do vetor seja muito veloz, pois ele maximiza o uso das memórias cache do processador;
- As linguagens de programação podem armazenar apenas o primeiro endereço do vetor e descobrir a posição de qualquer outro elemento por uma operação matemática simples;
- Exemplo, calculando a posição 8 de um vetor de 10 posições do tipo inteiro, onde cada unidade de inteiro é composta por 4 bytes, temos a seguinte fórmula (3.328 + 8 \* 4 = 3.328 + 32 = 3.360);
- Para fins práticos de um software de grande porte, os vetores apresentam uma séria desvantagem: são estáticos, isto é, não mudam de tamanho (LAFORE, 2005);

### Classes

- Embora os tipos primitivos sejam úteis, os dados normalmente possuem forte correlação, sendo dificilmente usados de maneira isolada;
- A linguagens de programação permitem criar tipos de dados compostos, agrupando dados de tipos diferentes em uma estrutura mais complexa, criada pelo programador. Na linguagem Java, esses tipos de dados compostos são chamados de classes (SIERRA; BATES, 2010);
- A alocação de memória de um objeto de uma classe é feita por meio do comando new. Quando ele é executado, o compilador calcula o tamanho dos dados de todos os atributos da classe e realiza uma única alocação de toda aquela área no heap. Em seguida, é executado o construtor da classe para inicializar a memória com os valores iniciais determinados pelo programador;
- Os dados da classe ficarão armazenados de maneira contínua, lado a lado. Em boa parte das linguagens, a mesma lógica pode ser usada para vetores; porém, esse não é o caso do Java (LAFORE, 2005);
- Cada objeto de uma classe possui uma única referência para a tabela de métodos virtuais da classe (chamada vtable). Essa tabela tem o endereço de todos os métodos que podem sofrer polimorfismo, ou seja, que, em algum momento, foram sobrescritos nas classes filhas.

#### Valores e referências

- No Java, as variáveis de objetos são chamadas de referências (DEITEL, 2010), porque, em vez de guardar todos os dados do objeto, elas contêm apenas um número inteiro com o endereço de memória onde esses dados estão;
- Quando atribuímos uma referência a outra, esse endereço de memória simplesmente é copiado e, portanto, as duas passam a apontar para o mesmo objeto (SIERRA; BATES, 2010);
- Isso tem uma consequência importante: um vetor de objetos em Java será um vetor de referências. Desse modo, os objetos em si ainda estarão espalhados pela memória, pois serão criados em várias alocações diferentes;
- Assim, os dados não estarão mais lado a lado, o que implica em perda de performance por não aproveitar tão bem o cache. Esse é o pior caso, já que o garbage collector possui algoritmos que tentam alocar os objetos juntos (GOETZ, 2003);
- Embora a variável de referência valores tenha sido criada no stack, o vetor em si, para o qual ela aponta, foi criado no heap. Isso porque ele também é considerado um objeto em Java.

## Pilhas e filas

### Conceitos

- A estrutura de dados **pilha** controlamos o acesso aos dados, de modo que as inserções sejam, obrigatoriamente, feitas em sequência, no topo da pilha, e as remoções sejam feitas na ordem inversa das inserções (LAFORE, 2005);
- Um dos exemplos mais clássicos de implementação da pilha é o recurso voltar. Ele empilha cada comando dado pelo usuário para que possam ser desempilhados a cada pressionar das teclas CTRL+Z, desfazendo-os;
- A **fila** é outra estrutura que também fornece acesso a dados de maneira controlada. A diferença desta e da pilha está na ordem em que os elementos são removidos (GOODRICH; TAMASSIA, 2013);
- Um exemplo clássico de fila é a fila de impressão, chamada de _spool da impressora_, que enfileira as requisições de impressão feitas a uma única impressora por meio da rede;
- Podemos classificar as implementações de qualquer estrutura de dados de duas maneiras (LAFORE, 2005). São elas:
  - Quanto ao limite de dados, em que as estruturas podem ser estáticas ou dinâmicas:
    - Estáticas: possuem uma quantidade fixa de dados que são capazes de comportar, geralmente definida no momento de sua criação;
    - Dinâmicas: não possuem essa limitação, tendo sua capacidade máxima definida apenas pela quantidade de memória disponível para o processo.
  - Quanto à disposição dos dados na memória, em que as estruturas podem ser sequenciais ou encadeadas:
    - Sequenciais: os dados são colocados lado a lado na memória;
    - Encadeadas: os dados se encontram dispersos em vários endereços de memória.
- Uma estrutura estática só pode ser sequencial e uma estrutura encadeada só pode ser dinâmica, porém, uma estrutura sequencial pode ser dinâmica;
