# Java Documentation 📄

Para dominar propriamente a linguagem, é importante consultar a documentação 
da mesma com frequência, para que seus códigos sejam consistentes.

## Comentários
```Java
// Olá eu sou um comentário de uma linha

/** Olá,
 * eu sou um comentário
 * que pode ser 
 * mais elaborado e maior
 */
```
> [!WARNING]
> Um comentário, **não possui** a finalidade de amenizar um 
> algoritmo não estruturado, conforme as convenções da linguagem, ou seja, o código
> deve ser claro sem a documentação, a mesma deve servir apenas para facilitar e agilizar o processo
> de utilização de seu código.

## Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, 
a partir do código-fonte. O resultado é expresso em HTML. 
É constituído, basicamente, por algumas marcações muitos simples, 
inseridas nos comentários do programa.

Este sistema, é o padrão de documentação de classes em Java, 
onde muitas das IDEs desta linguagem irão automaticamente gerar 
um Javadoc em HTML.

Criando nossa documentação no formato html, para disponibilizar via web.

```java
// No terminal execute o comando abaixo
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java```