public class ExemploForArray {

    // em arrays o indice começa em 0
    public static void main(String[] args) {

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        
        for ( int x = 0; x < alunos.length; x++) {
        System.out.println("O aluno no índice x = " + x + "é " + alunos[x]);
        }
        

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }
}
