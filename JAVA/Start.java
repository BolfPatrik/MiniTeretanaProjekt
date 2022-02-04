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
	private List<Polaznik> polaznici;
	private List<Trening> treninzi;
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
		
	}

	private void polaznikIzbornik() {
		
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
		
	}

	private void trenerPromjena() {
		
	}

	private void trenerUnos() {
		
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
