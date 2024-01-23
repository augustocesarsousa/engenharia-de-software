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
