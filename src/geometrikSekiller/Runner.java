package geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" ============= İŞLEMLER =============\n"+
                "\t\t 1-Kare \n" +
                "\t\t 2-Dikdörtgen \n" +
                "\t\t 3-Daire \n" +
                "\t SEÇİMİNİZ:");

        int secim= scan.nextInt();
        switch (secim){

            case 1 :{
                Kare kare = new Kare();
                kare.alan();
                kare.cevre();
            }
            case 2 :{
                Dikdortgen dikdortgen = new Dikdortgen();
                dikdortgen.alan();
                dikdortgen.cevre();
            }
            case 3 :{



            }

        }

    }
}
