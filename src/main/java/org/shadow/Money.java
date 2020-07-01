package org.shadow;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Dollar)) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }
}
