package entidades;

public class Filme extends ItemMidia{
    private int idFilme;
    private int duracao;
    private String diretor;
    private int idItemMidia;

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    //sei que todo filme é um ItemMidia, só criei para representar a coluna da tabela, depois organizo
    public int getIdItemMidia() {
        return idItemMidia;
    }

    public void setIdItemMidia(int idItemMidia) {
        this.idItemMidia = idItemMidia;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
