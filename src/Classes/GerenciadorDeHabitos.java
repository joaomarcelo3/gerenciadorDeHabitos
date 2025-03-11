package Classes;

import java.util.ArrayList;

public class GerenciadorDeHabitos {
    
    private ArrayList<Habito> habitos;

    public GerenciadorDeHabitos(){
        this.habitos = new ArrayList<>();
    }

    public void adicionarHabitos(String nome, String descricao, int frequenciaSemanal ){
        Habito novoHabito = new Habito(nome, descricao, frequenciaSemanal);
        habitos.add(novoHabito);
        System.out.println("Habito adicionado!");
    }

    public void listarHabitos(){
        for (int i = 0; i < habitos.size(); i++) {
            System.out.println(habitos.get(i));
        }
    }

    public  void concluirHabitos(int indice){
        if (indice >= 0 && indice < habitos.size() ){
            habitos.get(indice).concluir();
        }
    }

}
