package project.nc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Casopis implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2846811937118619185L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	public String naziv;

	@Column
	public String merchantId;

	@Column
	public String merchantPassword;

	@Column
	private String cena;

	@Column
	private String valuta;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "casopis", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Rad> radovi;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "casopis")
	@JsonIgnore
	public Racun racun;
	
	@ManyToMany(targetEntity=Porudzbina.class)
	@JoinTable(name = "porudzbine_casopisa", joinColumns = @JoinColumn(name = "casopis_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "porudzbina_id", referencedColumnName = "merchantOrderId"))
	@JsonIgnore
	public List<Porudzbina> porudzbine;

	public Casopis() {
		super();
	}

	public Casopis(String naziv, String merchantId, String merchantPassword, String cena, String valuta) {
		super();
		this.naziv = naziv;
		this.merchantId = merchantId;
		this.merchantPassword = merchantPassword;
		this.cena = cena;
		this.valuta = valuta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantPassword() {
		return merchantPassword;
	}

	public void setMerchantPassword(String merchantPassword) {
		this.merchantPassword = merchantPassword;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

}
