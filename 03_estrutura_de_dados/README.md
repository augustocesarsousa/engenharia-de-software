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
