package util;

import model.Animal;
import model.Filo;
import service.AnimalService;

import java.util.Scanner;

public class Menu {

    private AnimalService animalService = new AnimalService();
    private Scanner scanner = new Scanner(System.in);

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n=== Classificador Animal ===");
            System.out.println("1 - Cadastrar novo animal");
            System.out.println("2 - Listar todos os animais");
            System.out.println("3 - Buscar por filo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> animalService.listarAnimais();
                case 3 -> buscarPorFilo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private void cadastrarAnimal() {
        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Simetria: ");
        String simetria = scanner.nextLine();

        System.out.print("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Escolha o filo:");
        for (Filo f : Filo.values()) {
            System.out.println("- " + f);
        }
        System.out.print("Digite exatamente como está acima: ");
        String filoStr = scanner.nextLine().toUpperCase();

        try {
            Filo filo = Filo.valueOf(filoStr);
            Animal novoAnimal = new Animal(nome, filo, simetria, habitat);
            animalService.adicionarAnimal(novoAnimal);
        } catch (IllegalArgumentException e) {
            System.out.println("Filo inválido! Tente novamente.");
        }
    }

    private void buscarPorFilo() {
        System.out.println("Digite o filo para buscar:");
        for (Filo f : Filo.values()) {
            System.out.println("- " + f);
        }
        System.out.print("Digite exatamente como está acima: ");
        String filoStr = scanner.nextLine().toUpperCase();

        try {
            Filo filo = Filo.valueOf(filoStr);
            animalService.buscarPorFilo(filo);
        } catch (IllegalArgumentException e) {
            System.out.println("Filo inválido! Tente novamente.");
        }
    }
}
