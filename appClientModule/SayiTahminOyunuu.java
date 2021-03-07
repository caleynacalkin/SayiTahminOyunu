import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tahmin, can=5, i=0;
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int sayi=rand.nextInt(100);
		boolean oyunDurum=false, hata=false;
		int [] tahminler=new int[5];
		System.out.println(sayi);
		System.out.println("Sayý Tahmin Oyununa Hoþgeldiniz");
		System.out.println("0-99 arasýnda bir sayý tuttum :)");
		
		while(can>0) {
			System.out.print("Tahmininiz: ");
			tahmin=scan.nextInt();
			
			if((tahmin<0) || (tahmin>99)) {
				if(hata) {
					System.out.println("Çok fazla hatalý giriþ yaptýnýz 1 can kaybettiniz.");
					System.out.println("Kalan can: "+--can);
				} else {
					hata=true;
					System.out.println("Lütfen 0-99 arasý bir sayý giriniz.");
				}
				continue;
			}
			tahminler[i++]=tahmin;
			if (tahmin==sayi) {
				oyunDurum=true;
				break;
			} else {
				System.out.println("Yanlýþ, tekrar deneyiniz. Kalan can: "+ --can);
			}
		}
		if(oyunDurum) {
			System.out.println("Tebrikler, doðru tahmin :)");
			System.out.println("Sayýmýz: "+sayi);
			System.out.println("Kalan can: "+can);
		}

	}

}
