package teretana.vjezbanje;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;



@Entity
public class Trening extends Entitet{

	private String naziv;
	private String vrijemepocetka;
	private String vrijemekraja;
	private BigDecimal cijena;
        @ManyToOne
        private Polaznik polaznik;
        
        @ManyToOne
        private Trener Trener;

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

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public Trener getTrener() {
        return Trener;
    }

    public void setTrener(Trener Trener) {
        this.Trener = Trener;
    }
	
	
	
	
	
}
