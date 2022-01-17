package Problem3;

public class Amount {
    private int dollar, cent;


    /**
     * Constructor that creates a new Amount object with specified dollar and cent.
     * @param dollar - dollar of Amount object.
     * @param cent - cent of Amount object.
     */
    public Amount(int dollar, int cent) {
        if (dollar < 0) {
            this.dollar = 0;
        } else {
            this.dollar = dollar;
        }
        if (cent < 0 || cent > 99) {
            this.cent = 0;
        } else {
            this.cent = cent;
        }
    }

    /**
     *Returns the dollar of the Amount.
     * @return the dollar of the Amount.
     */
    public int getDollar() {
        return this.dollar;
    }

    /**
     *Returns the cent of the Amount.
     * @return cent of the Amount.
     */

    public int getCent(){
        return this.cent;
    }
}
