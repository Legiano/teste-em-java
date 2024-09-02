import java.util.Scanner;

public class Vet2 {
    public static void main(String[] args) {
        String[] passageiro = new String[8];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < passageiro.length; i++) {
            System.out.println("Informe o nome do passageiro " + (i + 1) + ": ");
            passageiro[i] = scanner.nextLine();
        }
        
        System.out.println("Resumo dos passageiros:");
        for(int i = 0; i < passageiro.length; i++) {
            System.out.println("Poltrona " + (i + 1) + ": " + passageiro[i]);
        }
        
        System.out.println("\nInforme o número da poltrona ?");
        int numeroPoltrona = scanner.nextInt();
        
        if(numeroPoltrona > 0 && numeroPoltrona <= passageiro.length) {
            System.out.println("O passageiro na poltrona " + numeroPoltrona + " é: " + passageiro[numeroPoltrona - 1]);
        } else {
            System.out.println("Número de poltrona inválido!");
        }
        
        scanner.close();
    }
}
