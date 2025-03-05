package com.corejava.example.pattern.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
//		LunchOrderBean lunchOrderBean = new LunchOrderBean();
//		
//		lunchOrderBean.setBread("wheat");
//		lunchOrderBean.setCondiments("Lettuce");
//		lunchOrderBean.setDressings("Mustard");
//		lunchOrderBean.setMeat("Ham");
//		
//		System.out.println(lunchOrderBean.getBread());
//		System.out.println(lunchOrderBean.getCondiments());
//		System.out.println(lunchOrderBean.getDressings());
//		System.out.println(lunchOrderBean.getMeat());
		
//		LunchOrderBeanTelescoping lunchOrderBean = new LunchOrderBeanTelescoping("wheat", "Lettuce", "Mustard", "Ham");
//		
//		System.out.println(lunchOrderBean.getBread());
//		System.out.println(lunchOrderBean.getCondiments());
//		System.out.println(lunchOrderBean.getDressings());
//		System.out.println(lunchOrderBean.getMeat());
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("chapathi").condiments("Cabbage").dressings("ketchup").meat("chicken");
		LunchOrder lunchOrderBean = builder.build();		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressings());
		System.out.println(lunchOrderBean.getMeat());
		System.out.println("================================");
		LunchOrder.Builder builder2 = new LunchOrder.Builder();
		builder2.bread("chapathi").dressings("ketchup").meat("chicken");
		LunchOrder lunchOrderBean2 = builder2.build();
		System.out.println(lunchOrderBean2.getBread());
		System.out.println(lunchOrderBean2.getCondiments());
		System.out.println(lunchOrderBean2.getDressings());
		System.out.println(lunchOrderBean2.getMeat());
	}

}
