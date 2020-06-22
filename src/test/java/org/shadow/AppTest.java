package org.shadow;



//import junit.framework.Assert;
import org.junit.Test;

import  org.junit.Assert;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        five.times(2);

        Assert.assertEquals(10, five.amount);
    }
}
