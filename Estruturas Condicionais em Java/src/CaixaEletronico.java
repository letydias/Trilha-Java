// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 6.0;
        //Condicional Simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        }
        //Condicional Composta
        else
            System.out.println("Saldo insuficiente");



    }
}