import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSON_JacksonVeriOkumaYazma {


    public static void main(String[] args) {

        // Json Veri Okuma
        System.out.println("////////////////////////////");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\movie.json"));
            ObjectMapper mapper=new ObjectMapper();
           Movie movie =mapper.readValue(bufferedReader, Movie.class);
            System.out.println( movie);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Json Veri yazma

        try {
            List<Movie> movies=new ArrayList<>(List.of(
                    new Movie("I Am Legend","2007","Francis Lawrence",7.2),
                    new Movie("300","2007","Zack Snyder",7.7),
                    new Movie("The Wolf of Wall Street","2013","Martin Scorsese",8.2)

            ));
            //toplu json veri yazdırma
            ObjectMapper mapper=new ObjectMapper();
            mapper.writeValue(new File("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\yeniFilmler.json"),movies);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            /// Toplu json veri okuma
        System.out.println("//////////toplu veri okuma//////////////////");
        try {
            BufferedReader bufferedReader2=new BufferedReader(new FileReader("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\yeniFilmler.json"));

            ObjectMapper mapper = new ObjectMapper();
          List<Movie> movies =mapper.readValue(bufferedReader2, List.class);
            System.out.println(movies);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
