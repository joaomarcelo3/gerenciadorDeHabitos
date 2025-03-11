package Classes;

public abstract class Atividade {
    protected String nome;
    protected String descricao;

    public abstract void executar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  

    

}
