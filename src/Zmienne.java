public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 14;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba1);
        System.out.println("Druga zmienna: " + liczba2);

        liczba1 = (int)liczba2;

        System.out.println(liczba1);

        liczba2 = liczba1;

        int days = 5;
        int hours = 8;
        int weeks = 52;

        int workHoursPerYear = days * hours * weeks;

        System.out.println(workHoursPerYear);


        String napis = "Dzisiaj\t jest\\ \"ładna\" pogoda";

        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "\n");
        System.out.print("Mój\n napis: " + napis);


        char znak = '#';

        boolean sun = true; //false


        //       \\ubuckp

        // https://github.com/przemjan/trzeciaIgr2r2024

    }
}
