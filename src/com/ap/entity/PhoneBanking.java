package com.ap.entity;

public class PhoneBanking implements PaymentMethod {

	@Override
	public void notifyUser() {
		System.out.println("Phone Banking User");		
	}
	

}
