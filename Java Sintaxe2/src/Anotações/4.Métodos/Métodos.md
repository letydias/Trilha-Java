# Métodos 🔢

Os métodos correspondem à funções ou sub rotinas disponíveis dentro de nossas classes.
Ex: Se fosse um carro, ações como acelerar, freiar seriam dois métodos do carro.

## Critério de nomeação de métodos

Não são de uso obrigatório, porém são altamente recomendadas para trabalhar com código colaborativo.
- Deve ser nomeado como verbo. (Ex: Somar, subtrair, etc);
- Deve seguir o padrão camelCase;
- Não ser ambíguo, deixar o mais claro no nome o que o método em questão faz.

## Estruturação de Métodos
>  [!IMPORTANT]
> Caso o método não retorne nenhum valor ele vai ser representado pela palavra chave _void_.

 ```java
public class MyClass {

    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ... ;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    
    // throws Exception : indica que o método ao ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }
    
    public void gravarCliente(String nome, String cpf, Integer telefone, ....){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }
    
    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}
}
 ```