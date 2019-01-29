package project.nc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Porudzbina {

	@Id
	@GeneratedValue
	public Long merchantOrderId;

	@Column
	private String merchantId;

	@Column
	private String merchantPassword;

	@Column
	private String amount;

	@Column
	private String valuta;

	@Column
	private Date merchantTimestamp;
	
	@ManyToMany(mappedBy = "porudzbine")
    @JsonIgnore
    private List<Casopis> casopisi;
	
	@ManyToMany(mappedBy = "porudzbine")
    @JsonIgnore
    private List<Rad> radovi;

	public Porudzbina() {
		super();
	}

	public Porudzbina(String merchantId, String merchantPassword, String amount, Date merchantTimestamp,
			String valuta) {
		super();
		this.merchantId = merchantId;
		this.merchantPassword = merchantPassword;
		this.amount = amount;
		this.merchantTimestamp = merchantTimestamp;
		this.valuta = valuta;
	}

	public Long getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(Long merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getMerchantTimestamp() {
		return merchantTimestamp;
	}

	public void setMerchantTimestamp(Date merchantTimestamp) {
		this.merchantTimestamp = merchantTimestamp;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

}
