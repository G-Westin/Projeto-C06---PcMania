 package br.inatel.comp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo à PC Mania!");

        // Entrada dados do Cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = entrada.nextLine();

        // Instanciando o Cliente
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        int index = 0;
        int opcao;

        System.out.println("\nPromoções disponíveis:");
        System.out.println("1 - Promoção 1 (Apple)");
        System.out.println("2 - Promoção 2 (Samsung)");
        System.out.println("3 - Promoção 3 (Dell)");
        System.out.println("0 - Finalizar compra");

        do {
            System.out.print("\nDigite o código do PC que deseja comprar: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                // Instanciando Promoção 1
                Computador pc1 = new Computador("Apple", 635.0f, "macOS Sequoia", 64);
                pc1.addHardware("Pentium Core i5", 2200);
                pc1.addHardware("Memória RAM", 8);
                pc1.addHardware("HD", 500);

                MemoriaUSB pen1 = new MemoriaUSB("Pendrive", 16);
                pc1.addMemoriaUSB(pen1);

                cliente.getComputadores()[index] = pc1;
                index++;
                System.out.println("PC Apple adicionado ao carrinho!");

            } else if (opcao == 2) {
                // Instanciando Promoção 2
                Computador pc2 = new Computador("Samsung", 636.0f, "Windows 8", 64);
                pc2.addHardware("Pentium Core i7", 3370);
                pc2.addHardware("Memória RAM", 16);
                pc2.addHardware("HD", 1000);

                MemoriaUSB pen2 = new MemoriaUSB("Pendrive", 32);
                pc2.addMemoriaUSB(pen2);

                cliente.getComputadores()[index] = pc2;
                index++;
                System.out.println("PC Samsung adicionado ao carrinho!");

            } else if (opcao == 3) {
                // Instanciando Promoção 3
                Computador pc3 = new Computador("Dell", 637.0f, "Windows 10", 64);
                pc3.addHardware("Pentium Core i7", 4500);
                pc3.addHardware("Memória RAM", 32);
                pc3.addHardware("HD", 2000);

                MemoriaUSB hdExt = new MemoriaUSB("HD Externo", 1000);
                pc3.addMemoriaUSB(hdExt);

                cliente.getComputadores()[index] = pc3;
                index++;
                System.out.println("PC Dell adicionado ao carrinho!");

            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        entrada.close();

        // Resumo da compra
        System.out.println("\n==================================");
        System.out.println("RESUMO DA COMPRA");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("----------------------------------");

        // Percorrendo o array de computadores para mostrar os dados
        Computador[] pcsComprados = cliente.getComputadores();
        for (int i = 0; i < pcsComprados.length; i++) {
            if (pcsComprados[i] != null) {
                pcsComprados[i].mostraPCConfigs();
                System.out.println("----------------------------------");
            }
        }

        System.out.printf("TOTAL DA COMPRA: R$ %.2f\n", cliente.calculaTotalCompra());
        System.out.println("==================================\n");

        // Método estático utilitário processando o array final
        ProcessarPedido.processar(cliente.getComputadores());
    }
}