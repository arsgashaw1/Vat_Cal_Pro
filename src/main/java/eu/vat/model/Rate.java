package eu.vat.model;

import java.util.List;

public class Rate {
	private String name;

	private String code;

	private String country_code;

	private List<Periods> periods;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setPeriods(List<Periods> periods) {
		this.periods = periods;
	}

	public List<Periods> getPeriods() {
		return this.periods;
	}

}
