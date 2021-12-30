package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        /*
        Dane z generatora losowych imion:
        Andor Praveen
        Caio Avitus
        Lucian Iwo
        Rudolf Neasa
         */
        String[] imiona = {"Andor", "Caio", "Lucian", "Rudolf"};
        String[] nazwiska = {"Praveen", "Avitus", "Iwo", "Neasa"};

        String musicians[][] = new String[4][2];

        for (int i = 0; i < musicians.length; i++) {
            for (int j = 0; j < musicians[i].length; j++) {
                musicians[i][j] = imiona[i];
                System.out.println(musicians[i][j]);


            }
        }
    }
}