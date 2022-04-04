package com.ap.service;

import com.ap.entity.NetBanking;
import com.ap.entity.PaymentMethod;
import com.ap.entity.PhoneBanking;
import com.ap.entity.UPIBanking;

public class PaymentFactory {
	public PaymentMethod createPaymentMethod(String paymentType)
	{
		if(paymentType.equals(null) || paymentType.isEmpty())
			return null;
		else if(paymentType.equalsIgnoreCase("NetBanking"))
			return new NetBanking();
		else if(paymentType.equalsIgnoreCase("UPIBanking"))
			return new UPIBanking();
		else if(paymentType.equalsIgnoreCase("PhoneBanking"))
			return new PhoneBanking();
		else
			throw new IllegalArgumentException();
		
	}

}
