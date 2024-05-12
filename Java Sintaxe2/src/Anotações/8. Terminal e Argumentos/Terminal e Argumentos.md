# Terminal e Argumentos 👩‍💻

## Execução pelo terminal
 Para executar uma classe pelo terminal é bem simples, encontre a pasta de saída do seu projeto
 , nesta pasta você encontrará todas as suas classes, abra seu terminal, e vá para está pasto no terminal
 depois digite no terminal:
 `java nomeDaSuaClasse` e pronto, sua classe retornará o valor no terminal.
 
Caso sua classe exija parâmetros, digite no terminal:  `java nomeDaSuaClasse Parametro1 Parametro2 Parametro3`

## Scanner
O Scanner seria uma forma do usuário inserir dados durante a execução
do código.Esta serve para uma melhor experiência do usuário e para evitar a 
entrada de dados de forma incorreta. Exemplo:
```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}

```