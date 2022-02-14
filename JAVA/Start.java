package edunova.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edunova.utility.Unos;
import moj.modul.Polaznik;
import moj.modul.Trener;
import moj.modul.Trening;

public class Start {
	
	private List<Trener> treneri;
	private Trener trener;
	private List<Polaznik> polaznici;
	private Polaznik polaznik;
	private List<Trening> treninzi;
	private Trening trening;
	private Scanner ulaz;
	
	public Start() {
		treneri = new ArrayList<>();
		polaznici = new ArrayList<>();
		treninzi = new ArrayList<>();
		ulaz = new Scanner(System.in);
		naslov();
		glavniIzbornik();
		ulaz.close();		
	}

	private void glavniIzbornik() {
		System.out.println("1. Rad s trenerima");
		System.out.println("2. Rad s polaznicima");
		System.out.println("3. Rad s treninzima");
		System.out.println("4. Kraj rada");
		switch(Unos.unesiInt(ulaz, "Odaberi", 1,4)) {
		case 1 -> trenerIzbornik();
		case 2 -> polaznikIzbornik();
		case 3 -> treningIzbornik();
		}
		
	}

	private void treningIzbornik() {
		System.out.println("1. Pregled treninga");
		System.out.println("2. Unos novog treninga");
		System.out.println("3. Promjena treninga");
		System.out.println("4. Brisanje treninga");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(ulaz, "Odaberi", 1, 5)) {
		case 1 -> treningPregled();
		case 2 -> treningUnos();
		case 3 -> treningPromjena();
		case 4 -> treningBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void treningBrisanje() {
		treninzi.remove(Unos.unesiInt(ulaz, "Odaberi redni broj treninga kojeg želiš maknuti")-1);
		treningIzbornik();
	}

	private void treningPromjena() {
		int i = Unos.unesiInt(ulaz, "Unesi redni broj treninga kojeg želiš mijenjati");
		trening = treninzi.get(i-1);
		trening.setNaziv(Unos.unesiString(ulaz, "Promjeni naziv (" + trening.getNaziv() + ")"));
		treningIzbornik();
	}

	private void treningUnos() {
		Trening t = new Trening();
		t.setNaziv(Unos.unesiString(ulaz, "Unesi naziv"));
		t.setVrijemepocetka(Unos.unesiString(ulaz, "Unesi vrijeme pocetka"));
		t.setVrijemekraja(Unos.unesiString(ulaz, "Unesi vrijeme kraja"));
		t.setCijena(Unos.unesiBigDecimal(ulaz, "Unesi cijenu"));
		treninzi.add(t);
		treningIzbornik();
	}

	private void treningPregled() {
		for(Trening t:treninzi) {
			System.out.println(t);
		}
		treningIzbornik();
		
	}

	private void polaznikIzbornik() {
		System.out.println("1. Pregled polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena polaznika");
		System.out.println("4. Brisanje polaznika");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(ulaz, "Odaberi", 1, 5)) {
		case 1 -> polaznikPregled();
		case 2 -> polaznikUnos();
		case 3 -> polaznikPromjena();
		case 4 -> polaznikBrisanje();
		case 5 -> glavniIzbornik();
	}
	}
	private void polaznikBrisanje() {
		polaznici.remove(Unos.unesiInt(ulaz, "Odaberi redni broj polaznika kojeg želiš maknuti")-1);
		polaznikIzbornik();
	}

	private void polaznikPromjena() {
		int i = Unos.unesiInt(ulaz, "Unesi redni broj polaznika kojeg želiš mijenjati");
		polaznik = polaznici.get(i-1);
		polaznik.setIme(Unos.unesiString(ulaz, "Promjeni ime (" + polaznik.getIme() + ")"));
		polaznik.setPrezime(Unos.unesiString(ulaz, "Promjeni prezime (" + polaznik.getPrezime() + ")"));
		polaznikIzbornik();
	}

	private void polaznikPregled() {
		for(Polaznik p:polaznici) {
			System.out.println(p);
		}
		polaznikIzbornik();
		
	}

	private void polaznikUnos() {
	Polaznik p = new Polaznik();
	p.setIme(Unos.unesiString(ulaz, "Unesi ime"));
	p.setPrezime(Unos.unesiString(ulaz, "Unesi prezime"));
	p.setOib(Unos.unesiString(ulaz, "Unesi Oib"));
	p.setBrojkartice(Unos.unesiString(ulaz, "Unesi broj kartice"));
	polaznici.add(p);
	polaznikIzbornik();
	}

	private void trenerIzbornik() {
		System.out.println("1. Pregled trenera");
		System.out.println("2. Unos novog trenera");
		System.out.println("3. Promjena trenera");
		System.out.println("4. Brisanje trenera");
		System.out.println("5. Povratak na glavni izbornik");
		switch (Unos.unesiInt(ulaz, "Odaberi", 1, 5)) {
		case 1 -> trenerPregled();
		case 2 -> trenerUnos();
		case 3 -> trenerPromjena();
		case 4 -> trenerBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void trenerBrisanje() {
		treneri.remove(Unos.unesiInt(ulaz, "Odaberi redni broj trenera kojeg želiš maknuti")-1);
		trenerIzbornik();
		
	}

	private void trenerPromjena() {
		int i = Unos.unesiInt(ulaz, "Unesi redni broj trenera kojeg želiš mijenjati");
		trener = treneri.get(i-1);
		trener.setIme(Unos.unesiString(ulaz, "Promjeni ime (" + trener.getIme() + ")"));
		trener.setPrezime(Unos.unesiString(ulaz, "Promjeni prezime (" + trener.getPrezime() + ")"));
		trenerIzbornik();
		
	}

	private void trenerUnos() {
		Trener t = new Trener();
		t.setIme(Unos.unesiString(ulaz, "Unesi ime"));
		t.setPrezime(Unos.unesiString(ulaz, "Unesi prezime"));
		t.setOib(Unos.unesiString(ulaz, "Unesi oib"));
		t.setIban(Unos.unesiString(ulaz, "Unesi iban"));
		t.setPlaca(Unos.unesiBigDecimal(ulaz, "Unesi plaću"));
		t.setBrojkartice(Unos.unesiString(ulaz, "Unesi broj kartice"));
		treneri.add(t);
		trenerIzbornik();
	}

	private void trenerPregled() {
		for(Trener t: treneri) {
			System.out.println(t);
		}
		trenerIzbornik();
	}

	private void naslov() {
		System.out.println("*************************");
		System.out.println("******* Teretana ********");
		System.out.println("*************************");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
