package com.sapient.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numberTest {
	
	@Test
	void checkPrimeReturnTrue() {
		assertEquals(true, number.checkPrime(5));
	}
	
	@Test
	void checkPrimeReturnFalse() {
		assertEquals(false, number.checkPrime(4));
	}
	
	@Test
	void checkPrimeShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			number.checkPrime(-1);
		});
	}
	
	@Test
	void checkAmstrongReturnTrue() {
		assertEquals(true, number.checkAmstrong(153));
	}
	
	@Test
	void checkAmstrongReturnFalse() {
		assertEquals(false, number.checkAmstrong(345));
	}
	
	@Test
	void checkAmstrongShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			number.checkAmstrong(-10);
		});
	}
	
	@Test
	void checkPolindromReturnTrue() {
		assertEquals(true, number.checkPolindrom(12321));
	}
	
	@Test
	void checkPolindromReturnFalse() {
		assertEquals(false, number.checkPolindrom(3456));
	}
	
	@Test
	void checkPolindromShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			number.checkPolindrom(-2367);
		});
	}
	
}
