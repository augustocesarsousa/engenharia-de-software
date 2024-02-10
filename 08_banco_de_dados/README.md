# Banco de Dados

## Introdução a banco de dados

### O que é e para que serve um banco de dados?

#### Dados

- Dados são elementos gerados pelo registro de fatos ou de características de objetos/coisas;
- Os dados são inerentes aos elementos que representam, isto é, dados não são criados, mas sim capturados da observação desses objetos no mundo real;
- Quando olhamos para um objeto, o reconhecemos por suas características. Essas características podem ser mapeadas como dados de um objeto.

#### Informação

- Informações são elementos e conclusões geradas por meio da manipulação dos dados;
- A manipulação dos dados pode envolver, comparar, apresentar, separar e formatar dados;
- A transformação pode envolver, somar, subtrair e contar dados;
- Ao transformar um dado pode-se gerar uma informação, isso significa que diferentes transformações de um mesmo dado podem gerar diferentes e diversas informações;
- É importante ter o cuidado de guardar dados, não sendo necessário guardar informações, pois essas últimas não precisam ser guardadas, uma vez que podem ser geradas;
- A preocupação com a identificação do que realmente é um dado e do que são informações foi originada justamente quando os antigos arquivos usados para sustentar os sistemas de informação passaram a ser substituídos por bancos de dados.

#### Arquivos e bancos de dados

- Ao tratarmos de banco de dados, três características são sempre destacadas. Elas devem ser observadas e buscadas para que o agregado de dados que se crie possa ser chamado de banco de dados, a saber (NAVATHE; ELMASRI, 2005):
  - Um banco de dados deve representar uma porção de um mundo real;
  - Os dados em um banco de dados devem ser logicamente coerentes;
  - Os dados e o próprio banco de dados devem ter uma finalidade específica.
- Porção do mundo real: diz respeito ao fato de que o processo de modelagem de dados, que dará origem ao banco de dados, deve ser feito com base na observação de um escopo definido e se preocupar em capturar as propriedades e características (dados) reais dos elementos observados nesse ambiente;
- Dados coerentes: diz respeito ao fato de que somente reunir dados delimitados de alguns objetos observados em um mundo real não é suficiente. É necessário que os dados sejam logicamente coerentes, isto é, que exista a correlação entre os dados de diferentes objetos;
- Finalidade específica: tanto o escopo dos objetos observados quanto a amplitude do mapeamento desses objetos, o modo de mapeamento, a quantidade de dados a serem povoados nessa base de dados e o modo como serão compartilhados os dados entre as aplicações podem depender da finalidade do banco de dados.

#### Banco de dados e sistema gerenciador de banco de dados: diferenças

- SGBD (Sistema Gerenciador de Banco de Dados): é o sistema que gerencia o BD por meio de diversas funções:
  - Criar o banco;
  - Criar tabelas e colunas que vão compor o banco;
  - Definir os usuários que poderão ter acesso aos dados;
  - Fornecer o acesso para consulta e atualização dos dados;
  - Realizar cópias de segurança dos dados;
  - Monitorar a performance do banco de dados;
  - Permitir a execução de rotinas de compactação de espaço físico.
- Com base nos padrões internacionais estabelecidos pela ANSI (American National Standard Institute), temos hoje uma grande compatibilidade entre os diversos SGBDs existentes, principalmente no tocante aos recursos que eles fornecem para que os sistemas de informação possam interagir.

### Vantagens e desvantagens do uso de um banco de dados

- Principais vantagens do uso de bancos de dados (DATE, 2004; SILBERSCHATZ, KORTH, SUDARSHAN, 2012);
  - Compartilhamento dos dados: o objetivo principal de um BD é reunir um conjunto de dados de modo coerente para disponibilizá-lo a um grande contingente de aplicações, as quais poderão, então, compartilhar esses dados;
  - Facilidade de acesso aos dados: ao utilizar um SGBD para manter um BD, passa-se a ter um método de acesso único, provido também por meio de uma linguagem estruturada (SQL – linguagem padrão para banco de dados relacionais) que padroniza e facilita o reaproveitamento de códigos gerados para interação com o banco de dados;
  - Redução da redundância: Considerando uma estruturação coerente de dados e o objetivo de compartilhamento, há de se obter, naturalmente, um BD em que a redundância de dados seja bastante reduzida ou até inexista;
  - Redução das inconsistências: ao criar um conjunto de dados coerente, integrado e que tenha baixa ou nenhuma redundância, tem-se, naturalmente, a redução das possíveis inconsistências entre os dados existentes no BD;
  - Disponibilidade de suporte a transações: os SGBDs e as linguagens de programação que eles dispõem para a construção de funções de acesso, atualização e exclusão de dados proveem meios para que o acesso concorrente (simultâneo) de diversos programas possa ser feito a um mesmo dado sem que este apresente um conteúdo não íntegro;
  - Manutenção da integridade: havendo um controle de transações, uma redução de redundância, uma redução de inconsistências e um modelo de dados coerente, poderemos assegurar que o banco de dados terá seus dados íntegros, isto é, conseguiremos manter a coerência dos dados planejada, mesmo que diversos programas e usuários simultaneamente estejam executando rotinas de inclusão, alteração e exclusão de dados;
  - Balanceamento de requisitos conflitantes: como as várias transações concorrentes requisitarão atualizações e consultas sobre os mesmos dados, poderá ocorrer situações em que um mesmo dado acabe sendo requisitado de modo conflitante. O ambiente de banco de dados estará preparado para tratar dessas situações e resolvê-las de modo automático, sem que o programador precise se preocupar em escrever rotinas especiais;
  - Melhoria da segurança: outro importante recurso disponível nos SGBDs são os diversos mecanismos de controle de segurança para acesso e para atualização dos dados do BD. Tanto as permissões que definem quem pode ou não acessar um dado quanto os mecanismos de garantia das atualizações feitas no BD (redo log) irão contribuir para a segurança lógica e física dos dados;
  - Utilização de padrões: a unificação dos dados em um mesmo BD gera também uma padronização de formatos, de regras de atualização e até de conteúdos.
- Desvantagens:
  - Perda de autonomia sobre os dados: quando tratamos de centralização, seja de dados, de processos, de pessoas, de equipamentos, temos naturalmente a perda de autonomia sobre esses mesmos itens. Quando determinado dado é definido, criado, atualizado ou excluído e compartilhado com outras aplicações, é necessário realizar essas operações ciente de que outras pessoas podem vir a ser impactadas;
  - Interdependência entre os dados: a interdependência criada pela centralização dos dados também poderá afetar, de certo modo, determinada aplicação ou a aplicação de terceiros. No caso de somente um arquivo próprio, com os dados que o sistema requer, talvez esse arquivo nunca fosse impactado por outro sistema que resolvesse inserir utras 200 mil pessoas em um cadastro que tinha somente mil;
  - Sincronização dos dados no tempo: é importante lembrar que os dados não são mais individuais e estar preparado para as situações em que a sincronização dos dados entre diferentes aplicações será dependente do tempo, ou de quando for feita.

### Criação e manutenção de bancos de dados

- O processo de criação de um banco de dados que será disponibilizado por meio de um SGBD, para uma ou mais aplicações, requer um formalismo para que tenha as três características citadas por Navathe e Elmasri (2005): porção do mundo real, logicamente coerentes e finalidade específica.

#### Mapeamento dos dados

- A primeira etapa na criação de um BD é identificar os dados envolvidos;
- O administrador de dados, é quem conhece os dados da empresa. Esse profissional sabe onde os dados são gerados, quem é o responsável por sua atualização, o que esses dados representam e qual padrão deve seguir;
- A criação de um banco de dados pode começar muito antes do surgimento da necessidade de um novo sistema ou de um novo aplicativo.

#### Modelagem conceitual

- Segundo Heuser (2009), modelagem conceitual é um processo de criação de uma representação gráfica e textual de basicamente dois elementos: as entidades e os relacionamentos;
- Esse processo identifica os objetos ou fatos do mundo real a serem mapeados (as entidades) e os relacionamentos que existem entre esses objetos (por meio de regras).

#### Modelagem lógica

- Segundo Heuser (2009), a modelagem lógica captura e incorpora os requisitos do SGBD escolhido para a criação do BD;
- Se a arquitetura escolhida é a de um BD relacional, o modelo conceitual deverá ser adaptado aos requisitos do modelo relacional. Esse será um modelo lógico que praticamente servirá para qualquer SGBD relacional do mercado, com pequenas mudanças em relação a particularidades ou outras questões que um fornecedor apresente.

#### Modelagem física

- A modelagem física, também chamada de projeto do banco de dados;
- Segundo Heuser (2009), como em todo projeto, é nesse momento que detalhes, mecanismos de otimização, cálculos de ocupação de espaços, mecanismos de segurança, ente outros elementos são agregados;
- Todas essas características precisam ser analisadas para que se crie uma estrutura física (realmente alocando espaço em disco em um servidor) para o banco de dados. Aqui, ele deixa de ser um modelo e passa a ser um repositório de dados.

#### Dicionário de dados

- Todas as informações sobre o modelo de dados conceitual (lógico e físico) deverão ser registradas em um repositório que chamamos de dicionário de dados;
- Nele temos registros de um determinado campo, a saber:
  - A qual entidade pertence;
  - Como é alimentado;
  - Quando é atualizado;
  - Quem é o responsável pela criação;
  - Quem é o responsável pela atualização;
  - É um campo de preenchimento obrigatório?
  - Que conteúdo terá se não for preenchido? Uma data padrão?
  - Qual o formato? Tem só dia, mês e ano ou precisa de hora e minuto?
  - Por que foi escolhido esse formato? Existe uma norma que exige?

#### Processos operacionais

- Estando o BD criado fisicamente e pronto para uso, inicia-se a fase de definição e implementação de procedimentos operacionais de administração do banco de dados. Entre esses processos temos:
  - Monitoração do acesso aos dados;
  - Monitoração da performance de acesso;
  - Rotinas de salvamento (backup);
  - Planos de recuperação e contingência para falhas no BD;
  - Rotinas de compactação de dados (para redução do espaço em disco);
  - Rotinas de criação e recriação de índices (melhoria de performance).

### Tipos de bancos de dados

#### Banco de dados hierárquico

- Foram os primeiros modelos de implementação de BDs derivados das estruturas de arquivos indexados;
- Já agregavam o conceito de reunir de modo único diferentes coleções de dados;
- Tinha grandes restrições para implementar todo tipo de relacionamento entre diferentes conjuntos de dados;
- Só era capaz de implementar hierarquias, isto é, estruturas em árvore;
- A estrutura de agregação dos dados era realizada por meio de ponteiros;
- Já trazia uma linguagem própria e unificada para manipulação dos dados, permitia o compartilhamento e unificava a administração dos dados.

#### Banco de dados em rede

- No modelo em rede (muito similar ao hierárquico), pode-se ter um conjunto de dados participando de mais de um relacionamento com diferentes conjuntos;
- Assim como os modelos hierárquicos, que utilizavam ponteiros para fazer a associação entre os registros, o modelo rede acabava por criar uma estrutura muito rígida de relacionamento entre os conjuntos de dados.

#### Banco de dados relacional

- O banco de dados com abordagem relacional surgiu para trazer maior flexibilidade às estruturas de dados dos BDs;
- Permitia que novas colunas (campos de dados) fossem agregadas facilmente a um registro já existente, bem como que novos relacionamentos pudessem ser agregados entre esse e outros registros, sem que isso impactasse o armazenamento físico do banco de dados;
- No BD relacional, deixou-se de ter ponteiros para associar registros – pois eles eram campos "artificiais", usados somente com finalidade associativa – e passou-se a utilizar, então, associações feitas por meio de campos naturais;
- Essa nova abordagem relacional veio atender de modo bastante completo todas as restrições que existiam, além de resolvê-las utilizando uma abordagem já amplamente validada: a teoria dos conjuntos (oriunda da matemática básica);

#### Banco de dados pós-relacionais

- Com o desenvolvimento de sistemas orientados a objetos, muitos passaram a se questionar se também os bancos de dados não deveriam usar uma abordagem orientada a objetos para armazenamento dos dados;
- Esses BDs não se estabeleceram no mercado, alguns serviram para projetos muito específicos (normalmente em áreas científicas), mas sem uma representatividade numérica quanto aos profissionais que os conhecem e os utilizam;
- NoSQL (Not only SQL): termo genérico adotado para representar os bancos de dados não relacionais;
- Os BDs não relacionais utilizam os recursos do ambiente relacional (SQL), mas agregam outras facilidades típicas dos modelos orientados a objetos, bem como outras para gerenciamento de distribuição de dados em grandes volumes;
- Em 2003 o Google criou uma iniciativa de um software livre de banco de dados chamado Hadoop, que manuseia grandes volumes de dados estruturados e não estruturados. Essa plataforma hoje é um dos grandes exemplos de soluções NoSQL;
- A denominação NoSQL não implica que esse tipo de BD não utilizará o SQL, mas que implementará outros recursos além dele.

## Sistema de gerência de banco de dados

### O que é e para que serve um SGBD?

- Um sistema gerenciador de banco de dados é um conjunto de programas criado para executar as funções de manipulação física dos dados armazenados em um BD;
- Essas funções podem ser divididas em externas, internas e de apoio:
  - Funções externas: onde temos o pré-processamento, isto é, a pré-compilação dos comandos de manipulação de dados;
  - Funções internas: onde encontramos o motor de processamento e de acesso aos dados, realizados por meio de um compilador de linguagem de manipulação de dados;
  - Funções de apoio: encontramos aquelas ligadas a controles de transações e de concorrência de acesso.
- Structured Query Language (SQL): é a linguagem padronizada que é dividida em quatro grandes grupos de comandos e são organizados de acordo com a finalidade a que se destinam;
  - Data Manipulation Language (DML): Select, Insert, Delete, Update etc;
  - Data Definition Language (DDL): Alter, Create, Drop etc;
  - Data Control Language (DCL): Grant, Revoke, Deny;
  - Transactional Control Language (TCL): Commit, Rollback.
- Dentre os profissionais envolvidos nas atividades diretamente ligadas ao SGBD, temos:
  - Administrador de banco de dados: criar, monitorar, controlar e executar tarefas operacionais;
  - Projetistas e arquitetos de soluções: definir arquiteturas e alternativas de uso do SGBD em diferentes projetos;
  - Usuários eventuais: acessar os dados por meio de ferramentas interativas nas quais cada acesso requer diferentes dados;
  - Usuários parametrizáveis: acessar os dados por meio de interfaces pré-definidas (normalmente telas de sistemas) nas quais cada acesso segue um padrão pré-programado;
  - Analistas de sistemas: definir quais dados devem ser acessados e quais as transformações que eles deverão sofrer (especificação);
  - Programadores: definir como os dados serão acessados e como eles serão transformados (codificação);
  - Fornecedores de ferramentas: criar softwares complementares às funções básicas do SGBD;
  - Equipe de suporte e operação: executar atividades operacionais para garantir a disponibilidade e a usabilidade do SGBD.

### Vantagens e desvantagens do uso de um SGBD

#### Vantagens

- Natureza de autodescrição de um sistema de banco de dados:
  - Antes da existência dos SGBDs, a definição das estruturas de dados era mantida em uma estrutura separada dos próprios dados;
  - A descrição da ordem em que os diversos campos iriam aparecer, o tamanho de cada um dos campos, a formatação que apresentariam, entre outras características, eram armazenadas em um local e os dados eram armazenados em outro;
  - Com o advento dos SGBDs, passou-se a ter uma estrutura integrada de definição dos dados e de armazenamento dos dados, isto é, se a definição muda, os dados mudam;
  - Os programas não precisam definir o layout (estrutura dos campos) de cada registro, como antes faziam.
- Isolamento entre programas e dados, abstração de dados:
  - O programa passa a referenciar um dado por meio de seu nome, tendo total abstração do formato, tamanho, modo de armazenamento, estrutura física, entre outros;
  - Um mesmo dado pode estar em um banco de dados centralizado, distribuído em um BD local ou remoto, ou, ainda, ser compactado (ou não);
  - Tudo isso não afetará o código que o programador irá gerar para referenciar ou acessar esse dado, tornando o processo de codificação do programa mais simples e garantindo que ele continuará funcionando mesmo que existam alterações na estrutura do banco de dados.
- Suporte às múltiplas visões de dados:
  - Essa habilidade tem grande importância quando lembramos que uma das características principais a serem buscadas no uso de um BD é o compartilhamento;
  - Ao compartilhar e criar conjuntos coerentes de dados (outra característica importante), poderíamos acabar expondo, de modo indevido, porções dos dados que não interessam ou que não deveriam ser publicadas a todos os que os acessam;
  - Para contornar essa situação, foi criada uma estrutura definida como view, isto é, uma visão dos dados. Por meio de uma view, é possível restringir um conjunto vertical ou horizontal de dados.
- Compartilhamento de dados e processamento de transação multiusuário:
  - Essa é uma das características que é vantagem do próprio banco de dados, mas, aqui, trata-se de uma abordagem do ponto de vista de implementação de funções dentro do SGBD que viabilizam essa função;
  - Imagine o grau de complexidade com que um programador teria que lidar para permitir que um programa pudesse acessar, de modo concorrente, um mesmo conjunto de dados no qual diversos programas realizassem operações simultâneas de atualização e exclusão;
  - Pode-se dizer que seria praticamente inviável compartilhar e controlar as operações de atualização simultânea se não existisse, no SGBD, esse controle já automatizado.

#### Desvantagens

- Recursos de infraestrutura:
  - Um SGBD requer muito mais recursos de infraestrutura para ser criado, mantido, publicado, compartilhado e administrado;
  - Isso significa que é necessário mais poder computacional (hardware e software) para instalar, configurar e disponibilizar um SGBD do que seria necessário para disponibilizar uma estrutura baseada em arquivos convencionais.
- Custo:
  - Mesmo nos casos em que se possa pensar no uso de um SGBD open-source (de software livre). O SGBD em si não tem custos, na verdade, a infraestrutura que ele usará terá seus custos (maior capacidade de hardware necessária, outros softwares complementares etc.).
- Performance:
  - Se considerarmos que a infraestrutura onde o SGBD será executado é limitada – o que pode ocorrer, por exemplo, em um smartphone ou em uma estação de atendimento do tipo toten –, haverá uma perda de performance cada vez maior, isto é, quanto maior for a complexidade do SGBD utilizado, maior será a perda de performance.

### Criação e manutenção de um SGBD

- Dentre as funções do SGBD, podemos destacar o fato de ele servir como ferramenta para integrar três níveis existentes na arquitetura de três esquemas (NAVATHE; ELMASRI, 2006):
  - Nível interno:
    - É representado por um esquema interno que descreve toda a estrutura de armazenamento e manipulação física dos dados, ou seja, em um nível próximo do hardware;
    - Sem esse nível, gerenciado pelo SGBD, teríamos que transferir essa complexa tarefa para o programador, aumentando em muito a dificuldade para interação dos sistemas de informação com os dados que eles viessem a utilizar.
  - Nível conceitual:
    - Está associado ao esquema conceitual e descreve de modo integral a estrutura do banco de dados – descrição das entidades, relacionamentos, tipos de dados, regras de acesso, regras de segurança etc;
    - Nesse nível, os detalhes da estrutura física não são relevantes, precisamos conhecer os dados que temos disponíveis para acesso, porém não é necessário saber como estão fisicamente armazenados.
  - Nível externo:
    - Apresenta por meio de uma série de esquemas (ou visões) que publicarão partes de um banco de dados que seja de interesse de um ou mais grupos de usuários;
    - Por meio desse esquema, podemos proteger o acesso a partes do BD ou simplificar o acesso a conjuntos de dados (ocultando aquilo que não seja relevante).

### Tipos de SGBD

- Um mesmo fornecedor pode oferecer diversas versões do mesmo SGBD, porém é necessário atentar ao modelo oferecido e verificar o que mais se adéqua a necessidade do projeto;
- Modelos do SGBD SQL-Server 2017 da Microsoft:
  - Enterprise: acesse recursos de missão crítica para alcançar escala, segurança, alta disponibilidade e performance líder incomparáveis para seus workloads de nível 1 de Advanced Analytics, business intelligence e bancos de dados;
  - Standard: encontre recursos de programação avançados, inovações de segurança e performance rápida para aplicativos de nível intermediário e data marts. Faça upgrade facilmente para a Enterprise Edition sem precisar alterar nenhum código;
  - Express: crie pequenos aplicativos web e móveis, controlados por dados de até 10 GB, com esse banco de dados de nível básico. Disponível gratuitamente;
  - Developer: crie, teste e demonstre aplicativos em um ambiente que não seja de produção com esta edição completa do SQL Server 2017.
- Dentre os vários fatores que devem ser considerados na escolha de um SGBD, um deles é a quantidade de usuários que estarão conectados para obter e atualizar dados por uma ou mais aplicações;
- Pontos de consideração ao se definir um SGBD:
  - Quanto maior for a quantidade de usuários simultâneos, maior é a preocupação com a escolha de um SGBD robusto em performance, em segurança, em utilização de recursos de infraestrutura etc;
  - Crescimento da base de dados com o passar do tempo;
  - Estabilidade do SGBD, este critério tem correlação com os aspectos de robustez, desempenho e segurança;
  - Custo total de propriedade (CTP) do SGBD, entende-se o quanto gastamos para adquirir (mesmo que no modelo as a service ou locação), implantar e manter o SGBD em operação. O CTP envolve não apenas custos com software, mas também custos com hardware e, principalmente, custos com mão de obra (talvez o mais significante dos três custos).

## Modelagem de Dados

- Modelagem de dados é o método de planejamento para a criação coerente de tabelas no banco de dados.

### O que é e para que serve um modelo de dados?

- Um modelo é, de modo geral, uma representação de um ou mais objetos do mundo real realizada por meio de uma técnica específica, com uma finalidade específica;
- Um modelo de dados é a representação de uma porção do mundo real que consegue reproduzir e manter as características essenciais dos objetos e das relações existentes entre esses objetos;
- Existem várias técnicas para a criação de um modelo de dados onde cada uma irá agregar diferentes níveis de informação ao modelo produzido e, por conseguinte, gerar diferentes níveis de entendimento do mundo real que está representando.
- Um modelo, independentemente da técnica que tenha sido aplicada para sua construção, precisa respeitar algumas premissas, por exemplo, incluir ou excluir algumas características inerentes do objeto que estamos representando, mas devemos, acima de tudo, manter a coerência com o objeto que está sendo representado.

### Vantagens e desvantagens de um modelo de dados

#### Vantagens

- Capacidade de planejar a estrutura do banco de dados;
- Reduzir custos e prazos na criação de uma estrutura de banco de dados;
- Em um modelo de dados, poderemos criar e alterar o planejamento da estrutura de nosso banco de dados, sem que isso represente impacto real em uma estrutura física já construída;
- Capacidade de prototipagem das estruturas de dados que teremos;
- Serve de documentação do banco para futuras alterações e migrações;
- É independente de SGBD, podendo ser portado para diversos SGBDs posteriormente.

#### Desvantagens

- Algumas pessoas apontam a modelagem de dados como uma desvantagem por conta do tempo que é levado para o seu desenvolvimento;
- Pode ser complexo para o entendimento de leigos;
- Para alguns, o modelo de dados deixa de ser útil depois que o bando de dados foi implementado.

### Criação e manutenção de um modelo de dados

- O processo de criação de um modelo de dados foi definido originalmente por Pin-Shan Chen em sua obra denominada _A abordagem entidade-relacionamento para o projeto lógico_, em 1977;
- A proposta de Chen (1990) para a criação dos modelos de dados também era muito simples. Ele dizia que todos os elementos de um mundo real observado poderiam ser mapeados por somente dois conceitos: as entidades (ou coisas) e os relacionamentos (associações entre coisas);
- Essa abordagem acabou por se tornar conhecida como _modelo entidade-relacionamento_ ou _modelagem entidade-relacionamento_, pois todo o processo se baseava em conseguir representar em um diagrama as entidades (coisas) e os relacionamentos (associações) observados no mundo real que se estava modelando;
- A abstração das entidades pode ser feita por meio de cinco critérios básicos:
  1. Objetos concretos:
     - Coisas que conseguimos ver, pegar, manusear, medir ou pesar, pois existem concretamente no mundo real. Podem ser seres vivos ou inanimados;
     - Exemplos: Pessoa, veículo, árvore, caneta, átomo etc.
  2. Fatos:
     - Coisas que conseguimos ver, presenciar, participar, conhecer ou documentar, pois aconteceram, acontecem ou acontecerão;
     - Exemplos: Casamento, acidente de trânsito, fusão de átomos etc.
  3. Funções:
     - Papéis exercidos por pessoas, veículos, animais ou coisas concretas. Podem ser seres vivos ou inanimados, porém com qualificação de funções;
     - Exemplos: Médico (pessoa com função de prestar serviços de saúde), trator (veículo com função de prestar serviços rurais) etc.
  4. Interações:
     - Operações em que duas ou mais entidades participam;
     - Exemplos: Compra (uma pessoa adquire um carro), venda (uma empresa vende um produto), troca (um produto é trocado por outro) etc.
  5. Especificações:
     - Representam os modelos ou tipos de coisas, não propriamente as coisas. Além disso, guardam dados sobre os tipos de coisas, não sobre as coisas;
     - Exemplos: Tipo de funcionário (estagiário, contratado, terceirizado); guardaria dados como: se recebe ou não 13º salário, se tem férias ou não, quantas horas por semana deve trabalhar etc.
- Atributos (ou campos) são, portanto, as características que nos fazem perceber uma entidade;
- Cada um desses atributos estará associado a uma entidade por meio de uma lista e deverá ter suas propriedades definidas com o uso de um dicionário de dados;
- Um identificador único é um atributo que servirá para distinguir uma entidade de outra;
- Uma entidade pode ter mais de um atributo que seja candidato a identificador único.

#### Cardinalidade:

- 1:1 (leia-se 1 para 1): esse tipo de cardinalidade representa relacionamentos em que um elemento da entidade A tem somente uma associação com um elemento da entidade B e vice-versa;
- 1:N (leia-se 1 para N ou 1 para muitos): cardinalidade em que um elemento da entidade A pode possuir associações com vários elementos da entidade B, enquanto cada elemento da entidade B só pode estar associado a um único elemento da entidade A;
- M:N (leia-se M para N ou muitos para muitos): nesse tipo de relacionamento, um elemento da entidade A pode estar associado a vários elementos da entidade B, enquanto cada elemento da entidade B pode também estar associado a vários elementos da entidade A.

### Tipos de modelos de dados

- O modelo de dados proposto por Chen (1990) na abordagem entidade-relacionamento deverá ser transformado, por meio de regras de conversão, em um modelo lógico que implemente a arquitetura hierárquica, rede ou relacional, conforme a necessidade do projeto;
- O objetivo de conversão é transformar, portanto, um modelo genérico e com mais semântica em um modelo específico de uma tecnologia. Para cumprir essa tarefa de conversão, deveremos respeitar os requisitos da tecnologia relacional;
- A primeira regra de conversão determina que cada entidade do modelo conceitual deve ser transformada em uma tabela, ou seja, teremos tantas tabelas quanto o número de entidades do modelo;
- A segunda regra de conversão determina que cada atributo (campo) associado a uma entidade deverá ser transformado em uma coluna na tabela, em que ele aparece localizado no modelo conceitual. Segundo Heuser (2009), deveremos escolher um dentre os atributos que permitem o campo como identificador único para a entidade (_chave primária_);
- A terceira regra de conversão se aplica ao relacionamento de grau 1:1. Ela determina que, sempre que existir um relacionamento 1:1 entre a entidade A e B, deveremos criar, na entidade B, uma nova coluna que seja cópia da coluna chave da entidade A ou vice-versa;
- A quarta regra de conversão se aplica ao relacionamento 1:N. Essa regra define que, existindo um relacionamento de grau 1:N entre a entidade A e B, sendo A a entidade de grau 1 e B a entidade de grau N, deverá ser criada, na entidade B, uma coluna que seja cópia da coluna chave da entidade A (chave estrangeira de A);
- Por fim, a quinta e última regra determina que, havendo uma relação de grau de M:N entre as entidades A e B (já transformadas em tabelas A e B), deve-se criar uma tabela C, que receberá as colunas chaves da entidade A e da entidade B, sendo essas duas colunas (chave estrangeira de A e chave estrangeira de B) a nova chave da tabela C.

## Modelo relacional e normalização

### O que é e para que serve um modelo relacional?

- O ponto de partida do modelo relacional é baseado na **teoria dos conjuntos**;
- Em uma definição simples, mas formal, podemos definir _conjunto_ como o agrupamento de elementos que possuem características semelhantes, ou uma coleção de objetos. Essa definição também pode representar uma _entidade_ no processo de modelagem;
- Outro ponto que podemos observar é que os elementos que compõem determinado conjunto podem se relacionar com elementos de outros conjuntos e que essa associação é chamada de _relação entre conjuntos_, onde também podemos representar a _relação entre entidades_ da mesma forma;
- Com base nessas similaridades, Edgar Frank Codd (1923-2003), pesquisador da empresa IBM, publicou, em 1970, um artigo denominado _Modelo relacional de dados para grandes bancos de dados compartilhados_, no qual apresentou uma proposta para que o armazenamento e a manipulação de grandes bases de dados pudessem ser feitos utilizando-se todos os princípios matemáticos da teoria dos conjunto;
- Principais conceitos oriundos da teoria dos conjuntos que são aplicados no modelo relacional:

| Conceito                      | Definição                                                                                                                    | Elemento do modelo relacional                                              |
| ----------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| Conjunto                      | Agrupamento de elementos com características semelhantes.                                                                    | Tabela                                                                     |
| Relação                       | Associação, vínculo ou correspondência entre elementos de diferentes conjuntos.                                              | Relacionamento, Chave estrangeira                                          |
| Elementos                     | Itens que compõem um conjunto.                                                                                               | Linha                                                                      |
| Características dos elementos | Propriedades comuns que cada elemento possui com os demais do seu conjunto.                                                  | Coluna, Chave primária, Chave secundária, Chave candidata, Índice          |
| Operação                      | União, intersecção, diferença ou produto cartesiano de elementos de diferentes conjuntos com base em critérios associativos. | Operação                                                                   |
| Integridade                   | Garantia de que valores ou referências entre elementos sejam sempre válidos.                                                 | Integridade de identidade, Integridade referencial, Integridade de domínio |

- O primeiro conceito incorporado ao modelo relacional é o de **conjunto**, que, na teoria relacional, transforma-se em uma tabela;
- O segundo conceito é a **relação**, que, na teoria relacional, converte-se em um relacionamento entre duas tabelas;
- O terceiro conceito são os **elementos** que compõem o conjunto e que se transformam, no modelo relacional, em tuplas ou linhas da tabela;
- O quarto conceito são as **características** de cada elemento;
- O último conceito são as **operações** que acontecem por meio das funções de união (ou junção), intersecção, diferença ou produto cartesiano entre dois conjuntos ou entre duas tabelas, já que as tabelas acabam por representar os conjuntos:
  - **União entre dois conjuntos**: permite que dois conjuntos semelhantes (algo relevante de se destacar) – isto é, que contenham diferentes elementos com as mesmas características – sejam unidos, resultando em um novo conjunto;
  - **Intersecção ou junção de dois conjuntos**: operação na qual se consegue, por meio de dois conjuntos, como o próprio nome sugere, produzir um terceiro conjunto;
  - **Diferença entre conjuntos**: operação na qual um conjunto denominado conjunto 3 é o resultado, um conjunto 1 de elementos será removido de dentro de outro conjunto 2, resultando em um novo conjunto 3, que é menor do que o conjunto 2 original;
  - **Produto cartesiano**: combina todos os N elementos de um conjunto 1 com todos os M elementos de um conjunto 2, produzindo um novo conjunto com M × N elementos;
- **Integridade**: consiste na garantia de que os conjuntos e tabelas tenham coerência neles e entre eles. O conceito de integridade é implementado no modelo relacional por meio de dois elementos: **a integridade de identidade** e a **integridade de domínio**;
  - Esses dois elementos procuram assegurar que, em uma tabela criada para armazenar FRUTAS, não possamos, por exemplo, armazenar dados de um animal;
  - Não podemos cadastrar chaves primárias duplicadas;
  - A integridade de domínio também é uma garantia de que os dados armazenados não percam sua coerência com o passar do tempo e, consequentemente, sua utilidade;
  - **Manutenção da integridade referencial**: esse conceito diz que uma chave estrangeira não pode conter um valor de uma chave primária que não exista.

### Vantagens e desvantagens de se usar um modelo relacional

- Codd estabeleceu um total de 12 regras para avaliar o grau de aderência de cada sistema gerenciador de banco relacional fornecido no mercado de software:
  1. Toda informação em um banco de dados relacional é apresentada de maneira lógica na forma de tabelas: estabelece que toda a estrutura de funcionamento do SGBD relacional deve utilizar o conceito de tabela;
  2. Todo dado em um BD relacional tem a garantia de ser logicamente acessível, recorrendo-se a uma combinação do nome da tabela, um valor de chave e o nome da coluna: ter um método de acesso único que permita acessar qualquer dado armazenado em um BD facilita a futura construção de aplicações e garante que todo e qualquer dado existente, independentemente de quem o criou, poderá estar à disposição sem que seja necessário algum algoritmo ou chave de acesso especia;
  3. Tratamento sistemático de valores nulos (ausência de informação): nos casos em que uma informação esteja ausente em uma coluna, precisamos ter um método único – e provido pelo próprio SGBD – para reconhecê-la e até mesmo para validar se ela é ou não permitida;
  4. O catálogo dinâmico on-line é baseado no modelo relacional: essa regra define que qualquer documentação gerada sobre o BD, como seu dicionário de dados, também deverá ser armazenada como uma tabela, tendo linhas e colunas que possam ser acessadas como uma tabela convencional;
  5. Há uma linguagem não procedural para a definição, a manipulação e o controle dos dados: o SGBD deve prover uma linguagem de alto nível para definição dos dados no BD (criação de tabelas, colunas e índices, alteração de tabelas, entre outros), manipulação (leitura, atualização, exclusão de dados nas tabelas), bem como para definição de permissões ou remoção dos direitos de acesso;
  6. Tratamento das atualizações de visões dos dados: deve permitir que os dados que forem atualizados na visão também devem ser atualizados nas tabelas que deram origem a ela;
  7. Tratamento de alto nível para inserção, atualização e eliminação de dados: o SGBD deverá prover meios para que operações que afetam não somente uma linha de uma tabela (ou de várias tabelas) possam ser executadas por meio de um comando único e padronizado;
  8. Independência física dos dados: os programas criados por meio de uma linguagem de alto nível de manipulação de dados devem estar isolados de mudanças físicas que acontecem no armazenamento dos dados;
  9. Independência lógica dos dados: o programa vai se adaptar automaticamente às mudanças, o que é um grande benefício para a equipe de desenvolvimento, pois suas aplicações se tornam estáveis;
  10. Restrição de Integridade (identidade, referencial e domínio): o SGBD deverá ser capaz de gerenciar automaticamente os aspectos relativos ao controle de integridade, não permitindo, por exemplo, que uma chave primária seja nula ou tenha valor duplicado;
  11. Independência de distribuição dos dados: qualquer mudança nos critérios de distribuição dos dados – desde um BD não ser originalmente distribuído e passar a ter distribuição, ter uma distribuição entre dois diferentes nós de uma rede e passar a ter três diferentes nós, por exemplo – será transparente para o programa que acessa esses dados;
  12. Não subversão das regras de integridade ou restrições quando se usa uma linguagem hospedeira: mesmo que exista um meio de uma linguagem de mais baixo nível – e não apenas a de alto nível provida pelo SGBD – manipular os dados do BD, não deverá ser possível deixar de manter ativos todos os controles e as regras de integridade asseguradas pelo SGBD;
- Após as 12 regras terem sido estabelecidas, surgiu uma décima terceira regra, que passou a ser chamada de regra zero: 0. Um SGBD relacional deve gerenciar seus dados usando apenas suas capacidades relacionais.

### Criação e manutenção de um modelo relacional

- Segundo Navathe e Elmasri (2005), a criação de um banco de dados relacional é, na verdade, uma etapa que está vinculada à derivação do modelo entidade-relacionamento (E-R) para um modelo relacional;
- As regras de derivação do modelo E-R para um modelo relacional podem ser aplicadas em dois momentos:
  - O primeiro consiste no instante em que o modelo está sendo concebido, pois algumas ferramentas de construção já o fazem orientado para o modelo relacional e, portanto, já incorporam as chaves primárias, chaves estrangeiras etc;
  - O segundo momento ocorre quando o modelo E-R já está pronto e se deseja iniciar a criação das tabelas no SGBD.
- As regras genéricas de derivação do modelo E-R podem agregar novos conceitos do modelo relacional (chaves primárias, chaves estrangeiras etc.):
  - Primeira regra: trata da conversão de entidades e menciona que todos os atributos dessa entidade serão transformados em colunas nas tabelas;
  - Segunda regra: os atributos de um relacionamento 1:N são sempre transferidos para a entidade em que o grau N está vinculado;
  - Terceira regra: em um relacionamento de grau 1:1 com atributos, estes podem ser transferidos para qualquer uma das tabelas que participam do relacionamento, não havendo preferência ou exigência de que vá para uma ou para outra;
  - Quarta regra: diz respeito à derivação dos atributos de relacionamentos de grau M:N – estabelece que os atributos do relacionamento deverão ser mantidos no próprio relacionamento, que, nesse caso, irá se transformar em uma nova tabela (tabela associativa).
- Normalização de tabelas: método para auxiliar a obter tabelas relacionais com estruturas íntegras, visa reduzir a redundância e aumentar a integridade das tabelas que serão criadas:
  - Primeira forma normal (1FN): estabelece que, em uma tabela, todos os atributos devem ser atômicos, ou seja, não podem ser itens de repetição nem agrupamentos de outros atributos;
  - Segunda forma normal (2FN): diz que a tabela deverá estar primeiramente na 1FN, logo todos os atributos não pertencentes à chave primária deverão depender totalmente da chave primária;
  - Terceira forma normal (3FN): diz que a tabela deverá estar na 2FN e que, entre os atributos não pertencentes à chave primária, não deverá existir uma dependência transitiva de valores, isto é, uma coluna (não chave) não poderá dar origem a outra coluna na mesma tabela.
