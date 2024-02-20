import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        double boy, kilo, vucutKitleIndeksi;

        // Scanner nesnemizi projemize dahil ettik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan boy bilgisi alinip ilgili degiskene atandi.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        // Kullanicidan kilo bilgisi alinip ilgili degiskene atildi.
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        // Vucut kitle indeksi icin gerekli matematiksel islem gerceklestirildi.
        vucutKitleIndeksi = kilo / (boy * boy);

        // Vucut kitle indeksi sonucu kullanici ile paylasildi.
        System.out.print("Vücut Kitle İndeksiniz :" + vucutKitleIndeksi);
    }
}