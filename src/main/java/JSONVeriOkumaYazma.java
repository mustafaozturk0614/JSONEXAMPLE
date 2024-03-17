import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONVeriOkumaYazma {


    public static void main(String[] args) {

        // Json Veri Okuma
        System.out.println("///////////////veri okuma ////////////////////");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\movie.json"));

            Gson gson=new Gson();
           Movie ogrenci =gson.fromJson(bufferedReader, Movie.class);
            System.out.println( ogrenci);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Json Veri yazma

        try {
            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\yeniFilmler.json"));
            List<Movie> movies=new ArrayList<>(List.of(
                    new Movie("I Am Legend","2007","Francis Lawrence",7.2),
                    new Movie("300","2007","Zack Snyder",7.7),
                    new Movie("The Wolf of Wall Street","2013","Martin Scorsese",8.2)

            ));
            //toplu json veri yazdırma
            Gson gson=new Gson();
            gson.toJson(movies,bufferedWriter);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            /// Toplu json veri okuma
        System.out.println("/////////////// toplu veri okuma ////////////////////");
        try {
            BufferedReader bufferedReader2=new BufferedReader(new FileReader("E:\\hs_1_workspace\\JSONEXAMPLE\\src\\main\\resources\\yeniFilmler.json"));
            Gson gson=new Gson();
           List<Movie> movies =gson.fromJson(bufferedReader2, List.class);
            System.out.println(movies);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
