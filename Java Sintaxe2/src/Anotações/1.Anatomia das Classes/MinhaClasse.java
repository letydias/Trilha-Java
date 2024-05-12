public class MinhaClasse {
    public static void main(String[] args) {
        //Declarando Variáveis
        System.out.println("Olá Turma");
        String meuNome="Letícia";
        int anoFrabricacao = 2022;
        boolean simNao = true;
        anoFrabricacao =2018;

        //Entendendo Métodos
        String primeiroNome= "Letícia";
        String segundoNome="Dias";
        String nomeCompletoVar = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompletoVar);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}