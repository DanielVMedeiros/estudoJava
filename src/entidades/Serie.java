package entidades;

public class Serie extends ItemMidia {
    private int totalTemporada;
    private int totalEpisodios;
    private double mediaEpisodios;

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

    public double getMediaEpisodios() {
        return mediaEpisodios;
    }

    public void setMediaEpisodios(double mediaEpisodios) {
        this.mediaEpisodios = mediaEpisodios;
    }
}
