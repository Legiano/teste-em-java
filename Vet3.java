import java.util.Scanner;

public class Vet3 {
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
        
        System.out.println("\nInforme o nome do passageiro para buscar:");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;
        
        for(int i = 0; i < passageiro.length; i++) {
            if(passageiro[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("O passageiro " + nomeBusca + " está na poltrona " + (i + 1));
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado) {
            System.out.println("Passageiro não encontrado!");
        }
        
        scanner.close();
    }
}
