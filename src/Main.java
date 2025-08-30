import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.ItemMidia;
import entidades.ItemMidiaOmdb;
import entidades.Usuario;
import exceptions.ErroDeConversaoDeAnoException;
import metodosAdicionais.ConsultaAPI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<ItemMidia> titulos = new ArrayList<>();

        String filme = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(true){

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do filme que deseja buscar: ");
            filme = sc.nextLine();

            if(filme.equalsIgnoreCase("sair")){
                break;
            }

            ConsultaAPI consultaAPI = new ConsultaAPI();

            ItemMidia itemMidia = consultaAPI.consultaAPI(filme);

            titulos.add(itemMidia);


        }

        FileWriter arquivoFilmes = new FileWriter("filmes.json");
        arquivoFilmes.write(gson.toJson(titulos));
        arquivoFilmes.close();

        System.out.println("O programa finalizou corretamente!");
    }
}