package com.company.application;

import java.util.ArrayList;
import java.util.List;

import com.company.payment.BookPayment;
import com.company.payment.MemberShipPayment;
import com.company.payment.Payment;
import com.company.product.Book;
import com.company.product.MemberShip;
import com.company.product.Product;
import com.company.product.VideoTutorial;

public class Application {

	private static Payment bookPayment = new BookPayment();
	private static Payment membershipPayment = new MemberShipPayment();

	public static void main(String[] args) {

		Product book = new Book("The Book", "BOOK", 500);
		Product memberShip = new MemberShip("ABC Membership", "MEMBERSHIP", 1000);
		Product videoTutorial = new VideoTutorial("Learn SKI video", "VIDEO", 1500);

		List<Product> productList = new ArrayList<Product>();
		productList.add(book);
		productList.add(memberShip);
		productList.add(videoTutorial);
		
		processPaymentForProducts(productList);

	}

	private static void processPaymentForProducts(List<Product> productList) {

		for (Product product : productList) {
			if (product.getType() == "BOOK") {
				bookPayment.processPayment(product);
			}else if (product.getType() == "MEMBERSHIP") {
				membershipPayment.processPayment(product);
				
			} 
//			else if (product.getType() == " VIDEO") {
//				System.out.println("Implement payment for video tutorial.");
//			}
			else {
				System.out.println("Implement payment for product."+ product);
			}
		}

	}

}
