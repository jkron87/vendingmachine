package com.currency;

public class InsertedCoin {
    private double weight;
    private double diameter;
    private double width;

    public InsertedCoin(double weight, double diameter, double width) {
        this.weight = weight;
        this.diameter = diameter;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
