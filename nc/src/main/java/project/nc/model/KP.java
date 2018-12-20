package project.nc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class KP {

	@Id
	@GeneratedValue
	public Long id;
	
	@Column(nullable = false, length = 120)
	public String naziv;
			
	@Column(nullable = false, length = 120)
	private String adresa;
	
}
