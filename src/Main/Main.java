package Main;

import java.util.Scanner;

import Classes.GerenciadorDeHabitos;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        GerenciadorDeHabitos habitos = new GerenciadorDeHabitos();
        habitos.adicionarHabitos("Ler livro","Livro lindo bonitão de ler",3);
        habitos.listarHabitos();

        System.out.println("Escreva o indice do hábito que foi concluído");
        int indice = scanner.nextInt();
        habitos.concluirHabitos(indice);
        scanner.close();   
    }
}
