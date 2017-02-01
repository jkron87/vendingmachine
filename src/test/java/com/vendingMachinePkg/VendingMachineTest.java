package com.vendingMachinePkg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private static final double DELTA = 1e-15;

    @Test
    public void doesNickelExist() {

        assertEquals(5.0d, Coin.NICKEL.getWeight(), DELTA);
        assertEquals(21.21d, Coin.NICKEL.getDiameter(), DELTA);
        assertEquals(1.95d, Coin.NICKEL.getWidth(), DELTA);
    }

    @Test
    public void doesDimeExist() {

        assertEquals(2.27d, Coin.DIME.getWeight(), DELTA);
        assertEquals(17.91d, Coin.DIME.getDiameter(), DELTA);
        assertEquals(1.35d, Coin.DIME.getWidth(), DELTA);
    }

    @Test
    public void doesQuarterExist() {

        assertEquals(5.67d, Coin.QUARTER.getWeight(), DELTA);
        assertEquals(24.26d, Coin.QUARTER.getDiameter(), DELTA);
        assertEquals(1.75d, Coin.QUARTER.getWidth(), DELTA);
    }


}