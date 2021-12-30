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
            musicians[i][0] = imiona[i];
            musicians[i][1] = nazwiska[i];
            System.out.println(musicians[i][0] + " " + musicians[i][1]);
        }
    }
}
