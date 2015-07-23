package json.app.interview;


import javax.persistence.*;

@Entity
@Table(name="tabela_testowa")
public class TabelaTestowa {
	

	@Id
	private Long id;

	private String kolumna1;

	private String kolumna2;

	private String kolumna3;

	private Long kolumna4;

	public TabelaTestowa() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKolumna1() {
		return this.kolumna1;
	}

	public void setKolumna1(String kolumna1) {
		this.kolumna1 = kolumna1;
	}

	public String getKolumna2() {
		return this.kolumna2;
	}

	public void setKolumna2(String kolumna2) {
		this.kolumna2 = kolumna2;
	}

	public String getKolumna3() {
		return this.kolumna3;
	}

	public void setKolumna3(String kolumna3) {
		this.kolumna3 = kolumna3;
	}

	public Long getKolumna4() {
		return this.kolumna4;
	}

	public void setKolumna4(Long kolumna4) {
		this.kolumna4 = kolumna4;
	}

}