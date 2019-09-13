import com.enigma.model.Mobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Masukan koordinat awal x,y : ");
        String coordinate = reader.readLine();
        String[] post = coordinate.split(",");
        Mobil rush = new Mobil(Integer.parseInt(post[0]), Integer.parseInt(post[1]));

        System.out.print("Masukan bensin : ");
        String masukFuel = reader.readLine();
        Integer isiFuel = Integer.parseInt(masukFuel);
        rush.fillFuel(isiFuel);
        System.out.print("masukan perintah :");
        String masukCommands = reader.readLine();
        rush.setCommands(masukCommands);
        rush.run();

        System.out.println(rush.print());
    }
}
