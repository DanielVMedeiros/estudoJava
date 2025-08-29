package entidades;

import com.google.gson.annotations.SerializedName;
import exceptions.ErroDeConversaoDeAnoException;

import java.util.Date;

public class ItemMidia {
    private int identificador;

    private String titulo;

    private String genero;

    private int anoLancamento;

    private Double nota;

    public ItemMidia(ItemMidiaOmdb item) {
        //nesse ponto item.year() é uma string
        if(item.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }

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
        return "titulo= '" + titulo + '\'' +
                ", genero= '" + genero + '\'' +
                ", anoLancamento= " + anoLancamento;
    }
}
