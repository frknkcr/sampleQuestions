package elektrikFaturaHesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hesap{
    Fatura fatura = new Fatura();
    Scanner scan = new Scanner(System.in);
    int gunSayisi;

    public void hesaplama(){
        try {
                System.out.println("Hangi aya ait elektrik faturanızı hesaplamak istersiniz: \n(Ay ismini giriniz!)");
                String ay =scan.next();
                gunSayisi(fatura.getAy());
                System.out.println("Aylık tükeyiminizi 'KW' olarak girin: ");
                fatura.setTuketim(scan.nextDouble());

                if (fatura.getTuketim() < 240) {
                    fatura.setTutar(fatura.getTuketim() * 1.26291);
                    fatura.setGunlukTuketim(fatura.getTuketim() / gunSayisi);

                } else {
                    double altKisim = fatura.getTuketim() - 240;
                    fatura.setTutar(240 * 1.26291 + altKisim * 1.89557);
                    fatura.setGunlukTuketim(fatura.getTuketim() / gunSayisi);
                }
                System.out.println(fatura);
        }catch (InputMismatchException e){
            scan.nextLine();
            System.out.println("Hatalı değer girişi, devam etmek istiyor musunuz ? E/H");
            String secim = scan.next();
            if (secim.equalsIgnoreCase("e")){
                hesaplama();
            }
            System.out.println("Çıkış yapılıyor : ");
            System.exit(0);
        }
    }

    public void gunSayisi(String ay) {

        fatura.setAy(ay);
        if (ay.equalsIgnoreCase("ocak") || ay.equalsIgnoreCase("mart") || ay.equalsIgnoreCase("mayıs") ||
                ay.equalsIgnoreCase("temmuz") || ay.equalsIgnoreCase("ağustos") ||
                ay.equalsIgnoreCase("ekim") || ay.equalsIgnoreCase("aralık")) {
            this.gunSayisi = 31;

        } else if (ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("haziran") ||
                ay.equalsIgnoreCase("eylül") || ay.equalsIgnoreCase("kasım")) {
            this.gunSayisi = 30;

        } else if (ay.equalsIgnoreCase("şubat")) {
            this.gunSayisi = 28;

        }
    }


}
