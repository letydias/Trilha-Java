public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        // Realiza a mesma operação do for acima
        for(String aluno : alunos) {
            System.out.println("O aluno é: " + aluno);

    }
    }
}
