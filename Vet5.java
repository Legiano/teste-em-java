import java.util.Scanner;

public class Vet5 {
    public static void main(String[] args) {
        String[] passageiro = new String[8];
        double[] precoPassagem = new double[8];
        Scanner scanner = new Scanner(System.in);
    
        for (int i = 0; i < passageiro.length; i++) {
            passageiro[i] = "vazio";
            precoPassagem[i] = 0.0;
        }

        while (true) {
            System.out.println("\n!! Escolha uma opção !!");
            System.out.println("1) Inserir o passageiro(a)");
            System.out.println("2) Lista dos passageiros");
            System.out.println("3) Informar valor da passagem");
            System.out.println("4) Total da viagem");
            System.out.println("0) Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do passageiro(a):");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o número da poltrona (1 a " + passageiro.length + "):");
                    int numeroPoltrona = scanner.nextInt();
                    scanner.nextLine(); 

                    if (numeroPoltrona >= 1 && numeroPoltrona <= passageiro.length) {
                        if (passageiro[numeroPoltrona - 1].equals("vazio")) {
                            passageiro[numeroPoltrona - 1] = nome;
                            System.out.println("Passageiro inserido com sucesso!");
                        } else {
                            System.out.println("Poltrona já ocupada! Não foi possível inserir o passageiro.");
                        }
                    } else {
                        System.out.println("Número de poltrona inválido! Digite um número entre 1 e " + passageiro.length + ".");
                    }
                    break;

                case 2:
                    System.out.println("Lista completa dos passageiros:");
                    for (int i = 0; i < passageiro.length; i++) {
                        System.out.println("Poltrona " + (i + 1) + ": " + passageiro[i]);
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor da passagem:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    double total = 0;
                    for (int i = 0; i < passageiro.length; i++) {
                        if (!passageiro[i].equals("vazio")) {
                            precoPassagem[i] = valor;
                            total += valor;
                        }
                    }
                    System.out.println("Total das passagens: R$" + total);
                    break;

                case 4:
                    total = 0;
                    for (int i = 0; i < passageiro.length; i++) {
                        if (!passageiro[i].equals("vazio")) {
                            total += precoPassagem[i];
                        }
                    }
                    System.out.println("Total da viagem: R$" + total);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Escolha uma opção de (1 a " +passageiro.length +")");
                    break;
            }
        }
    }
}
