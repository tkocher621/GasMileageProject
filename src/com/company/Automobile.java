package com.company;

public class Automobile {

    double mpg;
    double gallons = 0;

    public void fillUp(double amount)
    {
        gallons += amount;
    }

    public void takeTrip(double milesDriven)
    {
        gallons -= milesDriven/mpg;
    }

    public double reportFuel()
    {
        return gallons;
    }

    public Automobile(int gasMileage)
    {
        mpg = gasMileage;
    }

}
