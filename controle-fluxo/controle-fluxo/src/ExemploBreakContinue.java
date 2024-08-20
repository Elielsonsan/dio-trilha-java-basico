public class ExemploBreakContinue {

    public static void main(String[] args) {
    for(int numero = 1; numero <= 5; numero++){  
        if(numero == 3)
               continue; //pula para o proximo laço ou inverte com break para parar o laço em um numero determinado.
            System.out.println("numero = " + numero); 
        }
    }
}
