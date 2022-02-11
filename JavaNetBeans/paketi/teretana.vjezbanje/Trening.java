package teretana.vjezbanje;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Trening {

    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int sifra;
        
     @Column(columnDefinition = "varchar(50)")
	private String naziv;
	private String vrijemepocetka;
	private String vrijemekraja;
	private BigDecimal cijena;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }
        
        
        
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
	
	
	
	
	
}
