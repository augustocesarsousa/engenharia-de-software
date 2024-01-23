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
