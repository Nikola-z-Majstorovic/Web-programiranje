package model;

import java.util.Date;

public class Vehicle {

	private String brand; //fiat
	private String model;//punto
	private Type type;
	private String register;
	private Date yearOfProduction;
	private boolean inUse;
	private String note;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String brand, String model, Type type, String register, Date yearOfProduction, boolean inUse,
			String note) {
		super();
		this.brand = brand;
		this.model = model;
		this.type= type;
		this.register = register;
		this.yearOfProduction = yearOfProduction;
		this.inUse = inUse;
		this.note = note;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type= type;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Date getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(Date yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	

}
