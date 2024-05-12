# Escopo
Escopo pode ser entendido como o ambiente onde uma variável pode ser 
acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde
ela foi declarada.**

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável 
está limitado apenas ao corpo desse método, ou seja, dentro das chaves que 
limitam o método.

## Exemplo de Escopo: 

### Exemplo 1:
```java
public class Conta {
	//variavel da classe conta (escopo de classe)
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método (escopo de método)
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
        //valorMontante é a única variável que estará disponível fora do método
		
		return valorMontante;
	}
}
```
