## MANUAL/DOCUMENTAÇÃO DO EDIMILSON

**Edilmison** é uma linguagem de programação construída em JAVA e possui uma estrutura similar a "python, c...", seus caracteres de operações simples(+, -, /, *) são um exemplo.

Ela possui algumas limitações sendo que atualmente com a mesma conseguimos somente declarar variáveis, fazer operações matemáticas, escrever em tela e receber um valor pelo teclado, sendo que para declararmos variáveis e fazermos operações matemáticas é necessário deixarmos espaços em branco entre cada elemento, para que o interpretador consiga processar corretamente cada token.

A linguagem Edimilson também possui sua extensão própria, logo, os arquivos que serão interpretados devem obrigatoriamente serem ".edimilson", diferente disso o código mostrará uma mensagem de erro na extensão.
-------------------------------------------------------------------------------------------------------------------------------------

## Características:
 Declaração de variáveis;
● Atribuição de valor a variável;
● Expressões com no mínimo dois operandos, ex.: a + b;
● Operações de adição, subtração, divisão, multiplicação e resto (módulo);
● Laço;
● Comando de saída, ex.: mostrar algo na tela;
● Controlador de fluxo, ex.: if;

## Declaração de variável:
Para declararmos variáveis seguiremos a seguinte ordem: *var*(que representa o “tipo” da variável sendo que o mesmo não é fixo e pode assumir diferentes padrões como *double* ou *int*), *NomeDaVariavel* = (Atribuição) *ValorVariável*. É importante destacar que a variável deve ser inicializada com algum valor, mesmo que esse seja 0 e que deve obrigatoriamente ter os espaços entre cada comando além de que para declara valores com casas decimais, o separador é "." e não ",". 

Exemplo:

`edi NomeDaVariavel = Valor`.

## Lendo e imprimindo dados:
Para escrever na tela usaremos o comando: `print "O que você quiser"` sendo que as aspas delimitam 
o texto que será impresso. Para ler um valor do teclado usaremos: `input Variavel`, sendo que está Variavel deve ser declarada antes.

Exemplos:

Entrada:               |    Saída no console:
-----------------------|----------------------------------------
CC x = 10              |
print x                |    10
-----------------------|---------------------------------------
print "Qual seu nome?" |    Fulano
input x	               |    O que a pessoa digitar para o input

## Realizando operações matemáticas:
Para realizar as operações é necessário definir uma varíavel e atribuir as operações para ela, como por exemplo: `edi soma = 2 + 2`, sendo possível também fazer operações que envolvam somente a variavel, por exemplo:`edi x = 2`, `edi y= 1`, `edi soma = x + y`.

## Limitações e regras adicionais para uso da linguagem
É importante frisar que para essas operações funcionarem de forma correta, é necessário que **hajam espaços depois de cada sinal de atribuição, operação matemática, número ou nome de varável**.

-------------------------------------------------------------------------------------------------------------------------------------
