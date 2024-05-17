package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Filip lubi flaczki :)");

        //zapisanie kolejnej linii
        pw.println("Kuba lubi jeść ( pierogi z truskawkami)");

        pw.close();
    }
}
