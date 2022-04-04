package com.ap.entity;

public class NetBanking implements PaymentMethod {

	@Override
	public void notifyUser() {
		System.out.println("Net Banking User");
		
	}

}
