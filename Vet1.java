

import java.util.Scanner;

public class Vet1 {
    public static void main(String[] args) {
        String[] passageiro = new String[8];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < passageiro.length; i++) {
            System.out.println("Informe o nome do passageiro para a poltrona " + (i + 1) + ": ");
            passageiro[i] = scanner.nextLine();
        }
        
        System.out.println("\nResumo dos passageiros:");
        for(int i = 0; i < passageiro.length; i++) {
            System.out.println("Poltrona " + (i + 1) + ": " + passageiro[i]);
        } 
        
        scanner.close();
    }
}
