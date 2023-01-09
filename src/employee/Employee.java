package employee;

public class Employee {
    /*
    Constructor Sorusu:
Çalışanların çalışma yıllarına göre maaş zamlarını,
maaşlarına göre ödeyecekleri vergiyi ve
çalışma saatlerine göre kazanacakları bonusları hesaplayan bir program yazalım:

Vergi: 1000 TL altı kazanca vergi yok, 1000 TL üstü kazanca %3 vergi

Maaş zammı: 10 yıldan az çalışana %5,
10 yıldan fazla 20 yıldan az çalışana %10,
20 yıldan fazla çalışana %15 zam yapılacak.

Bonus: Normal çalışma saati 40 saattir, normal çalışma saatinden fazla çalışılan her 1 saat için 30TL bonus hesaplanacak.

Örnek Çıktı:
İsim: kemal
Maaş: 2000.0
Çalışma Saatleri: 45
Çalışmaya başlama tarihi: 1985
Vergi: 60.0
Bonus: 150.0
Maaş Artırımı: 300.0

Çözüm Yardımı:
Employee adlı bir class oluşturulacak ve bu class’ta:
İsim;
Maaş;
Çalışma saati;
Başlangıç yılı;
İnstance veriable’lar oluşturulacak.
Bu class’da 4 parametre (isim, maaş, çalışma saati, başlangıç yılı) kabul edecek bir constructor oluşturulacak.
vergi(), maaşZammı() ve bonus() hesaplayan 3 ayrı method oluşturulacak.
Sonuçlar yeni oluşturulan EmpDriver adlı class da yazdırılacak. Bunun için Employee class’ında toString() methodu oluşturularak yazdırılabilir.

     */

    String isim;
    double maas;
    int calismaSaati;
    int basYili;

    public String toString() {
        return "isim : " + isim +
                "\nmaas : " + maas +
                "\ncalismaSaati : " + calismaSaati +
                "\nbasYili : " + basYili;
    }

    Employee(String isim, double maas, int calismaSaati, int basYili) {

        this.isim = isim;
        this.basYili = basYili;
        this.maas = maas;
        this.calismaSaati = calismaSaati;

    }

    public void bonus() {
        if (calismaSaati>40){
            System.out.println("Bonus : "+(calismaSaati-40)*30+" TL");
        }
        else {
            System.out.println("Bonus : bonus yok");
        }
    }

    public void maasZammi() {
        if ((2023 - basYili)<10){
            System.out.println("Maaş arttırımı : "+ maas*0.05);
        } else if ((2023 - basYili)<20 ) {
            System.out.println("Maaş arttırımı : "+ maas*0.1);
        } else {
            System.out.println("Maaş arttırımı : "+ maas*0.15);
        }
    }

    public void vergi() {
        if(maas>1000){
            System.out.println("Vergi : "+ maas * 0.03);
        }else {
            System.out.println("Vergi : yok");
        }
    }
}
