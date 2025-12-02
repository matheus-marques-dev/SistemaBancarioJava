import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import servico.BancoServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoServico banco = new BancoServico();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n BANCO JAVA");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar/Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Listar Tudo");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Erro: Digite apenas números.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Número: ");
                    String num = scanner.nextLine();
                    System.out.print("Titular: ");
                    String tit = scanner.nextLine();
                    System.out.print("Tipo (1-Corrente, 2-Poupança): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) banco.adicionarConta(new ContaCorrente(num, tit));
                    else if (tipo == 2) banco.adicionarConta(new ContaPoupanca(num, tit));
                    else System.out.println("Tipo inválido.");
                    break;

                case 2:
                    System.out.print("Conta: ");
                    Conta c = banco.buscarConta(scanner.nextLine());
                    if (c != null) {
                        System.out.print("1-Depositar | 2-Sacar: ");
                        int op = scanner.nextInt();
                        System.out.print("Valor: ");
                        double val = scanner.nextDouble();
                        scanner.nextLine();

                        if (op == 1) c.depositar(val);
                        else if (op == 2) c.sacar(val);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Origem: ");
                    Conta orig = banco.buscarConta(scanner.nextLine());
                    if (orig != null) {
                        System.out.print("Destino: ");
                        Conta dest = banco.buscarConta(scanner.nextLine());
                        if (dest != null) {
                            System.out.print("Valor: ");
                            double v = scanner.nextDouble();
                            scanner.nextLine();
                            orig.transferir(dest, v);
                        } else System.out.println("Destino não achado.");
                    } else System.out.println("Origem não achada.");
                    break;

                case 4:
                    banco.listarContas();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}