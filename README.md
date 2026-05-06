# Uma Abordagem Instrucional Teórica e Prática para os Testes Caixa Preta        

> Repositório direcionado para a análise dos casos de teste como atividade metodológica para a pesquisa "Uma Abordagem Instrucional Teórica e Prática para os Testes Caixa Preta".           

## 📋 Descrição e Objetivos         

A presente pesquisa investiga conceitos teóricos e práticos na aplicação das técnicas de teste de caixa preta, com objetivo de identificar falhas/erros e, assim, avaliar a eficácia das metodologias nas etapas de elaboração de programas para a garantia da qualidade. 

O teste de caixa preta visa detectar erros/falhas diante do funcionamento externo do programa. Nesse sentido, a relização do teste não determina a ausência de erros, mas sim, a existência deles. 

Assim, assegurar a qualidade do software irá depender além da expertise do testador, o dominio na realização das técnicas. Dessa forma, o estudo tem como intuito analisar e investigar técnicas de testes de caixa preta e a sua eficácia na detecção das falhas em um software.

Por fim, a pesquisa envolve a análise de diversas formas de técnicas de teste e medições dos seus níveis de eficácia. Estudar e análisar essas metodologias de testes visa o entendimento da capacidade de correções de erros, além de metrificar as técnicas e avaliá-las individualmente.

------------------------

## ✏️ Design Instrucional

O resultado da presente pesquisa fundamenta-se em 3 etapas, são elas:

- [x] Desenvolvimento dos Sistemas como Amostra
- [x] Análise das Especificações e Desenvolvimento dos Casos de Teste
- [x] Aplicação das Técnicas de Teste Caixa Preta

------------------------
## 🪲 Defeitos Injetados

 ## Sistema de Verificação de Senhas
 -  Não impõe limites mínimos e máximos para a inserção de caracteres
 -  Permite a inserção indevida de de espaços
 -  Pede a inserção de caracteres especiais, mas os limita durante a verificação
 -  Inconsistências durante a verificação {case-sensitive
 -  Permite a execução sem a validação dos dados de entrada
 -  Não contempla aspectos de usabilidade

 ## Sistema de Verificação de Palavras Palíndromas 
 - Não remove espaços durante a verificação 
 - Verificação case-sensitive, prejudicando a verificação
 - Não trata corretamente o uso de pontuação e acentuação
 - Permite a execução sem a validação dos dados de entrada

 ## Sistema de Reserva de Voos
 - Não há validação quanto aos endereços de origem e destino
 - Não há o tratamento correto para validação das datas
 - Problemas com o cálculo dos dias de viagem
 - Não verifica a inserção de caracteres indevidos 
 - Não há limite mínimo ou máximo de inserção de caracteres
 - Não contempla aspectos de usabilidade

 ## Sistema de Validação de E-mails
 - Não verifica a inserção de um TLD válido 
 - Aceita a inserção de caracteres especiais 
 - Não há limite mínimo ou máximo de inserção de caracteres
 - Não verifica a inserção de um domínio válido
 - Não contempla aspectos de usabilidade

 ## Sistema de Calculadora de Matrizes
 - A fórmula do cálculo de determinantes está incorretamente implementada
 - A utilização de variáveis do tipo float causam inconsistências nos cálculos
 - Permite a inserção de caracteres alfanuméricos, prejudicando o processamento
 - Não há limite mínimo ou máximo de números inseridos

 ## Sistema de Empréstimo de Livros
 - Não há o tratamento de exceções no menu
 - Não há validação quanto aos caracteres inseridos, aceitando até entradas vazias
 - Empréstimos podem ser realizados mesmo com o preenchimento incompleto 
 - Não há limite mínimo ou máximo de inserção de caracteres
 - A busca é case-sensitive

 ## Sistema de Agenda de Contatos 
 - Permite a inserção de contatos com dados idênticos 
 - Não há validação quanto a quantidade mínima ou máxima de carateres inseridos
 - A função de remoção pode comprometer a função de busca
 - A manipulação de arquivos está incorretamente implementada
 

------------------------
## 👨‍👧‍👧 Membros
Coordenador: Removido para revisão 
Membro: Removido para revisão 
Membro: Removido para revisão 
Membro: Removido para revisão

------------------------

## 🔗 Referências

- DELAMARO, M.; JINO, M.; MALDONADO, J. Introdução ao Teste de Software. [S.l.]: Elsevier Brasil, 2013.
- KHAN., M. E.; KHAN, F. A Comparative Study of White Box, Black Box and Grey Box Testing Techniques. [S.l.]: (IJACSA) International Journal of Advanced Computer Science and Applications, 2012.
- LEE., N. et al. Black-box testing of practical movie recommendation systems: A comparative study. [S.l.]: 5th International Conference on Collective Computational Intelligence (ICCCI), 2013.
- KANER, C.; FALK, J.; NGUYEN, H. Testing Computer Software. [S.l.]: Wiley, 2011.

