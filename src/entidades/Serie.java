package entidades;

import java.util.ArrayList;
import java.util.List;

public class Serie extends ItemMidia{
    private int idSerie;
    private String autor;
    private int totalTemporada;
    private int totalEpisodios;
    private int idItemMidia;

    public Serie(ItemMidiaOmdb item) {
        super(item);
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }


    //sei que toda série é um ItemMidia, só criei para representar a coluna da tabela, depois organizo
    public int getIdItemMidia() {
        return idItemMidia;
    }

    public void setIdItemMidia(int idItemMidia) {
        this.idItemMidia = idItemMidia;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(int totalTemporada) {
        this.totalTemporada = totalTemporada;
    }
}
