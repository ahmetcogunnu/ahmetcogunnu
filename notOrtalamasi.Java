- import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matematik , tarih , kimya ,turkce , muzik ;

        System.out.print("Lütfen Matematik Notunuzu Giriniz  :");
        matematik=scan.nextInt();
        System.out.print("Lütfen Tarih Notunuzu Giriniz  :");
        tarih=scan.nextInt();
        System.out.print("Lütfen kimya Notunuzu Giriniz  :");
        kimya=scan.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz  :");
        turkce=scan.nextInt();
        System.out.print("Lütfen Müzik Notunuzu Giriniz  :");
        muzik=scan.nextInt();

        int toplam = (matematik+tarih+kimya+turkce+muzik);

        double ortalama = toplam/5.0 ;
        System.out.println("ORTALAMANIZ " +ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız" ;
        System.out.println(sonuc);

    }
    }
