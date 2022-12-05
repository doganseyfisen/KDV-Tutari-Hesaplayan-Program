import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {

    double fiyat, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutar, kdvliFiyat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Fiyat giriniz: ");
		fiyat = input.nextDouble();
		
		if(fiyat <= 1000) {
		
    kdvTutar = fiyat * kdvOran1;
		kdvliFiyat = fiyat + kdvTutar;
		
		System.out.println("KDV'siz Fiyat: " + fiyat);
		System.out.println("KDV Oranı: " + kdvOran1);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("KDV'li Fiyat: " + kdvliFiyat);
		} else {
		
    kdvTutar = fiyat * kdvOran2;
		kdvliFiyat = fiyat + kdvTutar;
		
		System.out.println("KDV'siz Fiyat: " + fiyat);
		System.out.println("KDV Oranı: " + kdvOran2);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("KDV'li Fiyat: " + kdvliFiyat);
		}

	}
}
