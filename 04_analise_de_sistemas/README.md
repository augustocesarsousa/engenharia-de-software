# Análise de Sistemas

## Introdução à Análise de Sistemas e Levantamento de Requisitos

- As atividades de análise de sistemas são de extrema importância no processo de desenvolvimento de um software;
- Muitas vezes as empresas negligenciam essas atividades por diversos motivos;
- É consenso que existe uma grande expectativa (e pressão) por parte dos clientes em receber o produto final que solicitaram, ou seja, um software pronto, contemplando todas as suas solicitações e, não raro, resolvendo todos os problemas de negócio;
- Diferentemente de muitos produtos que exigem um processo completo e muito bem formalizado para se chegar ao produto final, um software, muitas vezes por uma visão equivocada da equipe de desenvolvimento, aceita que algumas etapas do processo de desenvolvimento sejam suprimidas, e mesmo assim se chega a um software “funcionando”.

### Introdução à Análise de Sistemas

- As atividades de análise fazem parte do ciclo de desenvolvimento de um sistema e têm um papel de extrema importância na qualidade do produto final;
- Os prejuízos causados pela entrega de um software cujas etapas não foram seguidas da maneira correta são praticamente intangíveis;
- A demora na correção de um erro pode ocorrer devido à estrutura do software ter sido mal construída, aos programas terem sido codificados sem um padrão, sem uma estruturação dos módulos, sem planejamento nem análise, sem uma modelagem dos processos, ou seja, o que se diz na prática: “saíram programando direto”;
- Um software mal construído será carregado por anos (e talvez décadas), sempre com muito esforço (e dinheiro) para mantê-lo funcionando, sempre impactando negativamente a imagem da empresa e seus negócios.

#### Conceitos iniciais

- Segundo Stair e Reynolds (2015), sistemas de informação são componentes que interagem entre si, coletando, manipulando e disseminando dados e informações, a fim de atingir um objetivo;
- Já Laudon e Laudon (2005) definem sistemas de informação como um conjunto de elementos inter-relacionados que coleta, processa, armazena e distribui informações com o intuito de apoiar a tomada de decisão, a coordenação e o controle de uma organização;
- Já um software pode ser definido como um conjunto de instruções (programa de computador) que, ao ser executado por um computador, produz um determinado resultado desejado e adequado à finalidade para a qual foi construído (PRESSMAN; MAXIM, 2016).
- Os softwares correspondem à parte lógica do computador, consistindo em programas que controlam o trabalho do hardware (STAIR; REYNOLDS, 2015).

#### Histórico da análise de sistemas

- Os computadores surgiram na década de 1950, porém, até o início dos anos 1970, eram utilizados basicamente no meio científico e militar;
- Com a popularização do seu uso, principalmente em empresas, sistemas de informações começaram a ser construídos com o objetivo de resolver ou informatizar os processos de negócio dessas empresas;
- Inicialmente as linguagens de programação eram complexas, a produção de programas demandava muitas linhas de código e a forma de se passar instruções aos computadores era difícil e exigia muita habilidade dos programadores;
- Os programadores se preocupavam muito com as questões técnicas dos computadores e não conseguiam focar aquilo que realmente importava, ou seja, resolver o problema do seu usuário;
- Por causa disso, muitos erros eram cometidos, tanto de interpretação do negócio como de resolução equivocada do problema;
- Também, nessa época, não existia nenhuma estruturação dos processos a serem programados e muito menos uma organização dos dados utilizados pelo sistema.
- Para amenizar esse cenário, nos anos 1970 surgiram as teorias de análise. Tais teorias tinham o objetivo de fazer com que os profissionais tivessem um tempo para analisar o problema e estruturar uma solução antes da efetiva codificação dos programas.

##### Análise Estruturada

- A primeira teoria de análise que surgiu foi chamada de Análise Estruturada (YOURDON; CONSTANTINE, 1992);
- Basicamente a referida teoria procurou dar uma estrutura aos processos e introduziu o conceito de diagramas para demonstrar a solução do problema;
- Surgiram então os dois primeiros diagramas básicos da Análise, o Fluxograma e o Diagrama de Fluxo de Dados (DFD), que foram amplamente utilizados até meados dos anos 1980;
- Porém, mesmo com a introdução dessa fase de análise no processo de desenvolvimento do sistema, problemas e dificuldades continuavam acontecendo. A questão agora era a falta de estruturação dos dados que o sistema manipulava.
- Não existia uma forma definida e cada sistema organizava seus dados da maneira que imaginava ser a correta para a sua solução;
- Surgiram então os Sistemas Gerenciadores de Banco de Dados (SGBD), amplamente utilizados até os dias de hoje. A proposta desses sistemas era armazenar e fornecer ferramentas de manipulação desses dados, fazendo com que os programas somente fizessem solicitações aos SGBDs para consultar, atualizar, incluir e excluir seus dados.
- Surgiram então as técnicas de organização dos dados em forma de tabelas, linhas e colunas e foram introduzidas técnicas de normalização e relacionamentos entre os dados. Com isso, surgiram os bancos de dados.

##### Análise Orientada a Objetos

- Para amenizar essas questões, surgiu nos anos 1990 a Análise Orientada a Objetos (RUMBAUGH et al., 1994);
- O princípio básico dessa teoria é o conceito de encapsulamento, segundo o qual determinados dados devem ser manipulados somente por suas operações num componente chamado Objeto;
- A evolução das teorias de análise nos levou a modelos mais complexos, porém os problemas passaram a ser mais controlados e a qualidade dos sistemas m melhoraram, fazendo com que se chegasse a um padrão utilizado por todo o mercado de produção de sistemas;
- Não só a teoria de Análise Orientada a Objetos se solidificou no mercado, mas uma grande área surgiu para dar as diretrizes para todo o processo complexo de
  desenvolvimento de um software e foi chamada de Engenharia de Software, sendo seus precursores nomes como Roger S. Pressman, Bruce R. Maxim (PRESSMAN;
  MAXIM, 2016) e Ian Sommerville (SOMMERVILLE, 2011).

#### Ciclo de desenvolvimento de um sistema

- Para o completo desenvolvimento de um sistema, desde a necessidade de um cliente informatizar a solução de um determinado problema de negócio até a efetiva utilização do sistema no ambiente real, existe um ciclo de desenvolvimento cobrindo diversas atividades;
- Independentemente do tipo de ciclo, quatro fases básicas no processo sempre são identificadas: Iniciação, Elaboração, Construção e Transição (KRUCHTEN, 2003):
  - Iniciação: Como o nome já diz, é a fase em que se inicia a investigação acerca das necessidades do usuário, busca-se o entendimento do negócio e do problema a ser resolvido. São levantados os Requisitos (ou funcionalidades) que serão atendidos pelo sistema e é obtido um acordo (ou consenso) com as partes envolvidas (usuário e equipe de desenvolvimento);
  - Elaboração: Nessa fase é projetada uma solução que satisfaça os Requisitos. É feita a modelagem do sistema por meio de construção de documentos e diagramas que apresentem ao usuário uma ideia de como será o produto final. A equipe de analistas de sistemas toma como base os materiais produzidos na fase anterior;
  - Construção: Nessa fase são codificados os programas e componentes de software que se transformarão no produto final, um software funcionando. A equipe de programação toma como base todo o material produzido na fase anterior para construir um software como foi especificado no projeto;
  - Transição: Com os componentes de software construídos, nessa fase é feito o planejamento da entrega, os testes de software, bem como sua homologação pelo usuário e, finalmente, o software é liberado para o ambiente produtivo.
- Esse modelo foi amplamente utilizado pelas empresas durante anos. Suas desvantagens foram a formalização, o excesso de procedimentos e artefatos que eram construídos e, muitas vezes, não tinha utilidade por não agregar valor ao produto final.

### Levantamento de Requisitos

- A fase de Iniciação do ciclo de desenvolvimento de um sistema começa com o Levantamento de Requisitos;
- Essa tarefa é primordial para que o software seja desenvolvido da maneira correta e atenda totalmente às necessidades do cliente;
- Sua importância e sua abrangência são tão grandes que uma nova área foi criada, chamada Engenharia de Requisitos;
- O uso sistemático de técnicas para obter, documentar e manter as informações para conseguir uma Lista de Requisitos que atendem aos objetivos do cliente
  no seu negócio é uma boa definição de Engenharia de Requisitos;
- O profissional responsável por essas tarefas é o analista de requisitos (que também pode ser o analista de sistemas);
- Levantar Requisitos significa entender o negócio e o problema do cliente, identificar suas necessidades de software, investigar quais são as suas expectativas em relação à solução informatizada que será adotada, em resumo, definir o que o software vai fazer;
- Na fase de Levantamento de Requisitos, então, é definido o escopo do sistema para se ter claro a que o sistema vai atender (e também a que ele não vai atender) e, principalmente, são identificados os seus Requisitos.
