package eu.vat.model;

import java.util.List;

public class Root {

	private String details;

	private String version;

	private List<Rate> rates;

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDetails() {
		return this.details;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return this.version;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public List<Rate> getRates() {
		return this.rates;
	}
}
