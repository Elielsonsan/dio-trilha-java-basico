public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"Jonas", "Julia", "Marcos", "Felipe"};

        for(String aluno : alunos){
            System.out.println("o nome do Aluno e: " + aluno);
        }
        
        /*for (int x = 0; x < alunos.length; x++) {
            System.out.println("O Aluno no indice x=: "+ x + " é " + alunos[x]);
        } */
        
    }
}