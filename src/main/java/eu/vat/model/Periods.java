package eu.vat.model;

import java.util.Date;

public class Periods {

	private Date effective_from;

	private Rates rates;

	public void setEffective_from(Date effective_from) {
		this.effective_from = effective_from;
	}

	public Date getEffective_from() {
		return this.effective_from;
	}

	public void setRates(Rates rates) {
		this.rates = rates;
	}

	public Rates getRates() {
		return this.rates;
	}
}