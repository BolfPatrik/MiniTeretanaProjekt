package teretana.vjezbanje;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Trener extends Entitet{
   
	private String ime;
	private String prezime;
	private String oib;
	private String iban;
	private BigDecimal placa;
	private String brojkartice;
        
        @ManyToMany
        private List<Polaznik> polaznici;

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

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
	
	
	
	
	
	
}

