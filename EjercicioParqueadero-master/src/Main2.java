import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombre= "PBWXFR";

        String nombre2="PB";

        boolean hola = nombre2.equalsIgnoreCase(nombre.substring(0,2));

        System.out.println(hola);
        System.out.println(nombre2.length());
    }
}