package Decyzje;

public class Newag {
    public static void main(String[] args) {

        //current date
        int day = 1;
        int month = 12;
        int year = 21;



        if(day >= 21 && month >= 11 && year >= 21){

            System.out.println("Pociąg nie jeździ");
        }
        else {
            System.out.println("Pociąg odjeżdża z toru 3 przy peronie 4");
        }

    }

}
