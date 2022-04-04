package com.ap.entity;

public class UPIBanking implements PaymentMethod {

	@Override
	public void notifyUser() {
		System.out.println("UPI Banking User");
		
	}

}
