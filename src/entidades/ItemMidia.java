package entidades;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ItemMidia {
    private int identificador;

    @SerializedName("Title")
    private String titulo;

    @SerializedName("Genre")
    private String genero;

    @SerializedName("Year")
    private int anoLancamento;

    private Double nota;

    public ItemMidia(ItemMidiaOmdb item) {
        this.titulo = item.title();
        this.genero = item.genre();
        this.anoLancamento = Integer.parseInt(item.year());
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "ItemMidia{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
