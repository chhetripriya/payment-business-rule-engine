package com.company.payment;

import com.company.product.Product;

public class MemberShipPayment extends Payment {

	@Override
	public void processPayment(Product product) {
		System.out.println("Start processing payment for membership activation for product " + product.getName());

		activateMembership(product);
		notifyOwner(product);

		System.out.println("Completed payment for membership activation for product " + product.getName());
		System.out.println();

	}

	private void activateMembership(Product product) {
		// logic for activation
		System.out.println("Member ship activated for " + product.getName());
	}

	private void notifyOwner(Product product) {
		System.out.println("Send email, activated product " + product.getName());
	}

}
