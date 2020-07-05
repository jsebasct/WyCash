package org.shadow;

public abstract class Money {

    protected String currency;
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return this.currency;
    }
}
