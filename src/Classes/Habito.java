package Classes; 

import Interfaces.Concluivel; 

public class Habito extends Atividade implements Concluivel {

    private int frequenciaSemanal;
    private boolean concluido;

    public Habito(String nome, String descricao, int frequenciaSemanal, boolean concluido) {
        this.nome = nome;
        this.descricao = descricao;
        this.frequenciaSemanal = frequenciaSemanal;
        this.concluido = false;
    }

    @Override
    public void concluir() {
        this.concluido = true;
        }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Descricao: " + descricao + ", Frequencia Semanal: " + frequenciaSemanal
                + "," + (concluido ? " " : " não ") + "está concluído" ;
    }

    

    

    
}

    

    

