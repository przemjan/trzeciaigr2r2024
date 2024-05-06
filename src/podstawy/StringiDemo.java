package podstawy;

public class StringiDemo {
    public static void main(String[] args) {

        String name = "Anastazja";

        int dlugosc = name.length();

        char inicjal = name.charAt(0);

        String male, duze;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(duze);
    }
}
