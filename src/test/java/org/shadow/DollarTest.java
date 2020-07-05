package org.shadow;



//import junit.framework.Assert;
import org.junit.Test;

import  org.junit.Assert;


/**
 * Unit test for simple App.
 */
public class DollarTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiplication()
    {
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));

        Assert.assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

//    @Test
//    public void testEqualityFranc() {
//    }

    @Test
    public void testFrancMultiplication()
    {
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }
}
