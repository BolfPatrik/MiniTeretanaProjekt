package moj.modul;

import java.math.BigDecimal;

public class Trening extends Entitet{

	private String naziv;
	private String vrijemepocetka;
	private String vrijemekraja;
	private BigDecimal cijena;
	private Trener trener;
	private Polaznik polaznik;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getVrijemepocetka() {
		return vrijemepocetka;
	}
	public void setVrijemepocetka(String vrijemepocetka) {
		this.vrijemepocetka = vrijemepocetka;
	}
	public String getVrijemekraja() {
		return vrijemekraja;
	}
	public void setVrijemekraja(String vrijemekraja) {
		this.vrijemekraja = vrijemekraja;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public Trener getTrener() {
		return trener;
	}
	public void setTrener(Trener trener) {
		this.trener = trener;
	}
	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}
	
	
	
}
