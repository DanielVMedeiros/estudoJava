import entidades.Filme;
import entidades.Usuario;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        int id = 1;
        String nome = "Daniel";
        String email = "emailTeste@gmail.com";
        Date dataNascimento = new Date(2002, 9, 12);
        String senha = "1234";
        Usuario usuario = new Usuario(id, nome, email, dataNascimento, senha);
        
        System.out.println(usuario.toString());
    }
}