import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mastermind {


    public static void main(String[] args) throws IOException {

        String farbe1 = "blue";
        String farbe2 = "red";
        String farbe3 = "blue";
        String farbe4 = "yellow";
        String checker1 = "";
        for (int i = 1; i < 13; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] eingabe = new String[4];

            for (int j = 0; j < 4; j++) {
                System.out.print("Versuch " + i + ": Farbe " + (j + 1) + ":");
                eingabe[j] = br.readLine();
            }
            System.out.println("Dein Versuch: " + eingabe[0] + " " + eingabe[1] + " " + eingabe[2] + " " + eingabe[3]);

            if (farbe1.equals(eingabe[0])) {
                checker1 = "√";
                System.out.println(checker1);
            }
            if (farbe2.equals(eingabe[1])) {
                checker1 = "√";
                System.out.println(checker1);
            }
            if (farbe3.equals(eingabe[2])) {
                checker1 = "√";
                System.out.println(checker1);
            }
            if (farbe4.equals(eingabe[3])) {
                checker1 = "√";
                System.out.println(checker1);
            }
        }

    }
}
