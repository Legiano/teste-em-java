import java.util.Scanner;

public class Vet4 {
    public static void main(String[] args) {
        String[] passageiro = new String[8];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < passageiro.length; i++) {
            passageiro[i] = "vazio";
        }
        
        while (true) {
          
            System.out.println("Digite o nome do passageiro ou '0':");
            String nome = scanner.nextLine();
            
          
            if (nome.equals("0")) {
                System.out.println("Lista completa dos passageiros:");
                for (int i = 0; i < passageiro.length; i++) {
                    System.out.println("Poltrona " + (i + 1) + ": " + passageiro[i]);
                }
                break; 
            }
            
           
            System.out.println("Digite o número da poltrona (1 a " + passageiro.length + "):");
            int numeroPoltrona = scanner.nextInt();
            scanner.nextLine(); 
            
           
            if (numeroPoltrona >= 1 && numeroPoltrona <= passageiro.length) {

                passageiro[numeroPoltrona - 1] = nome;
            } else {
               
                System.out.println("Número de poltrona inválido! Digite um número entre 1 e " + passageiro.length + ".");
            }
        }
        
        scanner.close();
    }
}
