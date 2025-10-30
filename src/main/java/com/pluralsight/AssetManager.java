package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Main Residence", "2021-10-30", 1_500_000, "101 50th Street", 3, 1500, 3000));
        assets.add(new House("Lake House", "2022-11-01", 800_000, "222 Lake Avenue", 5, 800, 2000));
        assets.add(new Vehicle("My Car", "2020-06-05", 30_000, "Mercedes-Benz R350", 2008, 150_000));
        assets.add(new Vehicle("Other Car", "2024-01-30", 70_000, "Audi S4", 2023, 20_000));



    }
}
