# Sistemas Operacionais

## Introdução aos sistemas operacionais

### Primeira fase dos computadores:

- Período de 1945 e 1955;
- Computadores utilizavam válvulas;
- Não possuíam sistema operacional;
- Utilização de comando bit-a-bit e posteriormente cartões perfurados;
- Utilizava as linguagens Fortran e Assembly para processar as instruções dos cartões.

### Segunda fase dos computadores:

- Período de 1955 a 1965;
- Desenvolvimento do transistor e das memórias magnéticas;
- Aumento na velocidade de processamento e capacidade de armazenamento;
- Redução do tamanho dos computadores;
- Início da comercialização para grandes empresas, órgãos governamentais e universidades;
- O _sistema batch (lote)_ passou a ser utilizado visando reduzir o tempo de ociosidade da máquina;
- Passou a utilizar as **fitas magnéticas** no lugar dos cartões perfurados, chamado de _rolamento (spooling)_;
- **Throughtput** = tarefas processadas por unidade de tempo;
- **Conceito de canal** = permitia a transferência de dados entre dispositivos de E/S e a memória principal, sem a
  participação da CPU (UCP – Unidade Central de Processamento).

### Terceira fase dos computadores:

- Período de 1965 e 1980;
- Segmentação do uso dos computadores;
- Lançamento da **série 360** da IBM;
  - Utilizava os _Circuitos Integrados (CI)_ ou _Small Scale Integration (SSI)_;
  - Sistema operacional OS/360.
- Introdução da **multiprogramação**;
- Conceito de _compartilhamento de tempo_ (time sharing);
- Diminuição do tempo de retorno da execução de um programa;
- Início do uso de _memória virtual_ pelos sistemas operacionais **TSS**, **Multics** e **CP/CMS**;
- Lançamento do sistema operacional **Unix** em 1971;
  - Desenvolvido por Ken Thompson, Dennis Ritchie, Douglas McIlroy e Joe Ossanna em assembly na AT&T Bell Laboratories;
  - Em 1973 foi reescrito em **C** por Dennis Ritchie.
- Uso dos padrões Transmission Control Protocol/Internet Protocol (TCP/IP);
- Uso do padrão Ethernet, desenvolvido pelo Palo Alto Research
  Center (PARC) da Xerox;
- Criação do microprocessador comercial 8080 da Intel.

### Quarta fase dos computadores:

- Período de 1981 atualmente;
- Desenvolvimento da integração de circuitos em grande escala (LSI - Large-scale Integration);
- Surgimento dos chips que possibilitaram o desenvolvimento do conceito de _computador pessoal (PC)_;
- Surgimento do conceito de _rede local_;
- Desenvolvimento da _Graphicals User Interfaces (GUI)_ e do _mouse_ pelo PARC da Xerox, com a finalidade de facilitar o uso do PC pelo usuário;
- Lançamento do MS-DOS da Microsoft em 1981;
- Lançamento do Macintosh pela Apple em 1984;
- Desenvolvimento dos sistemas operacionais distribuídos, popularizando o modelo _cliente/servidor_ (client/server);
- Início do **multiprocessamento**;
- Lançamento do núcleo Linux por Linus Torvals em 1991;
- Início da computação em dispositivos móveis;

## Ambientes de sistemas operacionais

### Sistemas embarcados

- São computadores dedicados ou embutidos;
- Chamados de _computadores pervasivos_ ou _ubíquos_;
- Geralmente encontrados em eletroeletrônicos, hardwares de rede, equipamentos hospitalares, automóveis etc;
- Maior foco no gerenciamento dos recursos limitados e gerenciamento de energia quando se usa bateria.

### Sistemas de tempo real

- Foco em aplicações em tempo real;
- Variam com relação da complexidade e necessidade de garantia do atendimento das restrições temporais;
- Abrange desde sistemas mais simples como aparelhos domésticos (DVD, lava roupas), até sistemas mais complexos, como sistemas militares ou controle de tráfego aéreo;
- Sistemas de tempo real não críticos:
  - Garantem a execução da tarefa em tempo real com alta prioridade;
  - Não garante que a execução seja concluída a tempo ou que, até mesmo, seja concluída.
- Sistemas de tempo real críticos;
  - Garantem que todas as tarefas sejam concluídas a tempo.

### Sistemas críticos em negócios

- Recebe essa denominação quando uma falha pode resultar em perdas econômicas significativas para a empresa;
- Exemplo: servidores web e servidores de bancos de dados.

### Máquinas virtuais

- Permite um programa agir como um computador completo, com um sistema operacional funcional;
- Virtualização não é semelhante à emulação;
- Uma VM opera de maneira independente e isolada;
- Permite que várias instâncias de sistemas operacionais diferentes possam ser executadas simultaneamente;
- Uma VM é capaz de criar componentes de software que simular dispositivos físicos, exemplo, processador, memória, discos etc;
- Tendem a ser menos eficientes do que o computadores reais, pois não acessam o hardware diretamente e não simulam hardware que não está conectado ao computador hospedeiro.

## Componentes e objetivos dos sistemas operacionais

### Componentes centrais do sistema operacional

- **Kernel (núcleo)**:
  - Software que contém os componentes centrais do sistema operacional.
- **Escalonador de processos**:
  - Responsável pela decisão sobre o momento em que um processo acessará a CPU;
  - É um subsistema do sistema operacional;
  - Faz uso de algorítimos de escalonamento para estabelecer a lógica de sua execução;
  - _Processo orientado a CPU_ (CPU bound):
    - Processo onde o usuário informa os dados, iniciando a execução do programa;
    - O programa será escalonado para uso da CPU;
    - O programa faz uso dos dispositivos de E/S somente na fase inicial (inserção do dados) e no momento final (impressão dos resultados).
  - _Processo orientado à E/S_ (In/Out bound):
    - Processo onde os atos de entrada e saída de dados (E/S), são executados repetidamente dentro de um pequeno espaço de tempo.
- **Gerenciador de memória**:
  - Tem a tarefa de alocar a memória aos processos quando for necessário;
  - Liberar memória, quando um processo terminar;
    Tratar do problema de **Swapping**, isto é, quando a memória é insuficiente;
  - Registradores:
    - Memória que está dentro da CPU;
    - É a memória mais rápida, mas também a mais cara;
    - Encontrada em menor quantidade;
  - Memória cache:
    - Muito rápida, porém inferior a registradora;
    - Maior quantidade que a registradora;
  - Memória principal (Random Access Memory) ou _memória RAM_:
    - Mais lenta que a memoria cache;
    - Maior quantidade;
  - Memória de armazenamento em disco (Hard Disk - HD):
    - Possui a maior quantidade;
    - Porém é a mais lenta;
- **Gerenciador de E/S**:
  - Responsável pelo gerenciamento dos dispositivos de entrada e saída de dados E/S;
  - Estruturado em camadas;
  - O níveis mais baixo ocultam as características de cada um dos dispositivos físicos das camadas superiores, permitindo que as aplicações executadas pelo usuário atuem sem conhecem a arquitetura do hardware;
  - Subsistema de E/S (system calls):
    - Faz o isolamento dos dispositivos para tratar a ampla gama de variações dando flexibilidade ao sistema operacional.
  - Rotinas de E/S:
    - Conjunto de rotinas especiais que cuidam dos detalhes das operações de leitura e escrita a serem realizadas pelo sistema operacional.
  - Device Driver (driver):
    - Camada responsável pela comunicação entre os dispositivos de E/S com a camada de subsistema.
  - Controlador de E/S:
    - Dispositivos de hardware responsável por interagir com os dispositivos de E/S;
    - Executa os comandos traduzidos pelo driver nos dispositivos de E/S.
- **Gerenciador de comunicação interprocessos (IPC)**:
  - Responsável por gerenciar a execução de processos no sistema operacional;
  - Os processos são executados em cápsulas autônomas, de modo que sua execução não afeta a dos demais;
  - O hardware garante que um processo não ocupe o mesmo espaço endereçado a outro;
  - O IPC realiza a sincronização dos processos;
  - Os processos interagem e cooperam na execução de tarefas;
  - Os processos se comunicam das seguintes formas:
    - Internamente, quando dois módulos de um mesmo processo se comunicam;
    - Entre dois processos diferentes, em um mesmo computador;
    - Externamente, quando dois processos em computadores diferentes se comunicam.
  - Para realizar sua tarefa, o IPC pode fazer uso dos seguintes modelos de comunicação:
    - Difusão (broadcast): quando o receptor envia a mesma mensagem para um grupo de receptores, sem saber quem são eles;
    - Produtor-consumidor: quando existe somente um emissor e um receptor, com a comunicação unidirecional entre eles;
    - Cliente-servidor: quando o cliente, que pode ser um computador, programa ou processo, solicita uma requisição para um servidor, que também pode ser um computador, programa ou processo;
    - Peer-to-Peer (P2P): quando cada um dos nós (computadores, programas ou processos) que participam da comunicação atuam como servidores ou clientes;
    - Caixa de correio (mailbox): quando a comunicação entre o emissor e o receptor funciona como uma caixa de correio, na qual o receptor não escolhe o emissor que lhe escreveu a mensagem. Pode ser classificada em dois tipos: a escrita não bloqueante, quando a capacidade de armazenamento da caixa de correio é ilimitada; ou de leitura bloqueante, quando a caixa de correio está vazia;
    - Diálogo: quando há servidores exclusivos para cada cliente, unidos por um canal de comunicação dedicado somente a eles, que será desligado quando a comunicação entre eles acabar.
- **Gerenciador de sistemas de arquivos:**
  - Responsável pela gerência dos arquivos e das operações que esses realizam, bem como pela segurança de acesso, e do compartilhamento entre usuários;
  - Um arquivo é um conjunto de informações, dados ou instruções relacionados logicamente, podendo ser classificado como:
    - Arquivo executável;
    - Arquivo de dados;
    - Arquivo de multimídia.
  - Os arquivos são organizados em **diretórios**, que são criados pelo gerenciador de sistema de arquivos;
  - Os diretórios são estruturas de dados no formado de árvore;
  - Os diretórios contém informações dos arquivos, como localização, nome, forma de organização etc;
  - Para controlar a criação de arquivos, o gerenciador de sistemas de arquivos realiza o gerenciamento do espaço livre em disco;
  - Também gerencia o espaço alocado pelos arquivos já existentes.
- **Objetivos do sistema operacional:**
  - Eficiência: característica que mede a capacidade de um sistema operacional em oferecer o máximo de serviços a diferentes aplicações, no menor espaço de tempo.
  - Robustez: característica que permite ao sistema operacional ser tolerante a falhas e confiável.
  - Escalabilidade: característica que permite ao sistema operacional fazer uso de recursos à medida que eles vão sendo acrescentados ao computador.
  - Extensibilidade: essa característica garante que o sistema operacional se adapte bem ao uso de novas tecnologias, bem como que execute tarefas diferentes daquelas para as quais foi projetado.
  - Portabilidade: a portabilidade garante que o sistema operacional opere em muitas configurações de hardware.
  - Segurança: a segurança em um sistema operacional impede que os usuários e/ou softwares acessem os serviços ou recursos sem a devida autorização.
  - Interatividade: a interatividade permite que as aplicações (software) respondam, rapidamente, às solicitações dos usuários ou aos eventos do sistema operacional.
  - Usabilidade: a usabilidade concede ao sistema operacional o potencial de atender a uma base significativa de usuários.

## Arquitetura de sistemas operacionais

### Arquitetura monolítica

- Os componentes era compilados em módulos separados e depois eram unidos em um único executável;
- O módulos eram carregados em memória carregadas em memória e interagiam entre si por meio de funções;
- A manutenção é mais complicada por ser mais difícil de encontrar o causador do problema;
- Mais suscetível a danos provocados por códigos sujeitos a erros ou mal-intencionados.

### Arquitetura em camadas

- Composto de níveis de camadas que se comunicam entre si;
- As camadas são isoladas umas das outras;
- As camadas inferiores atendem as camadas superiores por meio de interfaces;
- As camadas superiores não conhecem a implementação das camadas inferiores;
- O desempenho acaba sendo afetado por conta do modo de acesso.

### Arquitetura de micronúcleo

- Busca tornar o núcleo do sistema operacional o menor e mais simples possível;
- É altamente modular, sendo extensível, portável e escalável;
- O componentes do sistema operacional são disponibilizados como serviços;
- A aplicação que solicita um serviço é chamado de _cliente_, e o processo que responde a solicitação é chamado de _servidor_;
- O núcleo se limita a executar a comunicação entre _cliente_ e _servidor_;
- Os processos executam suas funções em modo **usuário**, não possuindo acesso aos componentes do sistema;
- Apenas o núcleo executa em modo kernel.

### Sistema Operacional de Redes (SOR)

- Interação dos Sistemas Operacionais Locais (SOL) com SOR;
- Permite a utilização dos recursos do computador local e os recursos da rede;
- O SOL faz um requisição para a rede, e essa requisição é recebida pelo SOR;
- O modelo utilizado é de _cliente/servidor_;
- Utiliza Peer-to-Peer (P2P) como uns dos tipos de arquitetura;
- Os servidores podem ter diferentes atuações, como:
  - Servidor de arquivos;
  - Servidor de banco de dados;
  - Servidos de impressão;
  - Servidor de comunicação;
  - Servidor de gerenciamento.

### Sistema operacional distribuído

- Ampliação do conceito de _sistema operacional de rede_;
- Conjunto de computadores ligados a uma rede e independeres entre si;
- Atuam de modo que dão a impressão de que são um sistema único e integrado;
- As tarefas são divididas entre os computadores que os compõem, sem a interferência do usuário;
- Características:
  - Capacidade de realizar tarefas simultaneamente;
  - Capacidade de adicionar novos computadores (escalabilidade);
  - Uso de mensagens para troca de informações;
  - Alta disponibilidade, caso uma máquina falhe outra assume o lugar.

## Sistemas de arquivos

### Nomenclatura de arquivos

- Alguns sistemas operacionais suportam arquivos com nomes de 8 caracteres e outros suportam até 255 caracteres;
- Alguns sistemas operacionais suportam o uso de caracteres especiais, outros não;
- Alguns sistemas operacionais, como o UNIX, suportam a distinção em letras maiúsculas, outros não, como o MS-DOS.
- Para alguns sistemas operacionais como o UNIX, o uso de extensões de arquivos é opcional, já para outros como o Windows, o uso de extensão possui valor, exemplo um _arquivo.txt_ informa para o sistema qual aplicativo irá executá-lo.

### Tipos de armazenamento

- Sequência de bytes;
- Sequência de registros de tamanho fixo;
- Árvore de registros.

### Tipos de arquivos de armazenamento

- Arquivos regulares: aqueles que contêm informações dos usuários;
- Arquivos de diretórios: arquivos que mantém a estrutura do sistema de arquivos;
- Arquivos especiais de caracteres: utilizados para se comunicar com dispositivos de E/S;
- Arquivos especiais de blocos: utilizados para se comunicar com os discos.

### Tipos de acesso à arquivos

- Acesso sequencial: efetua a leitura dos **bytes** ou **registros**,do início ao fim;
- Acesso aleatório aos arquivos: os **bytes** ou **registros** não eram mais gravados sequencialmente, fazendo com o sistema não precise ler toda a sequência para encontrar os dados.

### Partições

- Setor 0 do disco: chamado de _Master Boot Record_ (MBR, traduzido como Registro Mestre de Inicialização), é o setor responsável por armazenar a **tabela de partição**;
- Tabela de partição: tabela que contém os endereços iniciais e finais das partições;
- O sistema operacional pode ter mais de uma partição no mesmo disco, cada uma com um **sistema de arquivos** diferente;
- Superbloco: local que armazena os principais parâmetros do sistema de arquivos, é lido pela memória quando o sistema é iniciado.

### Armazenamento de arquivos em disco

- Alocação contínua: o sistema operacional armazena so arquivos um ao lado do outro;
- Alocação por lista encadeada: o sistema operacional armazena os arquivos em uma lista encadeada de blocos de disco;
- Alocação por lista encadeada usando uma tabela na memória: evolução da lista encadeada em que os ponteiros dos blocos são substituídos por uma tabela na memória;
- I-nodes (Index-node - nó-índice): o sistema operacional vincula cada um dos arquivos a uma estrutura de dados chamada I-node;

### Sistema de arquivos

- FAT16:
  - 16 bits para o endereçamento de dados;
  - Suporta discos ou partições de até 2GB;
- FAT32:
  - 32 bits para o endereçamento de dados;
  - Suporta discos ou partições de até 2TB;
- NTFS:
  - Suporta discos ou partições de até 256TB;
  - Em relação ao sistema FAT, possui maior desempenho, possibilidade de aplicar políticas de segurança, e a recuperação de falhas através do uso de _journal_;
- Fourth Extended Filesystem (EXT4):
  - Utilizado pela maioria dos sistemas operacionais Linux;
  - Suporta disco ou partições de até 1EB;

## Interpretadores e compiladores

- Linguagens de montagem: faziam usos de programas montadores _(assemblers)_;
- Linguagens de alto nível: executam tarefas com menos instruções que as linguagens de montagem;
- Compiladores: fazem a conversão de uma linguagem de alto nível, para linguagem de máquina;
- Interpretadores: faz a conversão e execução do código gerado em uma linguagem de auto nível em tempo real, isso o torna mais lento do que o método utilizado por compiladores, porém traz a vantagem da portabilidade;
- Exemplos de linguagens de auto nível:
  - **FORTRAN**: desenvolvido pela IBM na década de 1950, é considerada a primeira linguagem de auto nível;
  - **Common Business Oriented Language** (COBOL): traduzida como Linguagem Comum Orientada para Negócios, foi desenvolvida pelo Conference on Data Systems Languages (CODASYL), em 1959, com propósito comercial, e ainda é a mais utilizada em mainframes na atualidade.
  - **C**: desenvolvida por Dennis Ritchie, pesquisador da Bell Laboratories, no início da década de 1970. A linguagem C ganhou destaque ao ser utilizada no desenvolvimento do sistema operacional UNIX;
  - **C++**: desenvolvida por Dennis Ritchie, pesquisador da Bell Laboratories, no início da década de 1970. A linguagem C ganhou destaque ao ser utilizada no desenvolvimento do sistema operacional UNIX;
  - **Java**: desenvolvida por James Gosling, pesquisador da Sun MicroSystems, em 1995, com propósito de ser utilizada em aplicações baixadas pela web e/ou executadas nos navegadores (browsers). Java é uma linguagem orientada a objeto. O sistema operacional Android, desenvolvido pela Google, utilizou a linguagem Java no seu desenvolvimento;
  - **C#**: desenvolvida pela Microsoft, em 2000, com o propósito de ser a linguagem principal da plataforma de desenvolvimento, chamada .NET. A C# é uma linguagem orientada a objeto, que une conceitos de outras linguagens, como: C, C++ e Java.

## Firmware e middleware

### Firmware

- Firmware são instruções executáveis armazenadas em **memória não volátil** (Chips, que não se perde quando o computador é desligado), voltadas em grande parte para operações de leitura; _(Deitel; Deitel; Choffnes, 2005)_
- O firmware é desenvolvido por meio de microprogramação, ou seja, uma camada desenvolvida em microcódigo, que inclui instruções em linguagem de máquina utilizadas pelo hardware;
- Atualmente um firmware é desenvolvido na linguagem **C** e compilado em linguagem de máquina;
- Sua finalidade é permitir que os fabricantes utilizem chips programáveis de uso geral ao invés de hardware dedicado, ocasionando economia de custos e facilidade de inovação e implantação;
- O conceito de microprogramação foi criado em 1951 pelo professor Maurice Wilkes, da Universidade de Cambridge;
- Passou a ser amplamente utilizado na série 360 da IBM em 1964;
- Atualmente é utilizado em muitos dispositivos, exemplo:
  - Controle remoto de TV;
  - Discos rígidos (HD);
  - Players blu-ray;
  - Teclados;
  - Webcams, etc.

### Middleware

- O middleware permite que uma aplicação seja executada em um computador e se comunique com um outra executada em um outro computador quando ambos fazem parte de um sistema distribuído; _(Deitel; Deitel; Choffnes, 2005)_
- Também permite a execução de aplicações em ambientes de computação heterogêneos, desde que antes façam uso de um middleware comum entre eles;
- Faz uso de uma API _(Applications Programming Interface)_;
- Exemplos de middleware;
  - Open Database Connectivity (ODBC - Conectividade aberta para banco de dados);
  - Open Graphics Library (OpenGL - Biblioteca de Gráficos Aberta).
- Um middleware possui muitas semelhanças com o sistema operacional;

## Processadores

- O conceito de processador é um componente de hardware que executa linguagem de máquina (assembly) e que pode ser encontrado em vários formatos dentro da máquina;
- O sistema operacional fornece mecanismos de proteção ao processador, evitando que os processos tenham acesso a instruções privilegiadas ou em memória.

### Desempenho do processador

- O desempenho do sistema operacional está fortemente vinculado ao desempenho do processador;
- Os projetistas de processadores fazem uso de um padrão conhecido como Instruction Set Architecture (ISA) – Arquitetura do Conjunto de Instruções;
- No ISA é feita a descrição do processador, seu conjunto de instruções, o seu número de registradores e o seu tamanho de memória.

#### Processadores CISC

- Complex Instruction Set Computing (CISC - Computação com Conjunto de Instruções Complexas);
- Surgiram na metade dos anos 1960;
- Possuíam um conjunto de instruções que podiam executar diversas operações, ocasionando a diminuição da quantidade de linhas de código dos softwares;
- Segundo Deitel, Deitel e Choffnes (2005), os processadores CISC tentavam transferir muito da complexidade do software para o hardware, reduzindo o tamanho dos programas, diminuindo o acesso à memória e facilitando o processo de depuração do código-fonte;
- Utilizavam _pipeline_ para permitir a execução simultânea de várias instruções.

#### Processadores RISC

- Reduced Instruction Set Computing (RISC - Computação com Conjunto de Instruções Reduzidas);
- Os processadores RISC seguiram caminho inverso dos processadores CISC. Neles, a complexidade da programação foi transferida do hardware para o código-fonte compilado;
- Fazem uso de palavras com tamanho fixo de memória, aumentando o número de registradores e propósito geral, diminuindo a necessidade de acesso à memória;
- Utilizam _pipeline_ com mais eficiência que os processadores CISC;
- Uma desvantagem em relação aos processadores CISC é que as operações que fazem uso de pontos flutuantes são mais rápidas nos processadores CISC;
- A arquitetura RISC deu origem a vários novos projetos de processadores, entre eles, podemos destacar o Advanced RISC Machine (ARM - Máquina RISC Avançada), esse projeto é utilizado amplamente em smartphones, tablets e no Raspberry PI;

### Projeto de processador

- Unidade de Controle (UC): responsável pela busca das instruções na memória principal (MP);
- Registradores: responsável por armazenar os dados para uso imediato pelo processador;
- Unidade de Lógica e Aritmética (ULA): se assemelha muito a uma calculadora convencional, executando operações lógicas e aritméticas, com números inteiros ou reais;
- Interface de Barramento: é responsável pela interação do processador com a memória e os outros dispositivos do sistema;
- Memória Cache: armazena os dados que serão posteriormente utilizados pelo processador, muito mais rápida que a memória principal.

### Gerenciamento de multiprocessador

- Segundo Deitel, Deitel e Choffnes (2005), o termo sistema de multiprocessamento engloba qualquer sistema que contenha mais de um processador;
- Sistemas Fortemente Acoplados (Tightly Coupled Systems): os processadores compartilham a maior parte dos componentes do sistema;
- Sistemas Fracamente Acoplados (Loosely Coupled Systems): a comunicação entre o processador e os componentes é feita por enlaces de comunicação;

## Memórias

- Hardware maiores são mais lentos que hardware menores;
- Princípio de localidade:
  - Localidade temporal: observa uma tendência por parte de um processo em realizar referências futuras a posições feitas recentemente;
  - Localidade espacial: observa uma tendência por parte de um processo em realizar referências a posições na vizinhança da última referência;
  - Localidade sequencial: observa uma tendência por parte de um processo em fazer referência à posição seguinte a atual.

### Hierarquia de memória

- Segundo Deitel, Deitel e Choffnes (2005), a hierarquia de memória é um esquema de categorização da memória, em que a mais rápida e mais cara fica no topo da hierarquia, enquanto a mais lenta e mais barata fica na base;
- Temos então:
  - Registrador: no topo da hierarquia, internos a CPU, os quais são feitos do mesmo material que ela, garantido velocidade de acesso aos dados e às instruções;
  - Cache: abaixo da memória registradora, antes fora da CPU hoje se encontra dentro junto das memórias registradoras, elas fazem o intermédio entre as registradoras e a memória principal;
  - Memória principal: abaixo da memória cache, também conhecida como _memória real_ ou _memória física_, é o nível mais baixo de armazenamento de dados em que o processador tem acesso;
  - Memória secundária: abaixo da memória principal, composta por dispositivos de armazenamento como o disco rígido (HD - Hard Disk), por ocupar o último lugar na hierarquia, os dispositivos de memória secundária são os menos caros e os mais lentos entre todos eles. A memória principal e a secundária são as memórias a que o usuário tem acesso.
  - Armazenamento terciário: composto de dispositivos de armazenamento **externos**, por exemplo: CD, DVD, pen driver, fitas magnéticas etc. Vem como uma solução para sistemas que necessitam de níveis de memória superiores ao que a memória secundária oferece.
  - Memória virtual: funciona como um _auxilio_ à memória principal quando a mesma não possui capacidade de armazenamento suficiente que do é requisitado, o sistema então aloca um espaço na memória secundária fazendo parecer que o computador têm "mais memória", porém esse método não é muito eficiente por causa da diferença de velocidade entre as memórias.
  - CMOS (Complement-ary metal–oxide–semiconductor - Metal-óxido-semicondutor de simetria complementar): utilizada para manter a data e a hora do computador atualizadas, ela é alimentada por uma bateria;
  - ROM (Read Only Memory - Memória Somente de Leitura): é uma memória que já vem programada de fábrica e não pode ser utilizada pelo usuário, utilizada no processo de inicialização do computador;
- As memórias registradoras, caches, principais e CMOS, são memórias voláteis, ou seja, quando o fluxo de energia é cortado, o armazenamento é perdido;

### Memória principal

- Mais conhecida como **RAM** (Random Access Memory – Memória de Acesso Aleatório);
- Segundo Tanenbaum e Bos (2015), ela é a locomotiva do sistema de memória;
- Entre os anos 1950 e 1960, ela era conhecida como memória de núcleos;
- Quando as requisições feitas pela CPU não podem ser atendidas pela memória cache, elas são encaminhadas para a memória RAM;
- Sua característica é que o acesso aos dados é feito de forma aleatório;

### Armazenamento secundário

- Usado pelo computador para resolver o problema de capacidade e volatilidade da memória RAM, quando o computador é desligado, os dados gravados na memória secundária são mantidos;
- Tem a capacidade de armazenar grande quantidade de dados;
- Porém é muito mais lenta do que as memórias de níveis superiores.

## Discos e fitas

### Discos rígidos

- A forma mais comum de armazenamento secundário nos computadores é o disco rígido;
- É um dispositivo de bloco, transmite os dados em tamanhos fixos de bytes;
- É construindo por um ou mais pratos metálicos, que giram com velocidade entre 5.400 e 10.800 rpm (rotação por minuto);
- Os dados são lidos e escritos nesses pratos metálicos por um braço mecânico;
- Uma região circular lida pelo braço em um dos pratos metálicos é chamada de _trilha_;
- A soma de todas as trilhas, em um movimento de leitura feito pelo braço, do começo ao fim do prato metálico, é chamada de cilindro;
- Latência rotacional: é o termo dado a lentidão no uso dos disco rígido, pela necessidade de mover o braço mecânico entre os pratos até que os dados sejam acessados, somado ao tempo de transferência para a memória principal.

### Fita magnética

- Mais utilizada para cópia de segurança (backup);
- O acesso aos dados é feito por uma unidade leitora de fitas, a qual é inserida manualmente ou por braços robóticos;
- Como vantagens podemos destacar o baixo custo por bit e o fato de ser uma forma de armazenamento removível;
- Como desvantagem destacamos o acesso aos dados de forma sequencial, no qual a fita terá que ser percorrida até que o dado seja encontrado.

## Dispositivos de E/S e barramentos

### Barramentos

- Segundo Deitel, Deitel e Choffnes (2005), um barramento é um conjunto de pistas, ou de outras conexões elétricas, que transportam informações entre dispositivos de hardware;
- Tipos de barramentos:
  - Barramentos de dados: são responsáveis pelo transporte de dados;
  - Barramentos de endereços: armazenam e informam o endereço, em que os dados estão armazenados;
  - Portas: permitem a conexão entre dois dispositivos;
  - Canais de E/S: permitem a realização de operações de E/S por meio de um barramento compartilhado entre vários dispositivos.
- O Barramento Frontal (FSB – Front Side Bus) é o responsável por conectar o processador à memória principal;
- O Barramento de Interconexão de Componente Periférico (PCI – Peripheral Component Interconnect) é o responsável pela conexão dos dispositivos periféricos – como placas de vídeo, de som ou de rede – ao resto do computador;
- Uma evolução do barramento PCI é o barramento PCI Express (PCIe), que permite a comunicação de larguras variáveis entre os barramentos;
- O barramento Universal Serial Bus (USB) – Barramento Serial Universal – foi criado para realizar a conexão dos dispositivos de E/S, considerados lentos, como mouses e teclados, ao computador. Uma grande vantagem na sua utilização é que os dispositivos USB fazem uso do mesmo driver, portanto não é necessário instalar um novo driver cada vez que um novo dispositivo USB é acoplado ao computador, nem mesmo reiniciar a máquina;
- O barramento Small Computer System Interface (SCSI) – Interface de Pequeno Sistema de Computadores – foi criado para a conexão de dispositivos de alto desempenho e alto consumo de banda, como os discos rígidos rápidos, os scanners etc;
- O barramento Instituto de Engenheiros Elétricos e Eletrônicos 1394 (IEEE) – Institute of Electrical and Electronic Engineers –, conhecido comercialmente como FireWire, assim como o USB, efetua a transferência de dados de modo serial, porém alcançando velocidades superiores.

### Dispositivos de E/S

- Segundo Tanenbaum e Bos (2015), um dispositivo de E/S é constituído por duas partes, um controlador, isto é, um chip ou um conjunto
  de chips responsável pelo gerenciamento do dispositivo, e o dispositivo propriamente dito;
- A comunicação do dispositivo de E/S com o controlador é feita por um software conhecido como driver do dispositivo;
- Segundo Tanenbaum e Bos (2015), todo controlador tem um pequeno número de registradores usados na comunicação;
- Na prática, o sistema operacional envia um comando para o driver, o qual ativa o controlador, traduzindo o comando recebido, para que este possa ser gravado nos registradores do dispositivo;
- O conjunto de registradores do dispositivo é chamado espaço de porta de E/S;

## Processos e threads

### Processos

- Segundo Deitel, Deitel e Choffnes (2005). "A primeira vez em que o termo processo foi utilizado, ao se referir a sistemas operacionais, foi no desenvolvimento do sistema operacional **MULTICS**, sendo um sinônimo da tarefa (job)";
- Um processo possui o seu próprio espaço de endereçamento, composto por três regiões:
  - Região de texto: armazena textos para a utilização;
  - Região de dados: armazena os dados que serão utilizados pelo processador;
  - Região de pilha: região onde as tarefas são empilhadas para serem processadas posteriormente;

#### Estados de processo

- Uma das responsabilidades do sistema operacional é garantir que cada processo tenha acesso à mesma quantidade de tempo de uso da CPU;
- Em virtude dos eventos a que está sujeito, um processo faz uso de diferentes estados, como:
  - Estado de execução: processo que está sendo executado pelo processador;
  - Estado de pronto: processo que está pronto para ser executado;
  - Estado de bloqueado: processo que estava em execução, mas teve uma parada para fazer uma solicitação de E/S, somente após obter a resposta o processo retorna para o estado de pronto para então continuar o processamento.
- Cabe ao sistema operacional conhecer os processos e seus respectivos estados, para realizar essa tarefa, ele faz uso de duas listas:
  1. Lista de pronto: armazena todos os processos que estão prontos para serem executados;
  2. Lista de bloqueados: armazena todos os processos que estão aguardando o retorno de uma solicitação de E/S.
- Os processos na lista de prontos são armazenados de acordo com a sua prioridade, da mais alta para a mais baixa;
- Os processos na lista de bloqueados, a ordenação não é importante, pois os processos são enviados para lista de prontos à medida que vão obtendo as respostas das solicitações de E/S.

#### Gerenciamento de processo

- Os sistemas operacionais prestam serviços essenciais aos processos, como:
  - Criação;
  - Destruição;
  - Suspensão;
  - Retomada;
  - Mudança de prioridade;
  - Bloqueio, ativação;
  - Comunicação interprocessos (IPC - Interprocess Communication).

#### Estados de processo e estados de transição

- A lista de prontos recebe processos de acordo com o que um usuário executa programas em seu computador;
- Ao encontrar um processador disponível para executá-lo, os processos vão galgando posições na lista de prontos, deixando o estado de pronto para o estado de execução, sofrendo uma transição de estado;
- Cabe ao _despachante_, a responsabilidade de indicar ao processo que ocupa a primeira posição na lista de pronto, que ele pode fazer o uso de um processador, essa atividade recebe o nome de _despacho_;
- O sistema operacional controla as transições de estado, possibilitando que o maior número de processos possível possa acessar os processadores disponíveis no computador;
- Para evitar o monopólio do processador, o sistema operacional faz uso de um timer, que permite ao processo ser executado durante um intervalo de tempo específico (quantum);
- Caso o processo não libere o processor, após o limite de tempo de execução expirar:
  1. O timer cria uma interrupção, permitindo que o sistema operacional recupere o controle sobre o processador;
  2. O processo terá seu estado alterado de execução para pronto;
  3. Por fim o primeiro processo da fila de pronto muda para execução, iniciando de novo o timer.
- Um processo muda seu estado de execução de para bloqueado quando:
  1. Ele está em execução e necessita realizar uma operação de E/S e a resposta não chegou antes do seu tempo de execução terminar;
  2. Ele devolve o controle do processador ao sistema operacional, de maneira voluntária;
  3. Ao receber a resposta do dispositivo de E/S, o sistema operacional muda o estado do processo de bloqueado para pronto.

#### Blocos de controle de processo (PCBs)/descritores de processo

- Quando um processo é criado pelo sistema operacional, ele recebe:
- Um número para a sua identificação, o **PIN** (Process Identification Number - Número de Identificação de Processo);
- Um conjunto de informações que auxiliam o sistema operacional a gerenciá-lo, esse conjunto recebe o nome de **PCB** (Process Control Block - Bloco de Controle de Processo) ou **descritor de processo**;
- O PCB armazena as seguintes informações:
  - O PIN;
  - O estado do processo;
  - Um contador de programa;
  - A prioridade de escalonamento;
  - As credenciais;
  - O ponteiro para o processo **pai**;
  - Os ponteiros para os processos **filhos**;
  - Os ponteiros para localizar os dados e as instruções do processo na memória;
  - Os ponteiros para recursos alocados pelo processo;
  - Contexto de execução.
- O sistema operacional cria uma lista dos PCBs, para que ele possa gerenciar as constantes atualizações de informações;
- Quando um processo é encerrado, voluntariamente ou não, o sistema operacional retira o registro dele da lista de processos, disponibilizando os recursos que ele estava utilizando e liberando-s para outros.

#### Operações de processos

- Um software em execução, into é, um processo, consegue gerar novos processos, quando isso ocorre, ele passa a ser chamado de _processo pai_, os processos que são criados por ele passam a se chamar _processos filhos_, no qual não podem tem mais que um processo pai;
- O sistema operacional pode controlar quando um processo pai é encerrado, se os processos filhos vão sem mantidos ou destruídos;
- O sistema operacional Linux, cria um processo chamado _init_ quando o core (núcleo do sistema) é iniciado;
- O ini gera vários processos filhos, como:
  - kswapd: responsável por operações de gerenciamento de memória;
  - khudb: responsável por operações de dispositivos;
  - xfx: responsável por operações do sistema de arquivos;
  - login: responsável pela autenticação dos usuários no sistema operacional;
  - klogd: responsável pela leitura das mensagens do sistema de log do kernel do sistema operacional.

#### Suspender e retomar

- Para detectar possíveis ameaças à segurança ou para depuração (debug), dos software em execução, os sistemas operacionais permitem que os administradores, ou usuários e os processos realizem a suspensão de um processo;
- Quando isso ocorre, ele não é destruído, mas é retirado da disputa pelo tempo de execução da CPU, sem previsão de retorno;
- Um processo pode suspender a si mesmo ou ser suspenso por um outro processo;
- Quando um processo está suspenso, ele somente poderá ser retomado por um outro processo;
- Quando um processo está em execução e suspende a si mesmo ele passa para o estado suspenso-pronto, que posteriormente será alterado para pronto;
- Quando a suspensão é feita por um outro processo, temos duas opções:
  - Se o processo suspenso estiver no estado pronto, o seu estado mudará para suspenso-pronto;
  - Se ele estiver no estado bloqueado, o seu estado mudará para suspenso-bloqueado.

#### Chaveamento de contexto

- Dizemos que um sistema operacional realiza um chaveamento de contexto quando ele interrompe a execução de um processo e começa a executar outro, que estava no estado pronto;
- Quando isso ocorre, o sistema operacional salva o contexto de execução do processo, que estava no estado execução, no PCB desse processo, além de carregar o contexto de execução anterior do processo, que estava no estado pronto, também em seu PCB;
- Cabe ao sistema operacional tornar essa operação transparente para os processos, que não percebem que tiveram seu uso do processador paralisado;
- O sistema operacional realiza o chaveamento de contexto porque ele precisa que o processador realize tarefas, consideradas por ele como essenciais, e não as tarefas designadas por um processo.

#### Interrupções

- Segundo Deitel, Deitel e Choffnes (2005). "As interrupções habilitam o software a responder aos sinais do hardware";
- O sistema operacional faz uso de um conjunto de instruções, chamado _tratador de interrupções_, para poder gerenciar melhor as interrupções;
- O sistema operacional armazena no tratador de interrupção a resposta para cada tipo de interrupção que pode ocorrer, controlando melhor o processador;
- _Desvio_ (trap): é quando uma interrupção é gerada pelo processador, baseada nas instruções de um processo, que está sendo executado;
- O desvio é uma operação síncrona;
- Um trap ocorre quando um processo tenta realizar uma ação ilegal;
- Uma interrupção pode ser iniciada por algum evento que pode ou não estar relacionado à execução de um processo, nesse caso ela é considerada assíncrona;
- Uma interrupção assíncrona ocorre quando o usuário pressiona uma tecla no teclado ou movimenta o mouse;
- Para o sistema operacional, o uso de interrupções é uma forma simples e barata de chamar a atenção do processador;
- Uma alternativa para a substituir as interrupções é fazer uso da sondagem (polling), na qual o próprio processador solicita a cada um dos dispositivos o seu status;
- A sondagem somente é viável quando estamos tratando de sistemas com baixa complexidade;
- Se um número de interrupções aumentar desproporcionalmente, o sistema operacional pode encontrar dificuldades para acompanhar e executar todas elas;
- Ao receber um interrupção, o processador precisa gravar os dados do processo em execução, para que ele possa recuperá-lo e executá-lo posteriormente:
  - PSW (Program Status Word - Palavra de Estado de Programa): utilizado nos antigos computadores desenvolvidos pela IBM;
  - TSS (Task State Segment - Segmento de Estado de Tarefa): utilizado nas arquitetura IA-32;
- A arquitetura IA-32 pode receber dois tipos de sinais diferentes:
  - O término do quantum do processo em execução;
  - A conclusão de uma comunicação com um dispositivo de E/S ou uma interrupção gerada por um processo.

### Comunicação interprocessos

- O ambientes multiprogramação e os ambientes de rede obrigaram os sistemas operacionais a criarem formas de comunicação interprocessos (IPC).

#### Sinais

- Segundo Deitel, Deitel e Choffnes (2005). "Sinais são interrupções de software que notificam ao processo que um evento ocorreu";
- Eles não permitem que os processos troquem dados entre si;
- Fica sob responsabilidade do sistema operacional determinar qual processo deverá receber o sinal e como ele será respondido pelo processo que o recebeu;
- Ao receber um sinal, os processo podem:
  - Capturá-lo;
  - Ignorá-lo;
  - Mascará-lo.

#### Troca de mensagens

- Com o aumento do interesse pelo uso de **sistemas distribuídos**, a IPC passou a utilizar troca de mensagens, que pode ser:
  - Unidirecional;
  - Bidirecional.
- As mensagens podem ter envios, que são:
  - Bloqueantes: síncrona;
  - Não bloqueantes: assíncrona.
- O Linux e o Windows XP fazem uso de uma implementação de troca de mensagens chamada _pipe_, na qual o sistema operacional faz uso de uma região na memória, que serve como buffer, onde um processo atua como escritor (emissor), e outro como leitor (receptor);
- Nos sistemas distribuídos, as mensagens, ao serem transmitidas, podem apresentar falhas ou até mesmo se perderem no meio da comunicação;
- Para tentar evitar esse cenário, eles fazem uso de protocolos de confirmação, caso a confirmação não seja recebida pelo emissor, ele poderá esperar um tempo e retransmiti-la;
- Outro problema é a segurança. pois os processos emissores e receptores podem identificar possíveis tentativas de roubo de dados.

## Threads

### Definição de threads

- A linguagem de programação ADA, desenvolvida pela Bull SAS para o Departamento de Defesa dos EUA na década de 1970, foi uma das principais linguagens de programação a dar suporte à programação concorrente;
- Um **thread** permite ao sistema operacional executar uma tarefa de modo independente dos outros processos ou threads, esse processo é chamado de **LWP** (Lightweight Process - Processo leve);
- Os threads são criados com base em processo tradicional, chamado de HWP (Heavyweight - Processo pesado);
- Threads usam um subconjunto dos recursos utilizados por um processo comum, como:
  - Registradores;
  - Pilha;
  - TSD (Thread Specific Data - Dados Específicos de Thread).
- O espaço de endereço e outras informações globais, são compartilhadas pelos threads com o processo pesado;
- O gerenciamento de threads pode ser realizado pelo software do usuário ou pelo sistema operacional;
- O uso de threads acabou se tornando relevante por vários motivos, entre eles podemos citar:
  - Projeto de software: desenvolvimento modular do software;
  - Desempenho: permite às aplicações multithread fazerem uso de um ou vários processadores paralelamente;
  - Cooperação: permite a IPC pelos threads, o que minimiza o uso de memória;

### Estados de threads

- Assim como os processos, todo thread tem uma série de estados:
  - **Nascido**: estado em que a thread é criada;
  - **Pronto** (runnable): estado em que a thread está pronta para ser executada;
  - **Execução**: thread que está sendo executada;
  - Bloqueado: estado em que a thread espera o resultado de uma requisição de E/S;
  - Espera: estado em que a thread espera por um evento, como o sinal de outra thread;
  - Adormecido: estado em que a thread não possui nenhuma atividade para realizar no momento;
  - **Morto**: estado em que a thread finaliza sua tarefa e é encerrada.

### Operações de threads

- Cancelamento: quando uma thread deve ser encerrada, o que não significa o seu término real, pois ele pode mascarar ou desativar o recebimento de sinais de cancelamento;
- Associação: quando um processo é criado inicia uma thread **primária**, que será associada a outras threads e fica dormindo até que as outras threads encerrem sua execução.

### Modelos de threads

#### Threads de usuários

- Executam operações de suporte a threads no espaço do usuário;
- São criados por bibliotecas;
- Não podem executar instruções privilegiadas nem acessar o núcleo (core) do sistema operacional;
- Mapeamento de thread _muitos-para-um_: é o processo onde o sistema operacional despacha todas as threads que compõem um processo multithread em um único bloco;
- O sistema operacional não precisa suportar threads;
- Garante a portabilidade do processo;
- O sistema operacional não consegue despachar as threads para mais de um processador simultaneamente.

#### Threads de núcleo

- Mapeiam cada thread em seu contexto de execução;
- Fazem o uso do mapeamento _um-para-um_;
- O sistema operacional consegue despachar as threads de um processo para mais de um processador simultaneamente;
- O sistema operacional consegue visualizar as threads de forma independente;
- As threads de núcleo estão sujeitos à sobrecarga ocasionada pelo chaveamento de contexto;
- São dependentes de API para tratamento de threads do sistema operacional;
- Perde a portabilidade referente as threads de usuário.

#### Threads de usuários e núcleo

- Usam o mapeamento _muitos-para-muitos_;
- O número de threads de usuário e núcleo não precisa ser igual;
- Esse modelo consegue diminuir a sobrecarga do sistema operacional;
- Implementa um reservatório de threads (thread pooling);
- A aplicação informa ao sistema operacional o número de threads de núcleo que precisa.

### Implementação de threads

- A execução de um processo pode ser pausada por uma interrupção gerada por hardware ou por um sinal que, por sua vez, é gerado por software;
- Há dois tipos de sinais:
  - Sinal síncrono: que ocorre quando o sinal é emitido por uma instrução de um processo ou thread em execução;
  - Sinal assíncrono: que não está vinculado a um processo ou thread em execução, como a resposta de uma operação de E/S que está sendo concluída;
- O sinal assíncrono deve possuir um identificador (ID) para definir quem é o receptor da mensagem;
- Caso o receptor não esteja em execução, o sistema operacional adicionará o sinal recebido a uma fila de sinais pendentes;
- Ao receber um sinal assíncrono e o processo fizer uso de threads na sua execução, o sistema operacional deverá decidir se realizará a entrega da mensagem para todos os threads do processo ou para apenas um deles;
- O Linux não faz distinção entre processos e threads, por isso os chama de tarefas;
- Um thread pode chegar ao fim de maneira natural, quando encerra sua execução; ou de maneira abrupta, quando ocorre uma exceção na sua execução ou quando recebe um sinal de cancelamento;
- Cabe ao sistema operacional, ao identificar o término de um thread, removê-lo prontamente do sistema.

## Execução assíncrona concorrente

- Se houver mais de um thread em execução no sistema operacional dizemos que esses threads são concorrentes entre si;
- Execução assíncrona: ocorre quando os threads em execução se comunicam entre si;
- Exclusão mútua: ocorre quando os threads precisam acessar um mesma variável para executar uma operação de escrita, o sistema operacional permite que apenas um thread tenha acesso e que os outros aguardem;
- Serialização: nome dado ao evento dos threads que estão aguardando na fila para poderem ter acesso de escrita à variável compartilhada;
- Seção ou região crítica: local que possui dados que podem ser modificados;
- Limpeza final: ação em que o sistema operacional encerra a exclusão mútua de um thread que teve seu processamento finalizado enquanto estava acessando a região crítica;
- Segundo Tanenbaum e Bos (2015), quatro condições precisam ser atendidas para que tenhamos uma boa solução de gerenciamento ao acesso da região crítica:
  1. Dois processos não podem estar acessando simultaneamente as suas regiões críticas;
  2. Não há certeza no que se refere à velocidade e ao número de CPUs disponíveis;
  3. Um processo que está em execução, fora da sua região crítica, não pode bloquear outros processos;
  4. Um processo não pode ficar esperando infinitamente para acessar a região crítica.
- Mecanismo de semáforo:
  - Criado por Edsger W. Dijkstra, cientista da computação holandês, em 1965 para gerenciar a exclusão mútua;
  - Quando um thread está na região crítica, é atribuído o valor **P** (proberen – testar, em holandês);
  - Quando o thread seja sair, é atribuído o valor **V** (verhogen – incrementar, em holandês);
  - Os semáforos que são utilizados por dois ou mais processos são chamados _semáforos binários_.
- Mutex (mutual exclusion – exclusão mútua):
  - Utilizado para gerenciar a exclusão mútua de um recurso ou parte de código compartilhado entre dois processos;
  - Possui dois estados, _desimpedido_ ou _impedido_, podendo ser implementado com apenas em bit;
  - Diferente do mecanismo de semáforo, ele não utiliza fila;
  - Quando um thread tenta acessar um mutex impedido, ele passa para o estado _bloqueado_, quando o mutex é desimpedido, um deles é escolhido aleatoriamente para acessá-lo.
- Troca de mensagens (message passing):
  - Estratégia utilizada em sistemas distribuídos;
  - Enquanto a mensagem não chega, o receptor permanece bloqueado ou emite um código de erro;
  - O receptor envia uma mensagem de recebimento para evitar a perca da mensagem (acknowledgement);
  - As mensagens possuem um número sequencial para evitar a leitura da mesma mensagem duas vezes;
  - O nome dos processos são únicos para evitar o envio e recebimento de mensagens por processos errados;
  - Utiliza autenticação para evitar comunicação com CPUs não autorizadas.
