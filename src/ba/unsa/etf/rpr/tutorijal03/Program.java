package ba.unsa.etf.rpr.tutorijal03;

import java.util.Map;
import java.util.Scanner;

import  static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

	public FiksniBroj unesiFiksniBroj(){
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		String redniBrojGrada = ulaz.nextLine();
		FiksniBroj fiksniBroj = new FiksniBroj(FiksniBroj.Grad.valueOf(redniBrojGrada), s);
		return fiksniBroj;
	}

	public MobilniBroj unesiMobilniBroj() {
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		int mobilnaMreza = ulaz.nextInt();
		MobilniBroj mobilniBroj = new MobilniBroj(mobilnaMreza, s);
		return mobilniBroj;
	}

	public MedunarodniBroj unesiMedunarodniBroj() {
		Scanner ulaz = new Scanner(System.in);
		String s = ulaz.nextLine();
		String drzava = ulaz.nextLine();
		MedunarodniBroj medunarodniBroj = new MedunarodniBroj(drzava, s);
		return medunarodniBroj;
	}

    public static void main(String[] args) {






    }
}
