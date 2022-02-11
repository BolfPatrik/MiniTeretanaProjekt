package teretana.vjezbanje;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trener {

        @Id
        private int sifra;    
	private String ime;
	private String prezime;
	private String oib;
	private String iban;
	private BigDecimal placa;
	private String brojkartice;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
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
	public BigDecimal getPlaca() {
		return placa;
	}
	public void setPlaca(BigDecimal placa) {
		this.placa = placa;
	}
	public String getBrojkartice() {
		return brojkartice;
	}
	public void setBrojkartice(String brojkartice) {
		this.brojkartice = brojkartice;
	}
	
	
	
	
	
	
}
