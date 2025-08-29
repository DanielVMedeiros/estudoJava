import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.ItemMidia;
import entidades.ItemMidiaOmdb;
import entidades.Usuario;
import exceptions.ErroDeConversaoDeAnoException;

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
                .create();

        while(!filme.equals("sair")){


            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do filme que deseja buscar: ");
            filme = sc.nextLine();

            String url = "http://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=7c1014d2";

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .GET()
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                ItemMidiaOmdb itemOmdb = gson.fromJson(json, ItemMidiaOmdb.class);

                ItemMidia itemMidia = new ItemMidia(itemOmdb);
                titulos.add(itemMidia);

            }catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }

        FileWriter arquivoFilmes = new FileWriter("filmes.json");
        arquivoFilmes.write(gson.toJson(titulos));
        arquivoFilmes.close();

        System.out.println("O programa finalizou corretamente!");
    }
}