package com.corejava.example.pattern.builder;

public class LunchOrderBeanTelescoping {
	private String bread;
	private String condiments;
	private String dressings;
	private String meat;
	
	public LunchOrderBeanTelescoping(String bread){
		this.bread = bread;
	}
	
	public LunchOrderBeanTelescoping(String bread, String condiments){
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderBeanTelescoping(String bread, String condiments, String dressings){
		this(bread, condiments);
		this.dressings = dressings;
	}
	
	public LunchOrderBeanTelescoping(String bread, String condiments, String dressings, String meat){
		this(bread, condiments, dressings);
		this.meat = meat;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getDressings() {
		return dressings;
	}
	
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	
}
