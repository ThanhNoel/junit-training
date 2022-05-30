package junit5.api.fixture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit5.model.BankAccount;

/**
 * The purpose of test fixture is avoid code duplication
 */	
public class TestFixtureTests {
    private BankAccount account;


    @BeforeEach
    public void setUp() {
        account = new BankAccount(10);
    }

    @AfterEach
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(2);
        int expected = 12;
        assertEquals(expected, account.getBalance());
    }
    
    @Test
    public void testDepositMultipleTimes() {
    	account.deposit(2);
    	account.deposit(3);
        int expected = 15;
        assertEquals(expected, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(3);
        int expected = 7;
        assertEquals(expected, account.getBalance());
    }
    
    @Test
    public void testWithdrawMultipleTimes() {
        account.withdraw(3);
        account.withdraw(1);
        account.withdraw(4);
        int expected = 2;
        assertEquals(expected, account.getBalance());
    }
    
    @Test
    public void testDepositWithWithdrawn() {
    	account.deposit(2);
        account.withdraw(1);
        int expected = 11;
        assertEquals(expected, account.getBalance());
    }
}
