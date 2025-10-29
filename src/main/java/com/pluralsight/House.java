package com.pluralsight;

public class House extends Asset {
    protected String address;
    protected int condition;
    protected int squareFoot;
    protected int lotSize;

    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = 0;
        switch (condition) {
            case 4:
                value = 180.00 * getSquareFoot();
                break;

            case 3:
                value = 130.00 * getSquareFoot();
                break;

            case 2:
                value = 90.00 * getSquareFoot();
                break;

            case 1:
                value = 80.00 * getSquareFoot();
                break;
        }

        value += .25 * getLotSize();

        return value;
    }
}
