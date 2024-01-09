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
