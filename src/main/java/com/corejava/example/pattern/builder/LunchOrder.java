package com.corejava.example.pattern.builder;

public class LunchOrder {
	private final String bread;
	private final String condiments;
	private final String dressings;
	private final String meat;
	
	public static class Builder{
		private String bread;
		private String condiments;
		private String dressings;
		private String meat;
		
		//To force some initialization we can have parameterized constructor
		public Builder() {}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		public Builder dressings(String dressings) {
			this.dressings = dressings;
			return this;
		}
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	
	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressings = builder.dressings;
		this.meat = builder.meat;
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
	
	
	
}
