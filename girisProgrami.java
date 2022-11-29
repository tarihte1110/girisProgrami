import java.util.*;
public class girisProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        String kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("tarihte1110") && sifre.equals("123451905")) { //sadece string sınıfı için == ifadesi kullanılmaz.
            System.out.print("GİRİŞ BAŞARILI!");                              //onun yerine eşittir anlamına gelen ".equals" kullanılır.
        } else {
            System.out.print("GİRİŞ YAPILMADI!");

            if (kullaniciAdi.equals("tarihte1110") && sifre.equals("123451905")) {

            } else if (kullaniciAdi.equals("tarihte1110") || sifre.equals("123451905")) {
                System.out.println();

                if (kullaniciAdi.equals("tarihte1110")) {
                } else {
                    System.out.print("\nKullanıcı adınız hatalı lütfen tekrar deneyin.");
                }
                if (sifre.equals("123451905")) {
                } else {
                    System.out.print("\nŞifrenizi sıfırlamak ister misiniz?:");
                    String sıfırlama = input.nextLine();

                    if (sıfırlama.equals("evet")) {
                        System.out.print("Yeni şifrenizi giriniz:");
                        sifre = input.nextLine();

                        if (sifre.equals("123451905")) {
                            System.out.print("Şifre oluşturulamadı lütfen farklı bir şifre giriniz.");
                        } else {
                            System.out.print("Şifreniz başarıyla oluşturuldu.");
                        }
                    } else if (sıfırlama.equals("hayır")) {
                        System.out.print("Giriş yapılamadı.Şifenizi tekrardan girmeyi deneyin.");
                    } else {
                        System.out.print("lütfen cevabınızı evet ya da hayır şeklinde girin. ");
                    }
                }


            }else System.out.println(" BİLGİLER HATALI.");

        }


    }
}
