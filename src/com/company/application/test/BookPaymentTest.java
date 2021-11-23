package com.company.application.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.company.payment.BookPayment;
import com.company.product.Book;
import com.company.product.Product;

public class BookPaymentTest {

	private BookPayment bookPayment = new BookPayment();
	private Product product = new Book("The Book", "BOOK", 500);

	@Test
	public void generateCommisionPaymentTest() {
		double commission = bookPayment.generateCommisionPayment(product);
		double expected = 25.0;
		assertEquals(expected, commission, 0);
	}
}
