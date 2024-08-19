import java.util.Scanner;

public class ContaTerminal {
 
    public static void main(String[] args){
        
        //conhecer e importar classe Scanner        
            
        Scanner scanner = new Scanner(System.in);
        
        //exibir as mensagens para o nosso usuario
        

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        //obter pela Scanner os valores digitados no terminal


        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
