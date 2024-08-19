public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova Recuperação" : "Reprovado";
        
        System.out.println(resultado);



        /* primeira solução
        if (nota >= 7) {
            System.out.println("Aprovado");
        } 

        else if (nota >= 5 && nota < 7) {
            System.out.println("Prova Recuperação");
        }
        
        else {
            System.out.println("Reprovado");    
        }*/
    }
}
