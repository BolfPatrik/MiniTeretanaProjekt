package moj.modul;

import java.util.List;

public class Trener extends Entitet{

	private String ime;
	private String prezime;
	private String oib;
	private String iban;
	private String placa;
	private String brojkartice;
	List<Polaznik> polaznik;
	public List<Polaznik> getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(List<Polaznik> polaznik) {
		this.polaznik = polaznik;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getBrojkartice() {
		return brojkartice;
	}
	public void setBrojkartice(String brojkartice) {
		this.brojkartice = brojkartice;
	}
	
	
}
