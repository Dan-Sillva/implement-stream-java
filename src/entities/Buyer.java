package entities;

import enumEntities.Cities;

public class Buyer {

    private String name;
    private String address;
    private double totalPurchased;
    private Cities city;

    public Buyer(String name, String address, double totalPurchased, Cities city) {
        this.name = name;
        this.address = address;
        this.totalPurchased = totalPurchased;
        this.city = city;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalPurchased() {
        return totalPurchased;
    }

    public Cities getCity() {
        return city;
    }

    @Override
    public String toString(){
        return "[name : "+this.name+"][address : "+this.address+"][total-purchased : "+this.totalPurchased+"][city : "+this.city+"]";
    }

}
