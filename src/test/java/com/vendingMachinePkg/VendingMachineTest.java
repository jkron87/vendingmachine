package com.vendingMachinePkg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private static final double DELTA = 1e-15;

    @Test
    public void doesNickelHaveAWeight() {
        assertEquals(5.0d, Coin.NICKEL.getWeight(), DELTA);
    }


}