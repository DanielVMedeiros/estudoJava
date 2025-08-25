package entidades;

import java.util.Date;

public class Usuario {
    private int identificador;
    private String nome;
    private String userName;
    private String email;
    private Date  dataNascimento;
    private String senha;

    //Contrutor
    public Usuario(int identificador, String nome, String email, Date dataNascimento, String senha) {
        this.identificador = identificador;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    //Gets e Sets
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "Senha: " + this.senha + "\n" +
                "DataNascimento: " + this.dataNascimento + "\n";
    }

}
