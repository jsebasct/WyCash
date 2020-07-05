package org.shadow;

public class Dollar extends Money {


    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }



//    @Override
//    public int hashCode() {
//        return Objects.hash(amount);
//    }
}
