package com.vendingMachinePkg;

public enum Coin {
    NICKEL(5.0d, 21.21d, 1.95d), DIME(2.27d, 17.91d, 1.35d), QUARTER(5.67d, 24.26d, 1.75d);

    private double weight;
    private double diameter;
    private double width;



    Coin(double weight, double diameter, double width) {

        this.weight = weight;
        this.diameter = diameter;
        this.width = width;

    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {

        return weight;
    }

    public double getDiameter() {
        return diameter;
    }

}
