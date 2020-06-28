package org.shadow;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Franc)) return false;
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(amount);
//    }
}
