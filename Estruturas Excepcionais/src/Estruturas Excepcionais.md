# Estruturas Excepcionais

Uma exceção nada mais é que um fluxo inesperado da minha aplicação, porém **não é um erro**
já que a aplicação continua a sua execução, já um erro crasha a aplicação, interrompendo
sua execução.

É responsabilidade do programador prever as exceções e fazer o chamado
**_tratamento de exceções_**.

## Try/Catch
Tratamento de exceções
E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução
**try**
, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.

A instrução
**catch**
, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução
**finally** (o uso desta é opicional)
, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares:

Estrutura de um bloco com try e catch:
```java
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
```

Exemplo no arquivo [AboutMe.java](AboutMe.java).

> [!IMPORTANT]
> Key information users need to know to achieve their goal.