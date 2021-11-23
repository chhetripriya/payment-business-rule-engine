package com.company.payment;

import com.company.product.Product;

public class BookPayment extends Payment {

	@Override
	public void processPayment(Product product) {

		System.out.println("Start payment processing for " + product.getName());
		System.out.println("Processing payment for book.");
		System.out.println("Genarated slip for payment.");

		generateDuplicateSlip(product);
		generateCommisionPayment(product);

		System.out.println("Completed payment processing.");
		System.out.println();

	}

	private void generateCommisionPayment(Product product) {
		System.out.println("Generate Commision for agent.");

		// commison calculation logic
		double commision = 0;
		if (product.getPrice() > 0) {
			commision = product.getPrice() * 0.05;
		}

		System.out.println("Commision for agent" + commision);

	}

	private void generateDuplicateSlip(Product product) {
		System.out.println("Generated duplicate slip for royalty department.");
	}

}
