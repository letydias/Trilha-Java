# Operadores ➕➖✖➗

`int modulo = 18 % 3;`
Módulo é o resto da divisão.

## Concatenação e Soma
> O Operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a concatenação dos textos.

 ```java
 //classe Operadores.java
String nomeCompleto = "LINGUAGEM" + "JAVA";
//Resultado: LINGUAGEMJAVA
 ```
> Se ao realizar uma soma, um dos elementos for uma String, nesse momento o programa vai começar a concatenar os próximos valores.
 ```java
// Qual o resultado das expressoes abaixo?
String concatenacao ="?";
concatenacao = 1+1+1+"1";
//Resultado:31
concatenacao = 1+"1"+1+1;
//Resultado:1111
concatenacao = 1+"1"+1+"1";
//Resultado:1111
concatenacao = "1"+1+1+1;
//Resultado:1111
concatenacao = "1"+(1+1+1);
//Resultado:13
 ```
## Operadores Unários

- (+) Operador Unário positivo;
- (-) Operador Unário negativo;
- (++) Operador Unário de incremento;
- (--) Operador Unário de decremento;
- (!) Operador Unário de negação;
- 
 ```java
int numero = 5;
numero++;
//'numero' agora é igual à 6.
 ```
## Operador Ternário ❔

**Símbolo:** (?:)

_expressão condicional_? _caso condição seja true_: <br>
_caso consição seja false_

 ```java
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";
//Ou
String resultado = (a==b) ? 1 : 0;
System.out.println(resultado);
 ```

## Operadores Relacionais 

(!=) Símbolo de Diferente

## Operadores Lógicos

- && Operador Lógico "E"
- || Operador Lógico "OU"