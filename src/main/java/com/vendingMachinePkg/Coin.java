package com.vendingMachinePkg;

/**
 * Created by jenniferkron on 1/31/17.
 */
public enum Coin {
    NICKEL(5.0d);

    private double weight;

    Coin(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
