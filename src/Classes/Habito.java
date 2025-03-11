package Classes; 

import Interfaces.Concluivel; 

public class Habito extends Atividade implements Concluivel {

    private int frequenciaSemanal;

    public Habito(String nome, String descricao, int frequenciaSemanal) {
        this.nome = nome;
        this.descricao = descricao;
        this.frequenciaSemanal = frequenciaSemanal;
    }

    @Override
    public void executar() {
        System.out.println("Executando hábito: " + nome);
    }

    @Override
    public void concluir() {
        System.out.println("Hábito '" + nome + "' concluído!");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
        "\nDescricao: " + descricao + 
        "\nFrequencia Semanal: " + frequenciaSemanal;
    }

    
}
