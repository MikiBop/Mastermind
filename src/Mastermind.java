import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mastermind {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] secret = new String[4];

        for (int k = 0; k < 4; k++) {
            System.out.print("Geheimer Code" + " Farbe" + (k + 1) + ":");
            secret[k] = br.readLine();
        }

        for (int o = 0; o < 50; o++) {
            System.out.println(" ");
        }

        for (int i = 1; i < 13; i++) {
            String[] checker = new String[4];
            String[] eingabe = new String[4];
            boolean[] checkedEingabe = new boolean[4];
            boolean[] checkedSecret = new boolean[4];

            for (int j = 0; j < checker.length; j++) {
                checker[j] = "";
                checkedEingabe[j] = false;
                checkedSecret[j] = false;
            }

            for (int j = 0; j < 4; j++) {
                System.out.print("Versuch " + i + ": Farbe " + (j + 1) + ":");
                eingabe[j] = br.readLine();
            }
            System.out.println("Dein Versuch: " + eingabe[0] + " " + eingabe[1] + " " + eingabe[2] + " " + eingabe[3]);

            for (int p = 0; p < 4; p++) {
                if (secret[p].equals(eingabe[p])) {
                    checker[p] = "√";
                    checkedEingabe[p] = true;
                    checkedSecret[p] = true;
                }
            }
            for (int p = 0; p < 4; p++) {
                if (!checkedEingabe[p]) {
                    for (int h = 0; h < 4; h++) {
                        if (!checkedSecret[h] && eingabe[p].equals(secret[h])) {
                            checker[p] = "?";
                            checkedEingabe[p] = true;
                            checkedSecret[h] = true;
                        }
                    }
                }
            }

            printChecker(checker);

            System.out.println();
            if (checker[0].equals("√") && checker[1].equals("√") && checker[2].equals("√") && checker[3].equals("√")) {
                System.out.println("Herzlichen Glückwunsch! Sie haben ein Porsche Cayman S gewonnen!1!!");
                break;
            }
        }
    }

    private static void printChecker(String[] checker) {
        for (int u = 0; u < 4; u++){
            if(checker[u].equals("√")){
                System.out.print(checker[u]);
            }
        }
        for (int g = 0; g < 4; g++){
            if(checker[g].equals("?")){
                System.out.print(checker[g]);
            }
        }
    }
}
