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

### Implementação da pilha

- As operações possíveis para as pilhas e filas são:
  - Adicionar: Insere o elemento no topo da pilha;
  - Remover: Remove o elemento do topo da pilha;
  - Limpeza: Elimina todos os elementos da pilha;
  - Verificar se está cheia: Retorna verdadeiro se não há mais espaço para a inserção de elementos na pilha;
  - Verificar se está vazia: Retorna verdadeiro se não há nenhum elemento na pilha;
  - Iteração: Consulta elementos da pilha na mesma ordem em que seriam removidos, mas sem removê-los.
- Quando tentamos adicionar um valor em uma pilha estática cheia temos um erro de **overflow**;
- Quando tentamos remover um valor em uma pilha vazia temos um erro de **underflow**;
- **Overhead**: “valor extra”, que não representa informação de fato dentro da estrutura da pilha. No caso da pilha estática, o overhead é fixo e muito pequeno (só 4 bytes).

### Implementação da fila

- As operações possíveis para as filas são as mesmas disponíveis para as pilhas, com algumas diferenças:
  - Adicionar: Insere o elemento no fim da fila;
  - Remover: Remove o elemento do início da fila;
  - Limpeza: Elimina todos os elementos da fila;
  - Verificar se está cheia: Retorna verdadeiro se não há mais espaço para a inserção de elementos na fila;
  - Verificar se está vazia: Retorna verdadeiro se não há nenhum elemento na fila;
  - Iteração: Consulta elementos da fila na mesma ordem em que seriam removidos, mas sem removê-los.
- Assim como nas pilhas, quando tentamos adicionar um valor em um fila estática cheia, temos um erro de **overflow**, porém isso pode ser contornado utilizando uma **fila circular**;
- Nas filas também pode ocorrer o caso de **underflow**, quando tentamos remover um item de uma fila vazia;

## Listas

### Conceitos

- Uma lista é um conjunto de elementos, acessíveis por meio de seus índices (GOODRICH; TAMASSIA, 2013);
- Ela garante que os elementos respeitem uma ordem de inserção, seja colocando-os ao final, na ordem em que forem inseridos, ou respeitando a posição imposta
  pelo programador;
- Similarmente à pilha e à fila, as listas consideram um conjunto básico de operações
  - Limpeza: Elimina todos os elementos da lista;
  - Adicionar: Adiciona um elemento à lista. São fornecidas duas versões geralmente: uma que permite escolher a posição a ser inserida, e outra que sempre adiciona o elemento ao final da lista;
  - Remover: Remove o elemento que contém um índice específico;
  - Testar se está cheio ou vazia: Verifica se a lista está vazia ou se está cheia;
  - Alterar (set): Substitui um elemento em uma posição por outro;
  - Obter (get): Obtém um elemento em um determinado índice;
  - Tamanho: Retorna a quantidade de elementos da lista (getTamanho);
  - Busca: Encontra o índice de um elemento dentro da lista. Geralmente são fornecidas duas versões de busca: para a primeira ocorrência (indice) e para a última (ultimoIndice);
  - Iteração: Permite consultar os elementos da lista em ordem sequencial, sem removê-los.

### Implementação da lista estática

- A lista estática é uma estrutura sequencial que utiliza um vetor de tamanho fixo para armazenar os elementos (GOODRICH; TAMASSIA, 2013);
- Apesar de não aparecer de maneira explícita, a variável tamanho tem tamanho 0, pois é o valor de inicialização padrão das variáveis inteiras em Java (DEITEL, P.; DEITEL; H., 2009).

#### Informações da lista

- A lista estará vazia sempre que não contiver elementos, ou seja, sempre que o tamanho for igual a 0;
- Ela estará cheia quando a variável tamanho atingir a capacidade máxima da lista, ou seja, for igual ao tamanho do vetor dados.

#### Adição de elementos

- Uma lista que armazena objetos pode ter o valor nulo como candidato a ser inserido;
- Os índice de uma lista não pode ser negativo, pois por definição os índice começa em zero;
- Os índice de uma lista não pode ser superior a capacidade da lista;
- A função **Objects.checkIndex** checa se um índice é inválido;
- Ao adicionar um elemento em uma posição já ocupada na lista, é necessário mover os elemento posteriores para a direita.

#### Remoção de elementos

- Para excluirmos um elemento, teremos que deslocar os elementos posteriores para a esquerda, sobre o elemento excluído. Após isso, definiremos o elemento do final da lista para nulo, para garantir que não haja uma referência a ele fora da lista;
- A limpeza da lista funciona de modo similar ao que ocorre com a pilha, basta remover a referência a todos os elementos e zerar a variável tamanho.

#### Acesso direto aos dados da lista

- Obter um dado sem removê-lo (get) ou substituir um dado em uma posição específica (set) são operações mais simples. Para fazê-las, basta validar o índice informado e, se ele estiver dentro da lista, utilizar o elemento correspondente do vetor.

#### Busca na lista

- Uma operação importante é localizar o índice de um elemento dentro da lista. Entretanto, lembre-se de que um mesmo elemento pode estar presente em mais de uma posição. Por isso, essa operação é fornecida em duas versões:
  - indice: retorna a primeira ocorrência do elemento na lista;
  - ultimoIndice: retorna a última ocorrência do elemento na lista;
  - Ambas as funções retornam o valor negativo –1 caso o elemento não seja encontrado.

#### Iteração

- A operação de iteração envolve percorrer a lista, elemento a elemento. No caso da lista estática, isso pode ser feito por meio de um while;
- As operações presentes em qualquer iteração são:
  1. Posicionar-se antes do primeiro elemento;
  2. Testar se há um próximo elemento e, caso haja:
     - Saltar para o próximo elemento;
     - Retorná-lo.
  3. Repetir o passo 2.
- Para permitirmos que nossas coleções sejam iteráveis, iniciamos implementando a interface Iterable. Essa interface exige apenas a criação de um método, que retorna um objeto do tipo Iterator (SIERRA; BATES, 2010);
- Por sua vez, o objeto iterador deve implementar dois métodos:
  - hasNext: Diz se há um dado ainda na coleção sobre a qual ele está iterando;
  - next: Salta para o próximo elemento e o retorna.

#### Tornando a lista dinâmica

- Embora toda estrutura estática seja sequencial, o inverso não é necessariamente verdadeiro;
- A forma mais fácil de realizar cópias de vetores em Java é por meio do método Arrays.copyOf, o qual recebe um vetor a ser copiado e seu novo tamanho como parâmetro;
- É possível implementar a redução da lista alterando o método remover e o método limpar. Porém, não faremos isso, já que a classe ArrayList do Java também não o faz (LAFORE, 2005). No lugar, criaremos o método ajustar, que faz com que a lista fique com o tamanho idêntico à sua capacidade;

### Implementação da lista encadeada

- Lista duplamente encadeada: quando cada nó contém uma referência tanto para o próximo nó quanto para o nó anterior;
- Uma lista duplamente encadeada permite a iteração nos dois sentidos, permitindo que ela possa ser utilizada como pilha ou fila quando necessário;
- A implementação **LinkedList** do Java é uma lista duplamente encadeada;

#### Informação da lista

- As informações básicas da lista são implementadas de maneira direta;
- A lista nunca estará cheia por ser dinâmica;
- O tamanho da lista é indicado diretamente pela variável _tamanho_, sendo que ela estará vazia quanto _tamanho_ for zero;

#### Adição de elementos

- Para adição ao fim da lista:
  - Caso a lista esteja vazia, as variáveis _topo_ e _base_ passarão a conter o _nó_ recém-adicionado, e o tamanho da lista se tornará 1;
  - Caso contrário, o _nó_ adicionado será o novo _topo_ da lista, e o atual _topo_ será colocado anteriormente a ele;
  - Diferentemente do que acontece com uma lista sequencial, não é possível acessar diretamente um nó específico;
  - Para adicionar em um índice, teremos que navegar até o nó em questão, e isso só pode ser feito iterando nó a nó.
- Para adição no meio da lista:
  - Atualizamos os valores de _proximo_ e _anterior_ em no para referenciarem as variáveis descritas;
  - Caso o nó _anterior_ seja nulo, trata-se de uma inserção na _base_. Nesse caso, atualizamos a variável _base_ para apontar para o nó. Caso contrário, atualizamos a referência _anterior_.proximo para o nó sendo inserido;
  - Finalmente, atualizamos a variável _próximo.anterior_ para o nó sendo inserido e o tamanho da lista.

#### Remoção de elementos

- O processo de remoção de elementos ocorre de maneira parecida com o de adição. Assim, localizamos o item a ser removido e atualizamos os campos próximo e anterior dos nós ao seu redor para que ele seja removido;
- O processo de limpeza da lista é bastante simples. As referências topo e base são as únicas referências a todos os nós da lista. Por isso, para eliminá-las, basta defini-las para null.

#### Acesso direto aos dados da lista

- Uma das grandes desvantagens da estrutura de nós é que ela impossibilita o acesso direto a um elemento (GOODRICH; TAMASSIA, 2013);
- Para acessar um índice, seremos sempre obrigados a saltar nó a nó até o elemento desejado. Isso implica em um custo de performance alto, se comparado ao da lista sequencial.

## Ordenação de dados

### Conceitos

- Alguns tipos de dados são comparáveis entre si, isto é, podemos olhar para dois elementos de mesmo tipo e determinar se um deles é maior, menor ou igual a outro (DEITEL, P.; DEITEL, H., 2009);
- Como essa comparação é possível, podemos colocar esses dados em algum tipo de ordem, seja ela crescente ou decrescente;
- Esse conceito é facilmente entendido com alguns dados simples naturalmente ordenados, como números ou datas, porém, ele pode ser mais complexo quando lidamos com dados compostos, como um aluno ou um carro, pois dados desse tipo podem ser ordenados de várias formas;
- Na programação, podemos resolver esse problema por meio de duas estratégias:
  - Permitir a implementação de uma interface chamada Comparable às classes que possuem uma ordenação natural;
  - Fornecer, para as funções de ordenação, um objeto comparador que implementa a interface Comparator, para que elas organizem os dados de acordo com o critério que ele implementa. (DEITEL, P.; DEITEL, H., 2009).
- Ambas as interfaces fornecem uma função de comparação, isto é, uma função que, dado dois objetos o1 e o2, retorne:
  - Um número negativo, caso o1 seja menor que o2;
  - Zero, caso o1 seja igual a o2;
  - Um número positivo, caso o1 seja maior que o2.
- Além disso, para que seja consistente, essa função deve garantir três propriedades básicas (ORACLE, 2019):
  - Simetria: o sinal de o1 comparado a o2 deve ser o inverso do sinal de o2 comparado a o1. Isso também implica que a comparação de o1 com o2 deve lançar uma exceção se, e somente se, a comparação de o2 com o1 também lançar exceção;
  - Transitividade: se o1 comparado a o2 for positivo, e o2 comparado a o3 for positivo, então o1 comparado a o3 também deve ser positivo;
  - Consistência: se a comparação de o1 com o2 for igual a zero, então a comparação de o1 com o3 deve ser igual à de o2 com o3 para qualquer o3;
  - Por fim, uma propriedade desejável, mas não obrigatória, é a de igualdade. Com ela, sempre que houver uma relação o1.equals(o2), a comparação de o1 e o2 também deve retornar zero.

### Algoritmos de ordenação

- Os algoritmos de ordenação têm como objetivo classificar uma lista inteira e possuem duas operações essenciais (LAFORE, 2005):
  - Comparar elementos (como vimos anteriormente);
  - Trocar a posição de elementos fora de ordem.
- Os algoritmos de ordenação também poder ser classificados como estáveis e não estáveis (GOODRICH; TAMASSIA, 2013):
  - Um algoritmo estável garante que, caso dois elementos sejam considerados iguais, eles se mantenham na mesma ordem que estavam antes de a execução ocorrer;
  - Os não estáveis, estudados neste capítulo, não dão essa garantia.

#### Bubble sort

- O bubble sort, geralmente traduzido como algoritmo da bolha, ordena um vetor percorrendo-o várias vezes (LAFORE, 2005);
- A cada passada, cada elemento é comparado ao seu vizinho; caso esteja fora de ordem, ele é trocado de lugar, isso faz com que o maior elemento
  se desloque para o final do vetor;
- O algoritmo deve repetir o processo novamente, para todos os elementos restantes da lista, até que não haja mais elementos a serem comparados, ou até que a comparação não tenha resultado em nenhuma troca;
- Uma das grandes vantagens desse algoritmo é que sua implementação é bastante simples, porém por ter um alto custo de processamento, esse algoritmo é praticamente inviável para a maioria das aplicações práticas.

#### Selection sort

- O algoritmo select sort apresenta um número de comparações mais alto do que o bubble sort, porém minimiza o número de trocas. Seu processo é bastante simples (LAFORE, 2005):
  - O algoritmo começa no primeiro elemento da lista;
  - Partindo dele, busca-se o menor elemento dentro de toda a lista, comparando-o com os demais;
  - Ao final da iteração, troca-se o menor elemento da lista com o primeiro;
  - O elemento, agora, encontra-se ordenado. Portanto, o algoritmo passa para o próximo elemento da lista e retorna ao passo 2.
- Diferentemente do que ocorre com o bubble sort, esse algoritmo não possui uma forma de abandonar a iteração caso o vetor fique ordenado;
- Uma das vantagens desse algoritmo é que ele também é simples de implementar em uma lista encadeada;
- Uma alternativa para listas encadeadas seria, em vez disso, trocar os nós.

#### Quick sort

- O algoritmo quick sort usa a estratégia de "dividir para conquistar", ele é dividido em três partes:
  - Escolher: escolher um elemento da lista, chamado de pivô, que será usado como base nos próximos passos;
  - Separar: separar a lista, de modo que os elementos inferiores ou iguais ao pivô fiquem à sua esquerda e os elementos maiores que o pivô, à sua direita. O pivô em si não é adicionado a essas listas, pois agora está na sua posição correta;
  - Conquistar: unir as listas.
- O truque desse algoritmo está no fato de ele ser recursivo;
- Para que o quick sort funcione, basta executar três passos (LAFORE, 2005):
  1. separar a lista, obtendo a posição final do pivô p;
  2. executar o quick sort para a sublista de inicio até p – 1;
  3. executar o quick sort para a lista de p + 1 até fim.

### Listas ordenadas

- Organizar os elementos não é a única forma de garantir a ordem. Uma alternativa a esse processo é sempre inserir os elementos no local correto;
- O primeiro passo para criar uma lista ordenada é implementar a função indice. Essa função busca um elemento e retorna a posição dele na lista, ou –1, se ele não for encontrado;
- No caso desse tipo de lista, essa função tem um papel adicional: ela deve retornar o ponto de inserção, caso o elemento não seja encontrado (LAFORE, 2005);
- Em nossa função indice da lista sequencial, iterávamos sobre a lista toda até encontrar o elemento. Entretanto, no caso de uma lista ordenada, há uma abordagem muito mais inteligente, conhecida como busca binária:
  - Ela parte da observação de que, dado um elemento qualquer, todos os elementos a sua esquerda são menores do que ele e todos os elementos a sua direita, maiores.
- Para buscar um valor, podemos, então, utilizar a abordagem a seguir (LAFORE, 2005):
  1. Pegamos o elemento do meio da lista. Então, há três possibilidades:
     a. Ele pode ser igual ao que buscamos. Nesse caso, a busca terminou;
     b. Ele pode ser maior do que o valor que estamos buscando. Nesse caso, descartamos todos os elementos à direita dele;
     c. Ele pode ser menor do que o elemento que estamos buscando. Nesse caso, descartamos os elementos à esquerda dele;
  2. Após o descarte, repetimos o passo 1 na sublista formada pelos elementos não descartados.

## Espalhamento

### Conceitos

- Espalhamento também é conhecido como dispersão ou hashing;
- O conceito de espalhamento pode ser definido como a divisão de uma coleção em _grupos_ a fim de facilitar e busca de elementos;
- Podemos utilizar o conceito de _gaveteiro_ onde colocamos os grupos em _gavetas_, podemos fazer isso por meio de tabelas e funções de espalhamento.

#### Tabelas de espalhamento

- Na computação, essa estratégia do gaveteiro é conhecida como tabela de espalhamento. Com ela, podemos implementar duas estruturas de dados:
  - mapas: nos permitem associar dois objetos entre si, como o número da matrícula (chave) ao objeto que representa um funcionário (valor);
  - conjuntos: contém uma sequência sem repetição de objetos. Eles nos permitem, por exemplo, gerar uma lista contendo todos os remetentes de um grupo grande de e-mails, sem repeti-los.
- Tabela hash: vetor de listas contendo objetos;
- Função de espalhamento ou função hash: tem como objetivo converter um conjunto qualquer de valores em um outro valor, chamado código hash, que estará dentro de um intervalo numérico conhecido (LAFORE, 2005).
- Bucket: nome dado as listas em uma tabela hash;
- Carga: razão entre a quantidade real de elementos (tamanho) e a quantidade de buckets;
- O Java considera-se que um fator de carga de 0,75 como um bom compromisso entre os dois lados (ORACLE, 2019a);
- Rehash: quando um mapa dinâmico altera de tamanho e redistribui os objetos sempre que precisar.

#### A função hashCode

- A função hashCode deve retornar um número inteiro com código hash de dois objetos (SIERRA; BATES, 2010);
- Estratégia proposta por Bloch (2019):
  1. Comece por um valor constante armazenado em uma variável chamada _result_, por exemplo, o valor 79;
  2. Para cada campo f utilizado no método equals em seu objeto, calcule o valor c com base nas seguintes regras:
     a. Se o campo for booleano, calcule: f ? 1 : 0;
     b. Se o campo for dos tipos byte, char, short ou int, seu valor será diretamente: (int) f;
     c. Se o campo for do tipo long, calcule: (int) (f ^ (f >>> 32)). Isso fará com que os 32 bits iniciais do long sejam combinados com os 32 bits finais, resultando em um valor inteiro de 32 bits;
     d. Caso o valor seja um float, utilize a função Float.floatToIntBits. Essa função retorna o valor dos bits da variável diretamente, na forma de um número inteiro;
     e. Caso o número seja um double, utilize a função Double.doubleToLongBits e aplique ao resultado a fórmula descrita em 2c;
     f. Caso o dado seja um objeto, use: f == null ? 0 : f.hashCode(). Não será necessário testar se f é nulo caso o campo não admita esse campo;
     g. Caso o elemento seja um vetor, trate-o como se cada valor dentro do vetor fosse um campo separado aplicando a ele as regras descritas anteriormente.
  3. Combine o valor c, calculado nos campos da etapa 2, dentro da variável result por meio da fórmula: result = p \* result + c, em que p é um número primo qualquer (como o valor 31).

#### Endereçamento aberto

- Endereçamento aberto: é a estratégia em que tentamos manter todos os dados apenas no vetor principal (LAFORE, 2004);
- Endereçamento duplo: estratégia em que utilizamos duas funções hash. Aplicamos a primeira função e, caso uma colisão ocorra, utilizamos a função secundária. Caso haja colisão novamente, podemos fazer o rehash, ampliando o vetor principal;
- Outra opção é procurar um índice livre do vetor linearmente. Para isso, fazemos o cálculo com a função hash e, caso o índice já esteja ocupado, verificamos o seu vizinho. Caso continue ocupado, passamos para o próximo índice, até que um índice livre seja encontrado;
- Esses tipos de uso só se justificam em dispositivos que a quantidade de memória é criticamente baixa (MAIN; SAVITCH, 2005). Afinal, o overhead provocado por uma lista encadeada em cada item não é tão grande ao ponto de justificar uma implementação mais complexa.

#### Interface Mapa

- Uma chave é um valor sem repetição que permite identificar unicamente o elemento que queremos buscar (GOODRICH; TAMASSIA, 2013);
- As estruturas associativas, como os vetores e os mapas, permitem que, de posse de uma chave, um objeto seja rapidamente localizado;
- Diferentemente do que ocorre em um vetor, cuja chave está limitada a um índice, um mapa permitirá que suas chaves tenham descontinuidades ou não sejam sequer numéricas (ORACLE, 2019a);
- O mapa insere, em cada valor da tabela hash, uma estrutura conhecida como entrada, que nada mais é do que um par de valores relacionados (LAFORE, 2004);
- Um dos valores é a chave, que identifica o objeto, onde faremos todas as operações hash e buscas já descritas, e o outro valor é o objeto associado a essa chave.

#### Interface Conjunto

- Os conjuntos possuem uma estrutura mais simples. Eles são unicamente uma coleção que não permite elementos duplicados (ORACLE, 2019b);
- Além de todos os métodos de coleção, os conjuntos possuirão os métodos contem, remover e getTamanho;
- Os conjuntos podem ser facilmente implementados na forma de mapas, em que os elementos associados às chaves são todos nulos.

## Implementação do mapa não ordenado

- Para criar a implementação, primeiro precisamos de três variáveis:
  1.  O vetor buckets: cada bucket nada mais é do que uma lista encadeada de objetos da classe Mapa.Par;
  2.  A variável tamanho: representa a quantidade de elementos efetivamente inseridos no mapa;
  3.  fatorCarga: representa a carga máxima suportada pelo mapa antes que uma operação de rehash seja feita.
- Forneceremos dois construtores para a classe: um que permite especificar os valores tanto do fator de carga quanto do número inicial de buckets; e um segundo, mais conveniente, que usa os valores padrão 0,75 e 16 (valores que também são usados na API Java).

### Informações do mapa

- Todos os mapas fornecem seu tamanho e indicam se está vazio ou não, como informações básicas;
- Além dessas duas informações, os mapas com base em hash também informam a sua carga atual, definida pela divisão da quantidade de elementos pela quantidade de buckets.

### Localizando itens

- Um fator crítico em praticamente todos os métodos do mapa está em localizar o item na tabela hash;
- Para tanto, vamos criar uma estrutura auxiliar chamada Localizacao, que nos indica:
  - o bucket onde o item está, ou deveria estar;
  - um iterador, já posicionado sobre o elemento encontrado;
  - uma estrutura Par, contendo a chave e o valor encontrados.
- Caso o elemento não esteja no mapa, tanto o iterador quanto a estrutura do par chave/valor serão nulos.

### Adição de elementos

- Adicionamos um elemento fornecendo a chave e o valor para o qual aquela chave será mapeada;
- Caso uma chave seja fornecida mais de uma vez, o valor mapeado será substituído e retornado pelo método adicionar;
- Para realizar essa operação, precisaremos pesquisar se já não há um valor mapeado para aquela chave e:
  1.  Caso não encontremos:
      a. adicionamos o valor à lista e testamos se o mapa agora não excede o fator de carga máximo permitido;
      b. caso exceda, precisaremos fazer o rehash. Em ambos os casos, o método retorna nulo, já que não havia valor mapeado para aquela chave.
  2.  Caso encontremos, basta substituir o valor pelo fornecido, retornando o valor antigo. Note que o método setValor das classes Par e Localizacao já se comportam dessa forma.

### Removendo elementos

- A operação de limpeza de um mapa é bastante simples. Basta percorrer o buckets limpando todas as listas ali presentes;
- Para remover um único elemento, basta chamar o método remove do iterador do bucket em que ele foi localizado (essa é exatamente a implementação do método remover da classe Localizacao) e, em seguida, reduzir o tamanho do mapa em um. Caso o elemento não esteja no mapa, o método de exclusão simplesmente retornará nulo.

### Acesso direto a valores

- O acesso direto a valores é feito por meio do método get, que é implementado diretamente com a função acharNo. O mesmo vale para a função contem;
- A função contem é a única forma inequívoca de testar se uma chave está realmente presente no mapa.

### Implementação dos conjuntos

- Um conjunto é um grupo de elementos sem repetição;
- Muitas bibliotecas, inclusive a do Java, optam por implementar conjuntos por meio de mapas cujos valores sempre serão mapeados para nulo.

## Árvores binárias

### Conceitos

- Árvore é o nome dado a organização onde os dados são ordenados de maneira hierárquica, isto é, de modo que um elemento esteja associado a um conjunto de elementos subordinados (GOODRICH; TAMASSIA, 2013);
- Um exemplo bastante conhecido dessa estrutura é a estrutura de pastas, presentes no disco;
- Cada item nessa estrutura é chamado de nó;
- Cada item pode ter um conjunto de nós filhos, que estão diretamente associados a ele, mas cada um deles deve conter um único nó pai;
- Um dado não pode estar simultaneamente em duas pastas. Além disso, não pode conter ciclos, com um nó filho apontando para qualquer um de seus nós ascendentes, como pai, avô etc. (LAFORE, 2005);
- O nó inicial é denominado nó rais, os nós sem filhos, são denominados nós folhas;
- Dois conceitos importantes em uma árvore são os conceitos de profundidade e altura de um nó (MAIN; SAVITCH, 2005):
  - Profundidade: é a quantidade de nós entre o nó atual e a raiz, que tem profundidade 0;
  - Altura: é a quantidade de nós entre o nó sendo analisado e a folha, considerando o caminho mais longo possível. A altura do nó raiz é considerada a altura da árvore, que também é igual à profundidade do nó mais profundo.

### Implementando um mapa ordenado

- Mapas são estruturas de dados que associam chaves a valores (ORACLE, 2019a);
- No caso de um mapa ordenado, as chaves serão únicas e ordenadas, de acordo com um critério de comparação definido;
- **Árvore binária de busca**, trata-se de uma árvore com as seguintes limitações (LAFORE, 2005):
  - Cada nó pode conter apenas dois nós filhos, que chamaremos de nó esquerdo e nó direito;
  - Valores menores ou iguais ao nó atual devem ser inseridos ao lado esquerdo. Já os maiores, à direita.
- Essa organização tem por objetivo reduzir o tempo de busca;
- Os dados “se dividem” de maneira similar ao que ocorre na busca binária;
- De fato, uma árvore em que os nós se encontrem perfeitamente distribuídos terá um tempo de busca logarítmico. Entretanto, a disposição dos nós é diretamente dependente da ordem de inserção dos dados (GOODRICH; TAMASSIA, 2013).

### Outros tipos de árvore

#### Árvores-AVL

- Um dos problemas com as árvores binárias de busca é que, muitas vezes, elas crescem apenas para um lado, dependendo da ordem que os elementos são inseridos;
- Inserir elementos em ordem, seja ela crescente, seja decrescente, gera o seu pior caso: a árvore se comporta de maneira praticamente igual a uma lista encadeada (LAFORE, 2005);
- Isso ocorre porque a árvore perdeu seu balanceamento, isto é, porque não há uma boa distribuição de nós (GOODRICH; TAMASSIA, 2013);
- Para resolver esse problema, os pesquisadores Adelson-Velsky e Landis criaram um processo de balanceamento automático. Nele, considera-se que cada nó possui um fator de balanceamento com base na altura de seus nós filhos. Esse fator é dado por (LAFORE, 2005):
  - _fatorBalanceamento(n) = altura(esquerda(n)) – altura(direita(n))_.
- Todo nó em que o fator de balanceamento não possui os valores -1, 0 ou 1 deve ser rebalanceado. Isso é feito realizando uma de quatro rotações possíveis: esquerda, direita, esquerda-direita e direita-esquerda.

#### Árvores rubro-negras

- Árvores rubro-negras ou árvores vermelho e preto são outra estratégia para tentar manter o balanceamento de árvores binárias;
- Nelas, associam-se as cores vermelha ou preta a cada nó, tentando respeitar quatro regras (LAFORE, 2005):
  1. A raiz da árvore é sempre preta;
  2. Os valores nulos ao lado esquerdo e direito das folhas são considerados pretos;
  3. Todos os filhos de um nó vermelho são pretos;
  4. Todo caminho de um nó até qualquer uma de suas folhas terá o mesmo número de nós pretos.

#### Árvores m-ways

- Árvores m-ways têm como objetivo criar uma árvore de busca de modo que utilizemos até m nós (LAFORE, 2005);
- Um exemplo de m-way bastante utilizado em aplicações gráficas, como jogos ou mapas, é a quadtree (4-way).
