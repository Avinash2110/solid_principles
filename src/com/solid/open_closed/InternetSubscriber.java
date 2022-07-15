package com.solid.open_closed;


/**
 * 
 * @author avinashshukla
 *
 */

//Here we are just adding new subscriber by adding a child class for subscriber
public class InternetSubscriber extends Subscriber{

	public InternetSubscriber(String name, long phoneNo, String address, int amount) {
		super(name, phoneNo, address, amount);
		// TODO Auto-generated constructor stub
	}

	
	//Overriding the calculate bill for Internet Subscriber
	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return this.getAmount()+40;
	}

}
