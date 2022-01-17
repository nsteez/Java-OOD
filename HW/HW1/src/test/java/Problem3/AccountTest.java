package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private Account testAccount, testAccount2;
    private Amount testAccountBalance1;
    private Amount testAccountBalance2;

    @Before
    public void setUp() throws Exception {
        testAccountBalance1 = new Amount(7, 99);
        testAccount = new Account("Lisa", "Simpson", testAccountBalance1);
        testAccountBalance2 = new Amount(1,1);
        testAccount2 = new Account("Maggie","Simpson", testAccountBalance2);
    }

    @Test
    public void getFirstName() {
        assertEquals("Lisa", testAccount.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Simpson", testAccount.getLastName());
    }

    @Test
    public void deposit() {
        Amount depositAmount = new Amount(5,21);
        Account newBalanceAccount = testAccount.deposit(depositAmount);
        Amount newBalance = newBalanceAccount.getAccountBalance();
        assertEquals(13, newBalance.getDollar());
        assertEquals(20, newBalance.getCent());

        depositAmount = new Amount(5, 0);
        newBalanceAccount = testAccount.deposit(depositAmount);
        newBalance = newBalanceAccount.getAccountBalance();
        assertEquals(12, newBalance.getDollar());
        assertEquals(99, newBalance.getCent());
    }

    @Test
    public void withdraw() {
        Amount withdrawAmount = new Amount(0,21);
        Account newBalanceAccount = testAccount2.withdraw(withdrawAmount);
        Amount newBalance = newBalanceAccount.getAccountBalance();
        assertEquals(0, newBalance.getDollar());
        assertEquals(80, newBalance.getCent());

        withdrawAmount = new Amount(1, 0);
        newBalanceAccount = testAccount2.withdraw(withdrawAmount);
        newBalance = newBalanceAccount.getAccountBalance();
        assertEquals(0, newBalance.getDollar());
        assertEquals(1, newBalance.getCent());
    }

    @Test
    public void getAccountBalance() {
        assertEquals(testAccountBalance1, testAccount.getAccountBalance());
        assertEquals(testAccountBalance2, testAccount2.getAccountBalance());
    }
}