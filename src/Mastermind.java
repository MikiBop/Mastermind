import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mastermind {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] farbe = new String[4];



        String[] checker = new String[4];

        for (int k = 0; k < 4; k++) {
            System.out.print("Geheimer Code"+ " Farbe" + (k+1) + ":");
            farbe[k] = br.readLine();
        }

        for (int o = 0; o < 50; o++) {
            System.out.println(" ");
        }


        for (int i = 1; i < 13; i++) {

            String[] eingabe = new String[4];

            for (int j = 0; j < 4; j++) {
                System.out.print("Versuch " + i + ": Farbe " + (j + 1) + ":");
                eingabe[j] = br.readLine();
            }
            System.out.println("Dein Versuch: " + eingabe[0] + " " + eingabe[1] + " " + eingabe[2] + " " + eingabe[3]);

            for (int p = 0; p < 4; p++) {
                if (farbe[p].equals(eingabe[p])) {
                    checker[p] = "√";
                }
                else {
                    checker[p] = "";
                }
            }
            for (int e = 0; e < 4; e++) {
                System.out.print(checker[e]);
            }
            System.out.println();
            if (checker[0].equals("√")&&checker[1].equals("√")&&checker[2].equals("√")&&checker[3].equals("√")){
                System.out.println("Herzlichen Glückwunsch! Sie haben ein Porsche Cayman S gewonnen!1!!");
                break;
            }
        }

    }
}
