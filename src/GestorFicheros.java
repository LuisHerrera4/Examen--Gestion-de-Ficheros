import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

    String rutaMestre= GestorFicheros.class.getResource("mestre.txt").getFile();
    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaMestre))){
        bufferedReader.readLine();
    }catch(IOException e){


    }

}
