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
