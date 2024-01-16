# Qualidade e Usabilidade de Software

## Qualidade de software

### A qualidade de software

- Qualidade é a capacidade de um produto ou serviço para atender às necessidades do usuário (BEYON, 2011);
- No desenvolvimento de software, a qualidade do projeto acompanha os requisitos de qualidade, as especificações e o design do sistema;
- Para garantir a qualidade do software são necessários: envolvimento de pessoas, definição de requisitos do software, integração e melhoria contínua dos processos, ferramentas atualizadas e métodos de trabalho.

#### Fundamentos da qualidade de software

- Originalmente, a qualidade de um programa ou sistema era avaliada de acordo com o número de defeitos a cada mil linhas de código. Atualmente, com a evolução do conceito, outros fatores determinam a qualidade do software (BENYON, 2011):
  - Operações de produtos: as características operacionais;
  - Correção: grau em que um programa atende sua especificação e atinge os objetivos definidos pelo usuário;
  - Confiabilidade: nível de execução esperada de um software para realizar as funções com precisão;
  - Eficiência: número de computadores e recursos exigidos pelo programa para executar suas funções com o tempo de resposta adequado;
  - Integridade: medida em que pode ser controlado o acesso ao software ou dados por usuários não autorizados;
  - Facilidade de uso: esforço necessário para aprender, usar e interpretar a funcionalidade do sistema;
  - Revisão do produto: capacidade de resistir a mudanças de tecnologia;
  - Facilidade de manutenção: necessária para localizar e corrigir um bug no sistema;
  - Flexibilidade: esforço necessário para modificar um programa;
  - Facilidade de teste: condição necessária para testar um programa, de modo a assegurar que a função desejada não exija esforço;
  - Transição do produto: capacidade de adaptação a novos ambientes;
  - Portabilidade: necessária para transferir um programa de um ambiente de hardware ou software a outra tecnologia;
  - Reutilização: grau em que um componente de programa ou software pode ser reutilizado em outras aplicações;
  - Interoperabilidade: integração entre sistemas e outros aplicativos.
- Para atingir um nível maduro de produção, métodos específicos devem ser implementados (WEBER, 2012):
  - Gerenciamento de requisitos: é o processo contínuo de análise e documentação dos requisitos do software. Ocorre durante o projeto de desenvolvimento de software e envolve os usuários-chave ou stakeholders;
  - Planejamento de projeto: busca refinar e detalhar os objetivos do projeto e planejar o trabalho necessário para alcançá-los;
  - Monitoramento e controle de projetos: consiste em medir e coletar informações sobre o desempenho do projeto, assim como informar os envolvidos;
  - Gestão de fornecedores: é o processo de adoção de boas práticas e de controle e gestão dos fornecedores;
  - Garantia de qualidade: consiste no acompanhamento do projeto e na avaliação de seus diferentes aspectos para garantir que os padrões de qualidade sejam seguidos.

#### Aspectos no desenvolvimento do software com qualidade

- Existem três conceitos muito importantes na engenharia de software, que se relacionam intrinsecamente:
  - Processo: trata-se de um conjunto de passos ordenados usado para atingir um fim específico, sendo composto por atividades, métodos, práticas e transformações;
  - Projeto: é o que concretiza um processo;
  - Produto: é o objetivo do processo.

### Processos em qualidade de software

#### Erros que devem ser evitados

- Erros relativos ao produto: os mais comuns são a introdução de características desnecessárias aos requisitos, alteração dos requisitos sem uma análise de impacto e erro no foco do desenvolvimento, quando ele é voltado para a pesquisa e não para a produção em si;
- Erros relativos ao processo estão relacionados com processos informais ou processos oficiais rígidos e burocráticos. Os mais comuns são (WEBER, 2012):
  - Desperdício de tempo antes do início do projeto;
  - Pressões por prazos otimistas e o não cumprimento destes por serem impossíveis;
  - Falha no planejamento de projetos em que se omitem as estimativas de atividades, como as de garantia da qualidade e a omissão da análise de riscos;
  - Falha no método de gerir o projeto;
  - Pressa para começar a etapa de codificação;
  - Falha na subcontratação de serviços; e
  - Entrega do produto sem estar totalmente pronto ou testado.
- Defeitos de projeto: são tão graves como os defeitos provenientes de requisitos. Eles se caracterizam por dificuldade para utilização do software, desempenho ruim, defeitos aleatórios de difícil reprodução e dados inconsistentes que comprometem a manutenibilidade e a extensão;
- Erros relativos a pessoas: podem ocorrer por:
  - Falta de patrocínio para o projeto;
  - Ausência de participação dos interessados no produto, como os usuários e desenvolvedores; - - Atritos entre as partes envolvidas; defeitos na formação da equipe do projeto, como a falha na contratação de pessoas;
  - Falta de entrosamento entre funcionários e dependência em relação a determinadas pessoas; - - Ambiente inadequado ao trabalho, com muito barulho, pouco espaço e fatores ergonômicos inapropriados;
  - E, falta de motivação do pessoal (BENYON, 2011).
- Erros relativos à tecnologia: podem ocorrer por uma estimativa otimista de que muitos problemas podem ser resolvidos por meio de alta tecnologia, esquecendo-se de que para utilizá-la em profundidade é necessário treinamento e experiência.

#### Modelos de ciclo de vida

- Codifica-Remenda: é o pior de todos os modelos de ciclo de vida aqui apresentados e, provavelmente, o mais utilizado. Com base em um problema existente, e não um problema modelado ou especificado, mas sim definido de uma forma qualquer, passa-se imediatamente à codificação. Os erros encontrados são corrigidos conforme a demanda, daí o termo remenda. Muitas vezes não existe um processo definido ou, se existe, ele não é seguido, é impossível de ser gerido e, portanto, não se pode assumir compromissos confiáveis;
- Cascata: esse modelo de ciclo de vida tem a vantagem de apresentar pontos de controle que permitem demarcar as fases do processo, facilitando a sua gestão. Porém, ele é rígido e burocrático, porque não permite a correção de erros nas fases anteriores e tem baixa visibilidade para o cliente, pois este não recebe feedback nos pontos de controle existentes, assim o único resultado que o cliente vê é o final. Ele apresenta uma variante que permite a realimentação entre fases, porém esta dificulta a gestão de projetos;
- Espiral: modelo de ciclo de vida em que um produto é desenvolvido em diversas iterações (repetições). Uma iteração nova representa uma volta na espiral. Sua vantagem é que permite a construção de produtos com prazos curtos e a desvantagem é que é difícil de ser gerido.
- Prototipagem evolutiva: utiliza o modelo de ciclo de vida em espiral para construir o produto em protótipos, cobrindo progressivamente os requisitos até a finalização. Sua vantagem é que apresenta visibilidade e alta flexibilidade para o cliente. Como desvantagem, ele precisa de equipes disciplinadas e experientes; o projeto deve ser robusto para que a estrutura do produto permaneça confiável ao longo dos protótipos, além disso, ele é também difícil de ser gerido;
- Entrega evolutiva: esse modelo de ciclo de vida é uma combinação dos modelos cascata e prototipagem evolutiva. Apresenta a vantagem de ter alta visibilidade para os clientes e facilidade de gestão, por apresentar pontos de controle bem definidos. Sua desvantagem é a necessidade de um projeto que seja robusto para que a estrutura do produto permaneça confiável ao longo das liberações programadas;
- Dirigido por prazo: um conjunto de requisitos essenciais é definido e entregue no prazo programado nesse modelo de ciclo de vida. O produto final é, na verdade, um produto parcial e o restante é desenvolvido em processos posteriores, geralmente chamados de manutenção;
- Dirigido por ferramenta: utiliza-se um processo proposto por uma ferramenta CASE e podem ser adequados a um determinado tipo de produto, porém fica restrito ao domínio da aplicação.

#### Processos de desenvolvimento de software

- Processo pessoal de software – PSP: utiliza o modelo de ciclo de vida em entrega evolutiva e não há tratamento específico para requisitos. Na fase de planejamento do PSP, executam-se as atividades de estimativas de tamanho (com base em modelo de orientação a objetos), esforços, cronogramas e defeitos. O projeto é rigoroso tanto para concepção quanto para verificação e é realizado utilizando-se orientação a objetos, síntese lógica e máquinas sequenciais;
- Processo de software para times – TSP: utilizando um modelo de ciclo de vida em espiral, esse processo é uma sequência do PSP. O TSP cobre a área de gestão de requisitos, planejamento e controle de projetos, garantia da qualidade e gestão de configurações não cobertas pelo PSP;
- Processo unificado: esse processo, centrado na arquitetura, é dirigido a casos de uso, sendo iterativo e incremental, e usa a UML (Unified Modeling Language) como notação para os modelos que o compõem, centrado na arquitetura. Ele utiliza um modelo de ciclo de vida em espiral e é dividido em fases e fluxos de trabalho. Cada fase representa um marco gerencial do projeto e cada fluxo de trabalho trata de um tema técnico específico. O RUP (Rational Unified Process) e o EUP (Enterprise Unified Process) são baseados no processo unificado;
- Práxis: é um processo com fins didáticos e baseado em tecnologia de orientação a objetos e sua notação de análise e projeto também é UML. Apresenta elementos do processo unificado, mas com influência do PSP e do TSP. Da mesma forma que o processo unificado, o práxis abrange fases e fluxos: uma fase é dividida em uma ou mais iterações, e um fluxo é dividido em uma ou mais atividades.

## Normas e padrões

### Normas e seus organismos normativos

- Normalização é o processo de desenvolvimento, implementação e melhoria dos padrões que se aplicam a ordens científica, industrial e econômica diferentes, para organizar suas atividades;
- A ISO (International Organization for Standardization) desenvolve normas internacionais para diversos campos da tecnologia, exceto o eletrotécnico, coberto pela IEC (International Electrotechnical Comission), e as telecomunicações, abrangidas pela UIT (União Internacional de Telecomunicações);
- A normalização envolve um conjunto de regras convencionais destinadas a simplificar, unificar e especificar produtos (WAZLAWICK, 2013):
  - Simplificar: procura manter apenas o estritamente necessário, seja em documentos, processos, orientações etc. As próprias normas também são simplificadas para serem facilmente assimiladas;
  - Unificar: a ideia é criar um padrão para os produtos, utilizado em todas as partes do mundo para permitir trocas internacionais;
  - Especificar: procura, por meio de uma linguagem clara e precisa, identificar os produtos, definindo-os, categorizando-os, catalogando-os e detalhando suas características, de modo a orientar o consumidor.
- Em relação às normas técnicas, é importante conhecer os Organismos Nacionais de Normalização (NSB, do inglês National Standards Body) dos países de interesse, que, em geral, possuem um centro de informação sobre normas. No Brasil, o organismo responsável pela elaboração de normas técnicas é a Associação Brasileira de Normas Técnicas (ABNT).

### Normas ISO e modelos CMMI

#### ISO

- A International Organization for Standardization, ou ISO, é uma organização não governamental, uma federação de organismos nacionais de normalização de todas as regiões do mundo, incluindo países desenvolvidos e países em desenvolvimento (MARSHALL JR. et al., 2012);
- Cada membro da ISO possui uma agência principal de normalização em seu próprio país. Os países-membros propõem as novas normas, envolvem-se em seu desenvolvimento e prestam apoio, divididos em grupos técnicos, em conjunto com a Secretaria Geral da ISO, localizada em Genebra, na Suíça (PRESSMAN; MAXIM, 2016);
- Em 27 de fevereiro de 1947, a ISO foi finalmente oficializada e iniciaram-se suas operações. Naquele ano, mais de 19.500 normas foram criadas para todos os setores de produção, incluindo o setor da saúde, a indústria de alimentos, a de tecnologia etc. (PRESSMAN; MAXIM, 2016);
- Em 1987, surge a norma ISO 9000, com a finalidade básica de facilitar ainda mais o comércio global. Para chegar a um consenso sobre essa legislação, foi necessário o apoio de 75% dos países que a compõem. Essa política baseia-se em dois pilares: melhoria e desempenho, enraizada em princípios, incluindo mercados, regulação, melhorias, responsabilidade, desenvolvimento do intelecto etc;
- A partir de 1994, foi implementada a versão ISO 9001, quando ela se tornou mais interessante para as empresas (CAIÇARA JR., 2007);
- A versão atual do padrão é datada de 2015 – a ISO 9001:2015 (ABNT, 2015), um aperfeiçoamento de sua edição anterior, de 2008 – ISO 9001:2008 (ABNT, 2008);
- A fim de validar a implementação dessa norma, faz-se necessária uma auditoria de certificação e aplicação das regras de qualidade, e, se a conformidade for constatada, é emitido um certificado à empresa (MARSHALL JR. et al., 2012);
- Em relação à engenharia de software, a NBR ISO/IEC 9126-1 é a atual padronização mundial de qualidade de produtos, propondo métricas e atributos para os produtos de software (ABNT, 2003).

#### CMMI

- O Capability Maturity Model Integration (CMMI) foi criado pelo SEI (Software Engineering Institute), um órgão de pesquisa da universidade norte-americana Carnegie Mellon, e consiste em um modelo de garantia de qualidade com enfoque voltado para a capacidade de maturidade de processos de software nas empresas;
- SW-CMM pode ser usado para dois fins (CAIÇARA JR., 2007):
  - Melhorar os processos relacionados com a produção e manutenção de software;
  - Definir critérios para a determinação do nível de maturidade de uma organização que produz e mantém software.
- O modelo CMMI busca a melhoria contínua dos processos organizacionais, por meio da análise e redesign, fornecendo, de acordo com Caiçara Júnior (2007):
  - Uma maneira de integrar os elementos funcionais de uma organização;
  - Um conjunto de melhores práticas com base em histórias de sucesso, comprovadas por organizações com experiência em práticas de melhoria de processos;
  - Uma ajuda para identificação de metas e prioridades para a melhoria dos processos, dependendo dos pontos fortes e fracos da organização, obtidos por um método de avaliação;
  - Um suporte às empresas em atividades produtivas complexas para coordenar as suas atividades;
  - Uma referência para avaliar os processos atuais da organização.

###### Níveis de maturidade e capacidade

- O CMMI está dividido em cinco níveis de maturidade, que atestam o grau de evolução de uma organização em determinado momento e tem como objetivo principal guiar a melhoria de processos das empresas. Com ele é possível gerenciar o desenvolvimento e a produção de software, com base em prazos e custos estabelecidos e com mais qualidade:
  1. Inicial: Processo imprevisível e sem controle, a maioria dos processos são ad-hoc e caóticos e a organização geralmente não fornece um ambiente estável para apoiá-los.;
  2. Repetível: Processo disciplinado, o caos passa a ser ordenado, e as organizações se concentram em tarefas diárias relacionadas com a administração;
  3. Definido: Processo consistente e padronizado, os processos são descritos em normas, procedimentos, ferramentas e métodos;
  4. Gerenciado: Processo previsível e controlado, a organização e os projetos estabelecem metas quantitativas para medir a qualidade e o desempenho dos processos, as quais são utilizadas como critérios na gestão;
  5. Otimizado: Processo continuamente melhorado, uma organização melhora continuamente seus processos com base no conhecimento das causas comuns de variação inerente a processos.
- Nos processos de representação contínua, os níveis de capacidade são delimitados da seguinte forma:
  - Nível 0 – Incompleto: um processo é chamado de incompleto quando um ou mais objetivos da área de processo não estão em conformidade;
  - Nível 1 – Realizado: é chamado de feito ou realizado o processo que satisfaz todas as metas específicas da área de processo;
  - Nível 2 – Manejado (produzido): é designado processo de gestão quando o projeto apresenta a infraestrutura para suportá-lo. O processo é planejado e executado de acordo com a política da empresa, envolvendo as partes interessadas, e emprega pessoas qualificadas que tenham recursos adequados para produzir saídas controladas. É monitorado, controlado, revisto e avaliado de acordo com sua descrição específica;
  - Nível 3 – Definido: é uma adaptação do conjunto de normas da organização, de acordo com as diretrizes da empresa, e fornece dispositivos, medidas e outras informações para melhorar os ativos da organização;
  - Nível 4 – Manejado (gerenciado) quantitativamente: é controlado usando-se técnicas quantitativas estatísticas e outras. Metas quantitativas para a qualidade e o desempenho do processo são estabelecidas e utilizadas como critérios para sua gestão;
  - Nível 5 – Otimizado: otimização é a melhoria contínua do processo, com base no entendimento de causas comuns de variação de processo. Esse processo é realizado por meio de perfeiçoamentos incrementais e usando-se a inovação tecnológica.

### Métricas de qualidade de software

#### Resumo dos fatores que afetam a qualidade

- Marshall Jr. et al. (2012), define um conjunto de fatores de qualidade que avaliam o software sob três pontos de vista diferentes:
  - operação do produto (usá-lo);
  - revisão do produto (alterando-o);
  - transição do produto (modificando-o para trabalhar em um ambiente diferente).

#### Medida de qualidade

- Segundo Marshall Jr. et al. (2012), as medidas de qualidade que fornecem indicadores úteis para a equipe do projeto, são:
  - Exatidão: é o grau em que o software executa a sua função;
  - Manutenção: é a facilidade com que um programa pode ser corrigido se um erro de sistema, seja de código ou de requisitos, for encontrado;
  - Integridade: mede a capacidade de um sistema para resistir a ataques (acidentais e intencionais) à sua segurança. Os ataques podem ser executados em qualquer um dos três componentes de software – programa, dados e documentos. Para medir a integridade, é preciso definir dois atributos adicionais: ameaça e segurança. Ameaça é a probabilidade de que um ataque dê certo em determinado momento. Já a segurança é a probabilidade que o sistema tem de repelir um ataque de certo tipo;
  - Facilidade de uso: é uma tentativa de quantificar o quão amigável pode ser o programa para o usuário.

#### Eliminação dos defeitos

- É o entendimento dos principais defeitos presentes nos projetos de software – como erros na gestão, prazos curtos, erros de código –, com o objetivo de avaliá-los e eliminá-los, de modo a garantir o controle de qualidade em todas as atividades do processo (MARSHALL JR. et al., 2012).

## Influência dos requisitos na qualidade do software

- Engenharia de requisitos é o processo de análise e verificação das necessidades de um cliente/usuário para o desenvolvimento de um sistema;
- O objetivo da engenharia de requisitos é entregar um software correto e completo, de acordo com especificações predeterminadas;
- Os requisitos são a peça fundamental para um projeto de desenvolvimento de software com qualidade, que exige planejamento e recursos;
- Os líderes do projeto utilizam os requisitos de base para estimar os recursos necessários à criação de um software.

### Processos de negócio

- Um processo de negócio consiste em um conjunto de tarefas ou atividades que são executadas de acordo com certas regras relacionadas a determinados objetivos. Trata-se de uma série de tarefas individuais, e cada uma delas é executada em uma ordem específica.

#### Requisitos de software

- De acordo com a definição do glossário do IEEE, os requisitos do software são (VASQUEZ; SIMÕES, 2016, p. 18):
  1. Uma condição ou capacidade do sistema, solicitada por um usuário, para resolver um problema ou atingir um objetivo;
  2. Uma condição ou capacidade que deve ser atendida por uma solução para satisfazer um contrato, especificação, padrão ou quaisquer outros documentos formais impostos;
  3. Documentação da representação das condições ou capacidades apresentadas nos dois itens anteriores;
  4. Uma condição ou capacidade que deve ser alcançada ou possuída por um sistema, produto, serviço, resultado ou componente para satisfazer um contrato, padrão, especificação ou outro documento formalmente imposto.
- Os requisitos devem apresentar uma série de características, tanto individualmente como em grupos. Estas são as características mais importantes dos requisitos de software (VALERIANO, 2005):
  - Necessário: um requisito deve ser necessário. A sua omissão causa uma deficiência no sistema, afetando a sua capacidade, suas características físicas. Quando o cliente/usuário aponta a necessidade de um requisito, é preciso verificar quão necessário ele realmente é ao software. Se for um elemento apenas estético, por exemplo, não se trata de um requisito;
  - Conciso: um requisito é conciso se é fácil de ler e compreender. A sua redação deve ser simples e clara para aqueles que vão consultá-lo, sejam os clientes ou outros desenvolvedores, no futuro. Um documento muito extenso acaba dificultando o processo, pois sua leitura e interpretação demandam mais tempo;
  - Completo: um requisito é completo quando não necessita de mais detalhes na sua formulação, ou seja, a informação disponibilizada é suficiente para sua compreensão e para o desenvolvimento do software;
  - Consistente: os dados apresentados devem ser confiáveis e seguros, possíveis de serem realizados e integrados de forma consistente, ou seja, um requisito não pode contradizer outro nem se propor a fazer a mesma coisa;
  - Inequívoco: os requisitos devem ser claros e não permitir mais de uma interpretação (não podem ser ambíguos), pois isso poderia acarretar diversos erros no sistema;
  - Verificável: um requisito é verificável quando ele é palpável, pode ser construído, testado, rastreado e homologado; não é apenas uma ideia que só pode existir no papel.

#### Engenharia de requisitos

- O processo de análise e levantamento das necessidades dos clientes é conhecido como parte integrante da engenharia de requisitos;
- O objetivo dessa área da engenharia de software é desenvolver e manter um sistema documentado de especificação de requisitos que contemple todas as informações necessárias, de forma concisa, clara e descritiva (VALERIANO, 2005);
- A engenharia de requisitos facilita a interação com o cliente/usuário em termos de identificar e entender o que ele necessita e na obtenção de um acordo acerca da solução que será entregue;
- O desenvolvimento dos requisitos geralmente passa pelas seguintes fases (MARSHALL JR. et al., 2012):
  - Análise de problemas: identificar stakeholders, obter concordância em relação ao problema que eles possuem, identificar fronteiras e restrições ao sistema e elaborar o documento de visão;
  - Avaliação e negociação: processo de avaliação e negociação de melhorias com o cliente ou stakeholder;
  - Especificação: processo que tem como objetivo obter produtos de software de melhor qualidade, que satisfaçam às reais necessidades dos clientes dentro de prazo e orçamento adequados;
  - Validação: processo que tem como objetivo a validação da consistência e do contexto dos requisitos levantados no processo de identificação;
  - Evolução: processo em que se compreende a situação inicial do problema, os requisitos iniciais, o entendimento do problema modificado e os requisitos que são alterados ao longo do tempo do projeto;
  - Princípios de especificação: processo de representação dos requisitos do cliente, especificando a funcionalidade da implementação, identificando o comportamento desejado do sistema e o modo pelo qual outros componentes do sistema interagem com o software.
- Essas fases não seguem com rigor essa ordem e uma mesma fase pode se repetir algumas vezes durante o projeto, mas todas estão presentes quando se trata de desenvolvimento de requisitos de software.

### Os requisitos e a comunicação

- As necessidades dos clientes evoluem com o tempo, e toda mudança envolve um custo. Por isso é necessário ter uma cópia da documentação do sistema original e de cada revisão ou alterações feitas nesse documento;
- Como todas as necessidades são tratadas de forma diferente, é necessário classificá-las para saber qual delas vai ser satisfeita pelo software ou algum outro produto do sistema (PFLEEGER, 2004);
- A especificação de requisitos de software é a atividade em que o documento é gerado com um nome específico, contendo uma descrição completa das necessidades e capacidades do sistema que será desenvolvido. Esse documento descreve o escopo do sistema e como serão suas funções, como, por exemplo, definir os requisitos funcionais e não funcionais (PRESSMAN; MAXIM, 2016).

#### Especificação de requisitos

- Segundo Vasquez e Simões (2016, p. 18), "a especificação de requisitos é um contrato entre
  clientes e equipe de desenvolvimento. Ela deve esclarecer aos clientes o que será entregue como
  produto do trabalho da equipe de desenvolvimento";
- Com base na especificação, os clientes/usuários devem ser capazes de entender o projeto e apontar falhas nele para que sejam corrigidas imediatamente, antes que o produto comece a ser produzido com defeitos;
- São objetivos da especificação de requisitos (VASQUEZ; SIMÕES, 2016):
  - Documentar de forma correta e fidedigna todas as necessidades do cliente/usuário;
  - Obter aprovação (aceite) sobre tudo o que está sendo proposto para se entregar em termos de produto;
  - Ajudar a equipe de desenvolvimento a compreender exatamente o que os clientes/usuários desejam;
  - Servir de base para o trabalho de manutenção futura no sistema.
- Segundo Vasquez e Simões (2016), uma especificação de requisitos geralmente apresenta:
  - Visão geral: em que se apresenta os objetivos do projeto, as partes interessadas e o escopo preliminar com as funções descritas brevemente;
  - Glossário: definição dos termos técnicos e de siglas usados no documento;
  - Modelos de sistema: em que se mostra o relacionamento entre os componentes do sistema;
  - Lista de requisitos funcionais: em que se descreve as tarefas executadas pelo sistema e as interfaces externas do software;
  - Lista de requisitos não funcionais: em que se descreve as restrições impostas sobre o software, relacionando-as aos requisitos funcionais;
  - Especificação detalhada de requisitos: detalhamento dos requisitos funcionais.
- É importante reforçar que a especificação de requisitos é o resultado final das atividades de análise e avaliação de requisitos; desse modo, o documento resultante será usado como fonte básica de comunicação entre clientes, usuários finais, analistas de sistemas, testadores e todos os envolvidos na implementação do sistema (PFLEEGER, 2004).

#### Dificuldades na definição de requisitos

- Segundo Pressman e Maxim (2016), entre as dificuldades na definição de requisitos, estão:
  - Suas exigências não são óbvias e podem vir de várias fontes;
  - Os requisitos são difíceis de expressar em palavras (a linguagem é ambígua);
  - Não são muitos os tipos de requisitos e há diferentes níveis de detalhe;
  - O número de requisitos em um projeto pode ser difícil de manusear;
  - E eles nunca são iguais – alguns são mais difíceis, mais arriscados, mais importantes ou mais estáveis do que outros.
- Existem, ainda, dificuldades para quantificá-los, uma vez que cada conjunto de requisitos é específico para cada projeto, e cada requisito tem propriedades únicas que incluem áreas funcionais específicas;
- Um requisito pode mudar ao longo do ciclo de desenvolvimento, sendo necessário rever o projeto como um todo, devido à integração de requisitos;
- Também há os requisitos que estão na expectativa do usuário, porém não estão documentados. Esses requisitos são chamados de _requisitos implícitos_ , são totalmente indesejados, porém podem ser minimizados por meio de uma boa especificação – ou seja, detalhando-se bem os requisitos explícitos e normativos (VALERIANO, 2005).

### Qualidade de requisitos de software

- A ISO 9001:2008 especifica requisitos para um sistema de gestão da qualidade, quando uma organização (CYBIS et al., 2015):
  a. Precisa demonstrar sua capacidade de fornecer de forma consistente produtos que atendam aos requisitos do cliente e requisitos regulamentares aplicáveis;
  b. Pretende aumentar a satisfação do cliente por meio da aplicação eficaz do sistema, incluindo processos para sua melhoria contínua e a garantia de conformidade com os requisitos do cliente;
- Os requisitos são o primeiro passo para se atingir a qualidade e serão avaliados durante os testes, nos quais é possível verificar se estão sendo atendidos ou não;
- Embora a qualidade possa ser avaliada durante a fase de testes, é um equívoco concentrar os esforços para obtenção da qualidade apenas nessa fase do projeto, tendo em vista que a qualidade deve percorrer todas as etapas de desenvolvimento. Se isso não for feito desde o início, os erros tendem a migrar de uma etapa para a outra, onerando todo o processo;
- Garantia da qualidade de software em todo o ciclo de desenvolvimento:
  - Modelo de negócios;
  - Requisitos;
  - Análise e modelagem;
  - Implementação;
  - Testes de software;
  - Disponibilização.

#### Requisitos de qualidade

- Definir com precisão os requisitos de um software permite que todos os recursos da empresa e a energia da equipe de desenvolvimento sejam direcionados a um fim claro. Sem uma definição precisa daquilo que se pretende construir, perde-se tempo, mais erros são cometidos e a qualidade do produto final é incerta. (KOSCIANSKI; SOARES, 2007, p. 172);
- Os requisitos de qualidade de software, segundo Wazlawick (2013), devem fazer parte da própria especificação do produto;
- A qualidade também tem um custo, e o investimento compensa quando ela baixa os custos com falhas. Isso não significa que a qualidade deixará de ser uma meta em todas as etapas do processo, mas é preciso considerar que existem níveis de qualidade e que qualidade não é sinônimo de perfeição, mas de algo que atende às necessidades do cliente/usuário de forma satisfatória.

## Processo de desenvolvimento de software

- Desenvolvimento de software contempla todo o processo de programação de computadores, documentação, testes, correção de bugs e de erros envolvidos na criação e na manutenção de aplicativos e estruturas, resultando em um produto de software, que deve seguir as especificações documentadas;
- Esse processo pode incluir pesquisa, desenvolvimento, prototipagem, modificação, reutilização, reengenharia, manutenção e demais atividades que resultem na produção do software.

### Ciclo de desenvolvimento de software

- O desenvolvimento de software, também chamado de ciclo de vida de desenvolvimento de software, é aplicado especificamente para produtos de estrutura de software (WEBER, 2006);
- O ciclo de desenvolvimento apresentado por Yourdon (1989 apud REZENDE, 2005, p. 42) é dividido em etapas, a fim de projetar e desenvolver um produto de software de forma eficiente;
  - Estudo de viabilidade: identifica as deficiências atuais, estabelece objetivos do novo sistema; gera cenários aceitáveis; prepara encargos de projeto;
  - Análise de sistemas: desenvolve o modelo ambiental; desenvolve o modelo comportamental; estabelece os limites homem-máquina; executa a análise custo-benefício; seleciona opção; restringe o sistema; faz a especificação do pacote;
  - Projeto: aloca especificações para os processadores; aloca especificações às tarefas; deriva o diagrama estrutural; avalia o diagrama estrutural; projeta módulos; projeta banco de dados; faz o empacotamento do projeto;
  - Implementação: soluciona o próximo módulo; codifica o módulo; testa o esqueleto do sistema;
  - Geração do teste do aceite: gera plano de teste; prepara testes de performance; prepara testes de vias normais; prepara testes de vias de erro; empacota os testes;
  - Garantia da qualidade: faz o teste final ou teste de aceite, comparando o produto ao projeto de implementação;
  - Descrição dos procedimentos: faz descrições das atividades operacionais do cliente ou usuário;
  - Conversão de banco de dados: pode envolver mais trabalho e planejamento do que desenvolvimento de programas para o novo sistema e, em outros casos, pode não haver uma base de dados para ser convertida;
  - Instalação: atividade final; suas entradas são o manual do usuário, o banco de dados convertido e o sistema de aceite.

#### Codifica-remenda ou codificar-e-corrigir

- Segundo Schach (2010), infelizmente, ainda muitos produtos são desenvolvidos seguindo esse ciclo de vida. É o modelo menos profissional de todos, em que o software vai sendo desenvolvido sem que haja um projeto nem o levantamento das necessidades do cliente/usuário e das especificações;
- Nesse modelo, a equipe de desenvolvimento faz o software da forma como acredita que deve ser feito e depois o retrabalha quantas vezes forem necessárias até que o cliente fique satisfeito (SHACH, 2010);
- Ainda segundo Shach (2010), esse ciclo de vida até pode vir a funcionar bem em programas menores e mais simples, mas é inviável para programas maiores, pois seu custo e seu tempo de desenvolvimento aumentam consideravelmente, além de exaurir a equipe e o cliente em testes sem fim.

#### Cascata

- Esse modelo de ciclo de vida, também chamado de clássico ou linear, foi proposto por Winston Royce, no ano de 1970. É um ciclo de vida que eventualmente suporta iterações; contudo, basicamente é um modelo pouco flexível, com muitas restrições. Isso porque se caracteriza por progredir de forma sequencial entre uma fase e a seguinte, e essa sequencialidade acaba causando diversos problemas ao desenvolvimento do software e afetando sua qualidade;
- O modelo de ciclo de vida cascata tem a vantagem de possuir pontos de controle que permitem demarcar as fases do processo, facilitando a gestão do projeto e a manutenção do software depois de pronto, devido ao controle da documentação;
- Porém, ele é rígido e burocrático, porque não permite a correção de erros nas fases anteriores e possui baixa visibilidade para o cliente, pois este não recebe feedback nos pontos de controle existentes; assim, o único resultado que o cliente vê é o final;
- Exemplo de passos do modelo cascata:
  1. Requerimentos: etapa na qual se estabelecem os requisitos do produto que se deseja desenvolver, os serviços a serem fornecidos, limitações e objetivos do software. Essa etapa pode ser vista como a etapa de concepção de um produto ou software;
  2. Desenvolvimento: é o processo de passos do projeto que representa os requisitos de uma forma que permita a codificação do produto. É o projeto documentado para que se transforme em software;
  3. Implementação: é a etapa em que são criados os programas;
  4. Verificação: é a etapa de testes do sistema. Após a codificação concluída, começa a fase de testes e verificação do sistema. Essa fase examina se foram solucionados os erros de software e assegura que as entradas produzam resultados reais conforme os requisitos que foram descritos;
  5. Produção: etapa de aprovação para que o sistema entre em produção; para isso, todas as fases e testes devem ter sido realizados e a coleta de aprovações dos usuários e envolvidos no projeto deve ser feita para se colocar o sistema em produção.

#### Modelo V

- Esse modelo de ciclo de vida foi concebido por Alan Davis e contém as mesmas etapas do ciclo de vida em cascata, sendo considerado uma variação deste;
- Exemplo de passos do modelo V:
  1. Modelagem de requisitos;
  2. Projeto da arquitetura;
  3. Projeto de componente;
  4. Geração de código;
  5. Teste de unidade;
  6. Teste de integração;
  7. Teste de sistema;
  8. Teste de aceitação.
- O projeto segue de forma sequencial e linear até a geração de códigos (até o passo 4) e, a partir daí, a equipe passa para o outro lado do V (passo 5 am diante), realizando testes que validam cada fase do lado esquerdo. Segundo Pressman e Maxim (2016, p. 42), “não há nenhuma diferença fundamental entre o ciclo de vida clássico e o modelo V”.

#### Espiral

- Modelo de ciclo de vida em que um produto é desenvolvido em diversas iterações. Uma iteração nova representa uma volta na espiral. Sua vantagem é que permite a construção de produtos com prazos curtos e a sua desvantagem é que ele é mais difícil de ser gerido (WAZLAWICK, 2003);
- No modelo em espiral, as atividades são realizadas no sentido horário, partindo do centro da espiral e passando por quatro quadrantes:
  1. A fase 1 corresponde à determinação dos objetivos e soluções alternativas, além das restrições do sistema;
  2. Na fase 2, devem ser analisados os riscos das decisões da fase anterior, quando podem ser construídos protótipos e realizadas simulações do software;
  3. Na fase 3, de desenvolvimento de testes, estão as atividades de desenvolvimento, incluindo design, especificação, codificação e verificação. A principal característica dessa fase é que cada especificação vai ressurgindo a cada ciclo – especificação de requisitos, do software, da arquitetura, da interface de usuário e algoritmos, devendo ser feita a verificação correta;
  4. Na fase 4, de planejar a próxima iteração, estão as revisões das etapas anteriores e o planejamento da próxima fase. Nessa etapa, dependendo dos resultados obtidos nas fases anteriores, pode-se optar por seguir o desenvolvimento no modelo cascata, por exemplo, ou optar pela construção de novos protótipos.

#### Prototipagem evolutiva

- Também chamada de prototipação, utiliza o modelo de ciclo de vida em espiral para construir o produto em protótipos, que cobrem progressivamente os requisitos até a finalização do produto;
- Sua vantagem é que possui visibilidade, permitindo a verificação antecipada do produto final e a correção dos problemas detectados;
- Apresenta alta flexibilidade, por permitir ajustes durante o desenvolvimento do produto;
- Como desvantagens, esse método precisa de equipes disciplinadas e experientes, o projeto deve ser bem realizado para que a estrutura do produto permaneça confiável ao longo dos protótipos e ele é mais difícil de ser gerido (WAZLAWICK, 2003).
- Passos do modelo prototipagem evolutiva:
  1. Comunicação;
  2. Planejamento rápido;
  3. Modelagem projeto rápido;
  4. Construção do protótipo;
  5. Entrega e feedback.
- Segundo Pressman e Maxim (2016), esse modelo funciona bem quando o cliente não tem claros os requisitos e os detalhes do software de que necessita.

#### Entrega evolutiva

- Esse modelo de ciclo de vida é uma combinação dos modelos cascata e prototipagem evolutiva;
- Apresenta a vantagem de ter alta visibilidade para os clientes e facilidade de gestão, por possuir pontos de controle bem definidos;
- Sua desvantagem é a necessidade de um projeto robusto para que a estrutura do produto permaneça confiável ao longo das liberações programadas (CYBIS et al., 2015);
- O objetivo da entrega evolutiva é obter o máximo de feedback do cliente sobre o que foi entregue, de modo que a próxima entrega seja planejada de acordo com esse feedback recebido, garantindo mais agilidade e qualidade ao produto;
- Segue-se o mesmo ciclo da prototipagem evolutiva, com a diferença que as entregas referem-se a partes do software ou sistema.

### Garantia da qualidade do software

- A garantia de qualidade do software é obtida por meio de processos de engenharia de software de monitorização e aplicação de métodos de qualidade, que ocorrem por meio de intervenções da gestão de qualidade no sistema de software que está sendo criado. Essas intervenções são apoiadas por uma ou mais normas, geralmente a ISO 9000 (WAZLAWICK, 2003);
- Qualidade é sinônimo de eficiência, flexibilidade, precisão, confiabilidade, facilidade de manutenção, portabilidade, usabilidade, segurança e integridade;
- A qualidade do software é, portanto, mensurável e varia de um sistema para outro ou de um programa para outro;
- Como afirma Valeriano (2005, p. 88), “a qualidade do software é o grau em que um sistema, componente ou processo atende aos requisitos especificados e às necessidades e expectativas do cliente ou do usuário”;
- O Software Quality Assurance, ou SQA, é um conjunto de atividades sistemáticas e planejadas para garantir que os processos de software e produtos cumpram com os requisitos, as normas e os procedimentos de processo de produtos, design de software, documentação de codificação, suporte de teste e manutenção (SOMMERVILLE, 2011);
- Com o SQA, a qualidade não é apenas responsabilidade da equipe de desenvolvimento do projeto, mas é medida por uma série de testes de qualidade. Esses testes foram inicialmente desenvolvidos pela indústria militar durante a década de 1970, nos Estados Unidos, e foram se difundindo e aprimorando até se tornar o SQA (PRESSMAN; MAXIM, 2016);
- O processo de verificar se as normas estão sendo aplicadas corretamente pode ser feito pela equipe de desenvolvimento, no caso de pequenos projetos, mas, nos grandes projetos, um grupo específico deve se dedicar a essa função (ISNARD, 2012).

#### Vantagens do SQA

- Um plano SQA pode tomar uma série de caminhos, testando-se diferentes capacidades e análises de execução, dependendo das exigências do projeto, dos usuários e do software;
- Sobre a metodologia do SQA, ressalta-se que o teste de software é considerado uma arte e uma ciência que requer a adoção de aplicações complexas para o desenvolvimento de diferentes sistemas operacionais;
- Várias aplicações de software requerem diferentes abordagens quando estão na fase de teste, mas algumas das tarefas mais comuns de controle de qualidade incluem os passos a seguir:
  - Validação do teste: o teste de validação é realizado para checar se há algum erro;
  - Comparação: compara a saída de um uso específico com um sistema de dados previamente criado com os mesmos parâmetros;
  - Testes de usabilidade: usuários que não estão familiarizados com o software fornecem feedback para os desenvolvedores sobre o que eles acharam difícil de fazer. Essa é a melhor forma de realizar melhorias em uma interface.
- A ISO/IEC 9126 define as características principais da qualidade do produto da seguinte maneira (PFLEEGER, 2004):
  - Funcionalidade: trata-se de um conjunto de atributos que evidenciam a existência de funções e suas propriedades especificadas. As funções devem satisfazer as necessidades explícitas e implícitas para que o software seja considerado funcional;
  - Usabilidade: refere-se ao conjunto de atributos que evidenciam o esforço necessário para se poder usar o software, assim como o julgamento individual desse uso, por um conjunto explícito ou implícito de usuários. Nesse sentido, o software apresenta usabilidade se faz com que o usuário tenha sucesso na execução das tarefas propostas pelo sistema;
  - Confiabilidade: é o conjunto de atributos que evidenciam a capacidade do software de manter seu nível de desempenho, sem que ocorram falhas ou interrupções, sob condições estabelecidas durante certo período de tempo;
  - Eficiência: trata-se de um conjunto de atributos que evidenciam o relacionamento entre o nível de desempenho do software e a quantidade de recursos usados, sob condições estabelecidas. Um software é eficiente quando atende seu objetivo sem ser complicado, de forma simples e objetiva;
  - Manutenibilidade: é o conjunto de atributos que evidenciam o esforço necessário para fazer modificações especificadas no software. Ele deve possibilitar correções e alterações sempre que for preciso, mesmo depois de entregue ao cliente;
  - Portabilidade: diz respeito ao conjunto de atributos que evidenciam a capacidade do software de ser transferido de um ambiente para outro, sem haver a necessidade de criação de um programa semelhante para ser usado em outra plataforma.

### Métodos ágeis, validações e indicadores

#### Métodos ágeis

- O desenvolvimento ágil de software envolve uma abordagem para a tomada de decisões em projetos da área, a qual se refere a métodos de engenharia de software;
- Essa abordagem diz respeito a um grupo de metodologias utilizadas na criação de programas que baseia o seu desenvolvimento em um ciclo iterativo, no qual os requisitos e as soluções evoluem
  por meio da colaboração entre diferentes equipes envolvidas no projeto;
- O trabalho é feito por colaboração, sendo auto-organizado por equipes multidisciplinares, envolvidas em um processo de tomada de decisão compartilhada no curto prazo (PFLEEGER, 2004);
- A metodologia ágil engloba, segundo Sommerville (2011):
  - Valorização das pessoas e suas interações sobre processos e ferramentas – processos de qualidade com bons relacionamentos trazem bons resultados;
  - Avaliação da documentação: a documentação é necessária porque permite a transferência de conhecimento, mas sua redação deve ser limitada ao que contribui ao valor direto do produto/serviço;
  - Taxa de colaboração com o cliente sobre negociação de contrato – embora sejam necessários, os contratos não acrescentam valor aos produtos/serviços. Metodologias ágeis ao cliente integram e mantêm o projeto com o objetivo de proporcionar o maior valor possível em cada iteração;
- As características básicas de projetos geridos com metodologias ágeis são as seguintes (SOMMERVILLE, 2011):
  - Incerteza: indica a necessidade estratégica da previsão de riscos no desenvolvimento;
  - Equipes auto-organizadas: não existem funções especializadas na equipe;
  - Autonomia: liberdade para a tomada de decisão;
  - Autoaperfeiçoamento: periodicamente, o produto tem de ser desenvolvido e avaliado;
  - Autoenriquecimento: conhecimento e transferência de conhecimento;
  - Fases de desenvolvimento que se sobrepõem: as fases não existem como tal, mas as tarefas/atividades são realizadas de acordo com a evolução das necessidades ao longo do projeto. Na verdade, muitas vezes não é possível fazer um projeto técnico detalhado antes de se começar a desenvolvê-lo e ver alguns resultados. Além disso, as fases tradicionais, realizadas por pessoas diferentes, não promovem o trabalho em equipe e podem gerar mais desvantagens do que vantagens (por exemplo, um atraso de fase afeta todo o projeto);
  - Controle sutil: pontos de controle local para monitorar adequadamente sem limitar a liberdade e a criatividade da equipe.

###### Scrum

- O Scrum é uma metodologia cujas práticas são aplicadas em um processo iterativo e incremental;
- Assume-se que os projetos em que o Scrum se insere são complexos e imprevisíveis, no quais não é possível prever tudo que irá acontecer. Por essa razão, ele oferece um conjunto de práticas que torna tudo isso visível (SCHWABER, 2004), como um ciclo de vida específico;
- A estrutura de processo do Scrum inicia-se com uma visão do produto que será desenvolvido, com a apresentação das características definidas pelo cliente, das premissas e restrições;
- Em seguida, é criado o product backlog, a lista contendo todos os requisitos conhecidos do produto;
- O product backlog é então priorizado e dividido em releases, e cada um deles contém um conjunto de requisitos, denominado sprint backlog, que será desenvolvido em uma iteração, chamada de Sprint (MARÇAL et al., 2007);
- Na execução do Sprint, diariamente a equipe faz reuniões de 15 minutos (Daily Scrum Meeting) para acompanhar o andamento do projeto;
- Ao final do Sprint, é realizado o Sprint Review Meeting, de modo que o time apresente o resultado alcançado ao Product Owner (representante do cliente);
- Em seguida, o Scrum Master, o gestor do projeto, conduz o Sprint Retrospective Meeting, com o objetivo de melhorar a equipe, o processo ou o produto para o próximo Sprint.

#### Validações e indicadores

- Para a determinação da qualidade do software a partir da perspectiva de produto acabado, é necessária a avaliação de um conjunto de indicadores que respondam a diferentes critérios e fatores consistentes com a estrutura da ISO 9126;
- Uma vez que o processo de avaliação foi concluído, de acordo com diferentes fatores e critérios, os principais indicadores da qualidade do software podem ser elencados como descrito a seguir (PFLEEGER, 2004):
  - A funcionalidade pode ser definida como o conjunto de critérios e indicadores correspondentes relacionados com as propriedades específicas que atendem às necessidades do cliente;
  - A confiabilidade é definida como um grupo de critérios e indicadores correspondentes relacionados com a capacidade de manter o seu nível de desempenho sob condições estabelecidas por um período determinado (SOMMERVILLE, 2011);
  - A usabilidade é o conjunto de critérios e indicadores relacionados com o esforço necessário para o uso do software e a avaliação individual de tal utilização, por um grupo declarado ou implícito de usuários;
  - Por fim, a eficiência é definida como um conjunto de critérios e indicadores correspondentes que dizem respeito ao desempenho da quantidade de recursos necessários sob condições estabelecidas (SOMMERVILLE, 2011).

## Gerência da qualidade de software

- A gerência da qualidade do software garante que o nível de qualidade exigido pelo cliente seja alcançado por meio de melhorias no processo de desenvolvimento do produto;
- Um gerenciamento de qualidade de software inclui o Software Quality Assurance (SQA), ou Garantia de Qualidade de Software, que visa desenvolver procedimentos e padrões em nível organizacional.

### Dimensões da qualidade do processo e do produto

#### Dimensões da qualidade do processo

- Segundo Parasuraman, Zeithaml e Berry (2005), são cinco as dimensões que avaliam a qualidade no desenvolvimento de serviços:
  1. Tangibilidade, entendida como a aparência das instalações físicas, dos equipamentos e do material de comunicação;
  2. Confiabilidade, que é a capacidade de executar o serviço prometido com precisão e formalidade. No que se refere a essa dimensão, Boulding et al. (1993) argumentam que, embora a qualidade do serviço seja multidimensional, a confiabilidade é fundamental na determinação global da qualidade percebida do serviço. Ou seja, no modelo dinâmico de qualidade de serviço, a confiabilidade é o principal manipulador da percepção geral de serviço ao cliente;
  3. Sensibilidade, definida como a vontade de ajudar os clientes e fornecer um serviço rapidamente. Sobre essa dimensão, Parasuraman, Zeithaml e Berry (2005) relatam que ter sensibilidade significa servir os clientes de forma ágil e responder rapidamente às suas solicitações ou reclamações. Outro aspecto da sensibilidade diz respeito à pontualidade no serviço de campo e ao tempo de reparação técnica;
  4. Garantia, que compreende o conhecimento e a cortesia dos funcionários e sua capacidade de inspirar confiança;
  5. Empatia, que envolve os cuidados e o atendimento individualizado que a empresa oferece aos seus clientes.

#### Dimensões da qualidade segundo Garvin

- Desempenho: refere-se às principais características operacionais de um produto ou serviço. Essa dimensão de qualidade abrange atributos mensuráveis, de modo que as empresas geralmente podem ser classificadas objetivamente em aspectos individuais de desempenho;
- Recursos: são as características adicionais que realçam o apelo do produto ou serviço ao usuário. Pensamento semelhante pode ser aplicado às características, que muitas vezes são um aspecto secundário do desempenho (GARVIN, 2015);
- Confiabilidade: é a probabilidade de um produto não falhar em um período de tempo específico, sendo um elemento-chave para os usuários que precisam dele. Entre as medidas mais comuns de confiabilidade estão: o tempo médio até a primeira falha, o tempo médio entre falhas e a taxa de falha por unidade de tempo;
- Conformidade: é a precisão com que o produto ou serviço atende aos padrões especificados. A dimensão da conformidade descreve até que ponto o projeto de um produto e suas características
  operacionais atendem aos padrões estabelecidos e se tais características se devem mais a abordagens tradicionais do que a qualidades pioneiras;
- Durabilidade: mede a duração da vida de um produto. Quando o produto pode ser reparado, estimar sua durabilidade é mais complicado, pois o item será usado até que não seja mais economicamente viável operá-lo. Isso acontece quando a taxa de reparo e os custos associados aumentam significativamente;
- Atendimento: essa dimensão diz respeito aos fatores do produto ou serviço que podem afetar a percepção do cliente;
- Estética: é a dimensão subjetiva que indica a impressão que o usuário tem em relação a um produto. As propriedades estéticas de um produto contribuem para a identidade de uma empresa ou marca, e falhas ou defeitos que o diminuem, mesmo quando não reduzem ou alteram outras dimensões de qualidade, são muitas vezes causa de rejeição;
- Qualidade percebida: é a qualidade atribuída a um bem ou serviço baseada em medidas indiretas. A percepção nem sempre reflete a realidade, pois os consumidores muitas vezes possuem informações incompletas sobre os atributos de um produto/serviço.

### Planejamento e controle da qualidade do software

- O planejamento e o controle da qualidade do software surgem da necessidade de se produzir um produto de alta qualidade, e isso implica a garantia de proteção de software ao longo de todo o seu processo de engenharia;
- O controle de qualidade abrange uma série de avaliações e testes utilizados para todo o ciclo de desenvolvimento de produto, a fim de garantir que cada software atenda aos requisitos que lhe foram atribuídos.

#### Detecção e controle de erros

- O principal objetivo das revisões técnicas formais é encontrar erros durante o processo de desenvolvimento do software, impedindo que eles se propaguem em etapas posteriores e que se tornem defeitos após a entrega do produto;
- Estudos indicam que as atividades de design introduzem entre 50% e 65% de todos os erros (e, finalmente, todos os defeitos) durante o desenvolvimento do software. No entanto, as inspeções dessas atividades são eficazes em 75% dos casos (SOMMERVILLE, 2011);
- De acordo com Cybis et al. (2015), um processo de inspeção adequado consiste de seis passos:
  1. Planejamento: quando o desenvolvedor conclui um “produto de trabalho”, uma equipe de inspeção é formada e um moderador é designado. O moderador assegura que o produto de trabalho satisfaça os critérios de inspeção. Ele atribui papéis diferentes para os membros da equipe de inspeção, bem como estabelece o tempo de planejamento e os recursos;
  2. Resumo: se os inspetores não estão familiarizados com o projeto de desenvolvimento, é necessário dar a eles uma visão geral do processo. Esse é um passo opcional, mas não menos importante, porque nessa fase será dado aos inspetores o contexto a ser coberto por meio das inspeções;
  3. Preparação: os inspetores são preparados individualmente para avaliação na reunião, estudando os produtos de trabalho e materiais relacionados. Nessa fase, é aconselhável a utilização de listas de verificação para ajudar a encontrar defeitos comuns;
  4. Comentário: nessa fase, os inspetores se reúnem para discutirem juntos cada trabalho individual. O moderador deve assegurar que todos estejam suficientemente preparados. A pessoa designada como leitor apresenta o "produto do trabalho", interpretando-o, enquanto cada participante se atenta para possíveis defeitos. Após a conclusão da reunião, o grupo determina se o produto será aceito ou se deve ser reformulado para inspeção posterior;
  5. Retrabalho: o desenvolvedor corrige todos os defeitos encontrados pelos inspetores;
  6. Follow-up (acompanhamento): o moderador verifica as correções feitas pelo desenvolvedor. Se o moderador está satisfeito, a inspeção é formalmente completa e o “produto de trabalho” é colocado sob controle de configuração.
- Para cumprir essas seis etapas, surge a necessidade do estabelecimento dos objetivos da inspeção, dos participantes e de que papéis eles terão, dos produtos de trabalho a serem inspecionados e do que deve ser o resultado das reuniões de inspeção (CYBIS et al., 2015):
  - Objetivos: o objetivo principal é encontrar defeitos no "produto de trabalho", e, para isso, é preciso definir quais serão as metas a serem alcançadas. O estabelecimento dessas metas está diretamente relacionado com o tipo de projeto, as metodologias e os instrumentos utilizados;
  - Grupos de inspeção: é recomendado que se formem grupos de três a seis indivíduos (IEEE, 1997), incluindo neles o autor/desenvolvedor dos produtos de trabalho;
  - Funções: além do autor, devem ser definidos: o moderador, que liderará a inspeção e que deve ter mais experiência do que o resto do grupo; o leitor, que apresenta os produtos de trabalho nas reuniões; e o escriba, que documenta a descrição e a localização dos defeitos encontrados;
  - Os produtos funcionam: o processo de inspeção pode ser aplicado a diferentes tipos de produtos de trabalho encontrados em um desenvolvimento de software, incluindo requisitos, projeto, código, testes, guia de usuário e outras documentações. O padrão IEEE – Práticas Recomendadas para Especificação de Requisitos de Software (IEEE, 1998) – não especifica um tamanho, mas os produtos de trabalho têm, normalmente, 10 a 20 folhas de especificação de requisitos, com 200 ou 250 linhas de código cada;
  - Resultado de reuniões de inspeção: os dois principais resultados devem ser a lista de defeitos a serem corrigidos e um relatório de inspeção, que descreve o que foi inspecionado, quem inspecionou e o número de defeitos encontrados.

### Gerência dos testes de software

- A gerência de testes do software segundo (PRESSMAN; MAXIM, 2016), que pode ser entendida como "um conjunto de atividades de apoio que permite a absorção ordenada das mudanças inerentes ao desenvolvimento de software, mantendo a integridade e a estabilidade durante a evolução do projeto" (ARANTES; FIDELIS; AZEVEDO, 2017, p. 1);
- As atividades da gestão de testes de software envolvem (CYBIS et al., 2015):
  - Controlar e acompanhar mudanças (controle de mudança);
  - Registrar a evolução do projeto (controle de versão);
  - Estabelecer a integridade do sistema (integração contínua).
- Tipos de testes:
  - Teste de funcionalidade: nele são avaliados campos, navegação entre as telas, botões, links, interface e funcionalidade geral do sistema. Os requisitos iniciais solicitados pelo cliente devem ser testados e aprovados nesse teste;
  - Teste de desempenho: é avaliado o desempenho do sistema, se ele está atendendo aos requisitos preestabelecidos, e o tempo que cada aplicação demora para dar respostas a determinada ação;
  - Teste unitário: são avaliadas pequenas unidades de software, uma parte do código construído, como as rotinas, com o objetivo de verificar funções diferentes dentro do sistema;
  - Teste de bugs: é avaliada a existência de bugs, erros de programação e funcionamento do sistema, erros de construção de código ou da própria aplicação;
  - Teste de integração: nele são avaliados vários componentes do software, combinados e testados em grupo;
  - Teste operacional: nele é verificado se a aplicação responde ao tempo de execução do sistema;
  - Teste de regressão: é realizado logo após a alteração de um código e, assim, toda a aplicação deve ser testada novamente;
  - Teste de caixa branca: todas as entradas e saídas desejadas do sistema são testadas e é observado o resultado esperado;
  - Teste de configuração: nele se avalia se a aplicação funciona corretamente em diferentes configurações de hardware e software;
  - Teste de interface: é avaliada a navegabilidade e se cada componente responde conforme especificado pelo usuário;
  - Teste de carga: teste em que se avalia o funcionamento da aplicação com simulação de entrada de dados simultâneos em grande quantidade, verificando-se a resposta do sistema;
  - Teste de aprovação do usuário: nele o usuário realiza os testes operacionais e se sua aplicação é funcional;
  - Teste de estresse: caminhos diferentes de uso são avaliados, tentando simular um erro ou uma ação inesperada, submetendo o software a situações extremas.

## Fundamentos da interação homem-computador (IHC)

### Abordagens técnicas da IHC

- A IHC investiga e aborda todos os aspectos relacionados à concepção e à implementação de interfaces entre seres humanos e computadores;
- Disciplinas relacionadas à IHC:
  - Antropologia;
  - Ciência da computação;
  - Design;
  - Engenharia;
  - Ergonomia;
  - Filosofia;
  - Inteligência artificial;
  - Linguística;
  - Psicologia cognitiva;
  - Psicologia social e organizacional.

#### Evolução da IHC

- Estudos sobre IHC remontam ao ano de 1963, quando Ivan Sutherland criou um sistema para manipular objetos gráficos utilizando uma caneta, que permitia pegar objetos, mover e redimensioná-los. No mesmo ano, Elgerbart projetou o primeiro mouse. Em 1968, o MIT Lincoln Labs criou um modelo para interfaces incluindo janelas, menus, ícones, botões etc. Foi o prelúdio para as interfaces que hoje conhecemos, como as utilizadas na manipulação direta de dispositivos;
- Experiência do usuário _honeycomb_;
  - Acessibilidade: assim como os edifícios e calçadas são pensados para atender pessoas com deficiência (mais de 10% da população), os sites e softwares também devem ter essa preocupação, apresentando soluções que ampliem a acessibilidade das pessoas com deficiência, além de crianças e idosos;
  - Credibilidade: um dos pontos fortes do software é a reputação de ser confiável. Isso significa que ele deve funcionar perfeitamente, sem travar ou dar mensagens de erro;
  - Desejo: o usuário precisa sentir-se bem ao interagir com ele, por isso é importante cuidar da organização visual do software, buscando trabalhar em conjunto com webdesigners, para que a experiência do usuário seja gratificante;
  - Encontrabilidade: os conteúdos devem ser facilmente localizáveis para que o usuário encontre rapidamente o que precisa;
  - Usabilidade: a facilidade de uso é essencial, porém uma interface focada apenas na boa interação homem-computador não atende a todas as necessidades do usuário;
  - Utilidade: é importante ver o produto do ponto de vista do cliente/usuário, buscando verificar a real necessidade dele e se o software atende a essa necessidade;
  - Valor: o software deve dar um retorno real ao cliente/usuário, deve ser uma experiência marcante, que traga soluções e faça, efetivamente, a diferença.

#### Componentes básicos do sistema de IHC

- Segundo Weber (2012), os componentes básicos do sistema de IHC são:
  - Usuário: o ser humano tem uma capacidade limitada para processar informações (WEBER, 2012), e saber disso é muito importante na elaboração do design de um software;
  - Computador: os dispositivos computacionais utilizados podem afetar de diferentes maneiras o usuário. Os dispositivos permitem a inserção de texto, como no caso do teclado do computador, do tablet e do smartphone, seja um discurso oral ou um manuscrito, de desenho, seleções na tela com o mouse ou as mãos etc;
  - Diálogos: diálogos estão associados às formas com que os objetivos práticos dos usuários se efetivam nas interações com o sistema;
  - Objetos de interação: são objetos de software que geram imagens que devem ser apresentadas ao usuário com o qual haverá uma interação;
  - Sistemas de significados: A engenharia semiótica estuda a relação do design e da interação no processo comunicativo entre o designer (emissor da mensagem) e o usuário (receptor). Esse processo comunicativo entre designer e usuário faz parte do processo de design. A engenharia semiótica está presente no processo de design quando o designer busca adequar a mensagem por meio de signos que o usuário compreenda, ou seja, ele precisa “traduzir” a linguagem de programação em signos que fazem sentido para o usuário.
