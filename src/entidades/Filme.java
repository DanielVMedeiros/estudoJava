package entidades;

public class Filme extends ItemMidia implements classificavel{
    private int duracao;
    private String diretor;
    private Double nota;
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public Double getClassificacao(){
        return nota;
    }
}
