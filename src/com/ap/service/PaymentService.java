package com.ap.service;

import java.util.Scanner;

import com.ap.entity.PaymentMethod;

public class PaymentService {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		PaymentFactory paymentFactory = new PaymentFactory();
		while(true)
		{
			System.out.println("Enter one of the payment option");
			System.out.println("1. Netbanking");
			System.out.println("2. UPIbanking");
			System.out.println("3. Phonebanking");
			System.out.print("Type your option :");
			String paymentType;
			paymentType=scanner.nextLine();
			PaymentMethod upiBankingObject = paymentFactory.createPaymentMethod(paymentType);
			System.out.println("payment Method Selected is  :");upiBankingObject.notifyUser();
			System.out.println("\n\n");

		}
				

	}

}
