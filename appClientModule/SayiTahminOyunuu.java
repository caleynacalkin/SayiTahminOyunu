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
		System.out.println("Say� Tahmin Oyununa Ho�geldiniz");
		System.out.println("0-99 aras�nda bir say� tuttum :)");
		
		while(can>0) {
			System.out.print("Tahmininiz: ");
			tahmin=scan.nextInt();
			
			if((tahmin<0) || (tahmin>99)) {
				if(hata) {
					System.out.println("�ok fazla hatal� giri� yapt�n�z 1 can kaybettiniz.");
					System.out.println("Kalan can: "+--can);
				} else {
					hata=true;
					System.out.println("L�tfen 0-99 aras� bir say� giriniz.");
				}
				continue;
			}
			tahminler[i++]=tahmin;
			if (tahmin==sayi) {
				oyunDurum=true;
				break;
			} else {
				System.out.println("Yanl��, tekrar deneyiniz. Kalan can: "+ --can);
			}
		}
		if(oyunDurum) {
			System.out.println("Tebrikler, do�ru tahmin :)");
			System.out.println("Say�m�z: "+sayi);
			System.out.println("Kalan can: "+can);
		}

	}

}
