package Classes;

import java.io.IOException;
import java.util.ArrayList;

public class GerenciadorDeHabitos {
    
    private ArrayList<Habito> habitos;

    public GerenciadorDeHabitos(){
        this.habitos = new ArrayList<>();
    }

    public static void limpaConsole(){
        
        try {
			System.out.print("\nContinuar <ENTER>");
			System.in.read();

		    } catch (IOException e) {

		}

        for (int i = 0; i < 999; i++) {
            System.out.println("\b");
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
        }
    }

    public void adicionarHabitos(String nome, String descricao, int frequenciaSemanal ){
        Habito novoHabito = new Habito(nome, descricao, frequenciaSemanal, false);
        habitos.add(novoHabito);
        System.out.print("Habito adicionado!");

        limpaConsole();
    }

    public void listarHabitos(){
        for (int i = 0; i < habitos.size(); i++) {
            System.out.print("[" + i + "].");
            System.out.println(habitos.get(i));
        }
        limpaConsole();
    }

    public  void concluirHabitos(int indice){
        if (indice >= 0 && indice < habitos.size() ){
            habitos.get(indice).concluir();
            System.out.print("Habito Concluído!");
        }
        limpaConsole();
    }


}
