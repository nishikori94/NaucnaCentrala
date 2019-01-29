package project.nc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	public String naziv;

	@Column
	public String nazivAutora;

	@Column
	private String cena;

	@ManyToOne
	public Casopis casopis;
	
	@ManyToMany(targetEntity=Porudzbina.class)
	@JoinTable(name = "porudzbine_radova", joinColumns = @JoinColumn(name = "rad_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "porudzbina_id", referencedColumnName = "merchantOrderId"))
	@JsonIgnore
	public List<Porudzbina> porudzbine;
	
	public Rad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rad(Long id, String naziv, String nazivAutora, String cena) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.nazivAutora = nazivAutora;
		this.cena = cena;
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

	public String getNazivAutora() {
		return nazivAutora;
	}

	public void setNazivAutora(String nazivAutora) {
		this.nazivAutora = nazivAutora;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

}
