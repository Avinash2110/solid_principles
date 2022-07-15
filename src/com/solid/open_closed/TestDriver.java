package com.solid.open_closed;

public class TestDriver {
	
	public static void main(String[] args) {
		Subscriber ps = new PhoneSubscriber("John", 37384738, "London", 146);
		System.out.println(ps.calculateBill());
		
		Subscriber is = new InternetSubscriber("Cindy", 3783838, "Brisbane", 146);
		System.out.println(is.calculateBill());
	}

}
