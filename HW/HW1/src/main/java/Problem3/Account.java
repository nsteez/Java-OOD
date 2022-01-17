package Problem3;

public class Account {
    private String firstName, lastName;
    private Amount accountBalance;

    /**
     * Constructor that creates a new Account object with specified firstName, lastName, and accountBalance.
     * @param firstName - firstName of the Account Object..
     * @param lastName - lastName of the Account Object..
     * @param accountBalance - the accountBalance of the Account Object.
     */
    public Account(String firstName, String lastName, Amount accountBalance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;

    }

    /**
     *Returns the firstName of the Account.
     * @return the firstName of the Account
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *Returns the lastName of the Account
     * @return the lastName of the Account
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Returns adds a depositAmount to a new Account Object.
     * @param depositAmount - an amount to deposit in Account
     * @return a new Account with current value.
     */
    public Account deposit(Amount depositAmount){
       int depositCents = depositAmount.getCent();
       int depositDollars = depositAmount.getDollar();

       int newCents = this.accountBalance.getCent() + depositCents;
       int newDollar = this.accountBalance.getDollar() + depositDollars;
       if (newCents > 99) {
           newCents -= 100;
           newDollar +=1;
       }
            return new Account(this.firstName, this.lastName, new Amount(newDollar, newCents));
        }

    /**
     * Returns adds a withdrawAmount to a new Account Object.
     * @param withdrawAmount - an amount to withdraw in Account
     * @return a new Account with current value.
     */
    public Account withdraw(Amount withdrawAmount){
        int withdrawCents = withdrawAmount.getCent();
        int withdrawDollars = withdrawAmount.getDollar();

        int newCents = this.accountBalance.getCent() - withdrawCents;
        int newDollar = this.accountBalance.getDollar() - withdrawDollars;
        if (newCents < 0) {
            newCents += 100;
            newDollar -= 1;
        }

            return new Account(this.firstName, this.lastName, new Amount(newDollar, newCents));
    }

    /**
     * Returns the current balance.
     * @return accountBalance
     */
    public Amount getAccountBalance() {
        return accountBalance;
    }
}
