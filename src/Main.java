import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidades.ItemMidia;
import entidades.ItemMidiaOmdb;
import entidades.Usuario;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme que deseja buscar: ");
        String filme = sc.nextLine();

        String url = "http://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        ItemMidiaOmdb itemOmdb = gson.fromJson(json, ItemMidiaOmdb.class);

        try{
            ItemMidia itemMidia = new ItemMidia(itemOmdb);
            System.out.println("Título Selecionado: " + itemMidia );
        }catch(Exception e){
            System.out.println("Erro ao salvar o novo item de mídia: " + e.getMessage());
        }

    }
}