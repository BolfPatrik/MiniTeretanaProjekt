package teretana.vjezbanje;

import javax.persistence.Entity;


@Entity
public class Polaznik extends Entitet{
	
    
        private String ime;
	private String prezime;
	private String oib;
	private String brojkartice;
        

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
	public String getBrojkartice() {
		return brojkartice;
	}
	public void setBrojkartice(String brojkartice) {
		this.brojkartice = brojkartice;
	}
	


}

