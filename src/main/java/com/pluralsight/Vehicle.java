package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle extends Asset {

    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int yearNow = LocalDateTime.now().getYear();
        int howOld = yearNow - this.getYear();

        double currentCost = this.getOriginalCost();
        switch (howOld) {
            case 0, 1, 2, 3:
                currentCost = currentCost * Math.pow(.97, howOld);
                break;
            case 4, 5, 6:
                currentCost = currentCost * Math.pow(.94, howOld);
                break;
            case 7, 8, 9, 10:
                currentCost = currentCost * Math.pow(.92, howOld);
                break;
            default:
                currentCost = 1000.00;
        }

        if (!this.makeModel.toLowerCase().contains("honda") && !this.makeModel.toLowerCase().contains("toyota") && this.getOdometer() > 100_000) {
            currentCost *= .75;
        }

        return currentCost;
    }
}
