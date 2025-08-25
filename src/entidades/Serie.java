package entidades;

import java.util.ArrayList;
import java.util.List;

public class Serie extends ItemMidia implements classificavel {
    private int totalTemporada;
    private int totalEpisodios;
    private double mediaEpisodiosPorTemporada;

    private List<Double> notasPorTemporada = new ArrayList<Double>();

    public int getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(int totalTemporada) {
        this.totalTemporada = totalTemporada;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public double getMediaEpisodiosPorTemporada() {
        return mediaEpisodiosPorTemporada;
    }

    public void setMediaEpisodiosPorTemporada(double mediaEpisodiosPorTemporada) {
        this.mediaEpisodiosPorTemporada = mediaEpisodiosPorTemporada;
    }



    @Override
    public Double getClassificacao(){
        Double somaNotas = 0.0;
        for(Double nota : notasPorTemporada){
            somaNotas += nota;
        }
        return somaNotas/totalTemporada;
    }
}
