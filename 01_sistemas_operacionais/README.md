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
