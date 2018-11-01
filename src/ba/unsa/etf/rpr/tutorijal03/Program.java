package ba.unsa.etf.rpr.tutorijal03;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import  static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

	public static FiksniBroj unesiFiksniBroj(){
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		String redniBrojGrada = ulaz.nextLine();
		FiksniBroj fiksniBroj = new FiksniBroj(FiksniBroj.Grad.valueOf(redniBrojGrada), s);
		return fiksniBroj;
	}

	public static MobilniBroj unesiMobilniBroj() {
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		int mobilnaMreza = ulaz.nextInt();
		MobilniBroj mobilniBroj = new MobilniBroj(mobilnaMreza, s);
		return mobilniBroj;
	}

	public static MedunarodniBroj unesiMedunarodniBroj() {
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		String drzava = ulaz.nextLine();
		MedunarodniBroj medunarodniBroj = new MedunarodniBroj(drzava, s);
		return medunarodniBroj;
	}

    public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		Imenik imenik = new Imenik();

		System.out.println("Izaberite opciju (0 za kraj): \n" +
				"1. Unesite fiksni broj: \n" +
				"2. Unesite mobilni broj: \n" +
				"3. Unesite medunarodni broj: \n" +
				"4. Dodaj broj u imenik: \n" +
				"5. Nadji broj osobe: \n" +
				"6. Nadjite brojeve imena koji pocinju sa slovom: \n" +
				"7. Imena osoba iz grada: \n" +
				"8. Brojevi osoba iz grada: \n");
 	for (;;) {

	 	int izborUsluge = ulaz.nextInt();
	 		if (izborUsluge == 0) {
					break;
	 			}
			else if (izborUsluge == 1) {
				FiksniBroj fiksniBroj = unesiFiksniBroj();
				}
			else if (izborUsluge == 2) {
				MobilniBroj mobilniBroj = unesiMobilniBroj();
				}
			else if (izborUsluge == 3) {
				MedunarodniBroj medunarodniBroj = unesiMedunarodniBroj();
			}
			else if (izborUsluge == 4) {
				Scanner ulaz2 = new Scanner(System.in);
				String s = ulaz2.nextLine();
				FiksniBroj fiksniBroj = unesiFiksniBroj();
				imenik.dodaj(s, fiksniBroj);
			}
			else if (izborUsluge == 5) {
				Scanner ulaz2 = new Scanner(System.in);
				String s = ulaz2.nextLine();
				imenik.dajBroj(s);
			}
			else if (izborUsluge == 6) {
				Scanner ulaz2 = new Scanner(System.in);
				String c = ulaz2.nextLine();
				String naSlovo = imenik.naSlovo(c.charAt(0));

			}
			else if (izborUsluge == 7) {
				Scanner ulaz2 = new Scanner(System.in);
				int redniBrojGrada = ulaz2.nextInt();
				Set<String> brojeviIzGrada = imenik.izGrada(FiksniBroj.Grad.valueOf(String.valueOf(redniBrojGrada)));
			}
			else if (izborUsluge == 8) {
				Scanner ulaz2 = new Scanner(System.in);
				int redniBrojGrada = ulaz2.nextInt();
				Set<TelefonskiBroj> brojeviIzGrada = imenik.izGradaBrojevi(FiksniBroj.Grad.valueOf(String.valueOf(redniBrojGrada)));
			}
 		}
    }
}
