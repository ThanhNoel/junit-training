package junit5.api.fixture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit5.model.BankAccount;

public class WithoutFixtureTests {
	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount(10); // code duplication

		account.deposit(2);
		int expected = 12;
		assertEquals(expected, account.getBalance());
	}

	@Test
	public void testDepositMultipleTimes() {
		BankAccount account = new BankAccount(10); // code duplication
		account.deposit(2);
		account.deposit(3);
		int expected = 15;
		assertEquals(expected, account.getBalance());
	}

	@Test
	public void testWithdraw() {
		BankAccount account = new BankAccount(10); // code duplication
		account.withdraw(3);
		int expected = 7;
		assertEquals(expected, account.getBalance());
	}

	@Test
	public void testWithdrawMultipleTimes() {
		BankAccount account = new BankAccount(10); // code duplication
		account.withdraw(3);
		account.withdraw(1);
		account.withdraw(4);
		int expected = 2;
		assertEquals(expected, account.getBalance());
	}

	@Test
	public void testDepositWithWithdrawn() {
		BankAccount account = new BankAccount(10); // code duplication
		account.deposit(2);
		account.withdraw(1);
		int expected = 11;
		assertEquals(expected, account.getBalance());
	}
}
