package br.ceub.contacts;

import java.util.Scanner;

public class ContactManager {
	private static ContactList contactList = new ContactList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;

        System.out.println("=== Sistema de Gerenciamento de Contatos ===");

        while (choice != 5) {
            exibirMenu();
            try {
                System.out.print("Escolha uma opção: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        adicionarContato();
                        break;
                    case 2:
                        buscarContato();
                        break;
                    case 3:
                        removerContato();
                        break;
                    case 4:
                        listarContatos();
                        break;
                    case 5:
                        System.out.println("Encerrando o sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número correspondente às opções.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Buscar Contato");
        System.out.println("3. Remover Contato");
        System.out.println("4. Listar Todos os Contatos");
        System.out.println("5. Sair");
        System.out.println("-------------------------------------------------");
    }

    private static void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Digite o número de telefone do contato: ");
        String telefone = scanner.nextLine().trim();

        System.out.print("Digite o e-mail do contato: ");
        String email = scanner.nextLine().trim();

        if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
            System.out.println("Todos os campos são obrigatórios. Contato não adicionado.");
            return;
        }

        Contact novoContato = new Contact(nome, telefone, email);
        contactList.addContact(novoContato);
    }


    private static void buscarContato() {
        System.out.print("Digite o nome ou número de telefone do contato a buscar: ");
        String termo = scanner.nextLine().trim();

        if (termo.isEmpty()) {
            System.out.println("O termo de busca não pode estar vazio.");
            return;
        }

        Contact encontrado = contactList.searchContact(termo);
        if (encontrado != null) {
            System.out.println("Contato encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }


    private static void removerContato() {
        System.out.print("Digite o nome ou número de telefone do contato a remover: ");
        String termo = scanner.nextLine().trim();

        if (termo.isEmpty()) {
            System.out.println("O termo de remoção não pode estar vazio.");
            return;
        }

        boolean removido = contactList.removeContact(termo);
        if (removido) {
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado. Nenhuma remoção realizada.");
        }
    }

    private static void listarContatos() {
        contactList.listContacts();
    }
}

