package Classes;

import java.util.Scanner;

public class Menu {
    
    Scanner scanner = new Scanner(System.in);
    GerenciadorDeHabitos habitos = new GerenciadorDeHabitos();

    
    public void menuAdicionaHabito(){

        System.out.print("escreva o nome do hábito: ");
        String nome = scanner.nextLine();

        System.out.print("escreva a descrição do hábito: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a frequência semanal: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida, escreva um número inteiro, tente novamente!");
            System.out.print("Digite a frequência semanal: ");
            scanner.next();
        }

        int frequenciaSemanal = scanner.nextInt();
        scanner.nextLine();
               
        habitos.adicionarHabitos(nome, descricao, frequenciaSemanal);
    }

    public void menuListaHabito(){
        habitos.listarHabitos();
    }

    public void menuConcluiHabito(){

        System.out.print("Escreva o indice do hábito que foi concluído: ");
        int indice = scanner.nextInt();

        habitos.concluirHabitos(indice);

    }

    public void iniciarMenu(){

        int opcao;

        do {
            System.out.println("----------------MENU----------------");
            System.out.println("1.Adicionar Habitos");
            System.out.println("2.Listar Habitos");
            System.out.println("3.Concluir Habitos");
            System.out.println("4.Sair");
            System.out.println("------------------------------------");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
 
            switch (opcao) {
                case 1:
                menuAdicionaHabito();
                    break;

                case 2:
                menuListaHabito();
                    break;
                
                case 3:
                menuConcluiHabito();
                    break;

                case 4:
                System.out.println("Saindo....");
                    break;
            
                default:
                System.out.println("Opção inválida...tente novamente!");
                    break;
            }
        } while (opcao != 4);

        scanner.close();

    }
}
