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
