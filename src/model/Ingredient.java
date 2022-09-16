package model;

import exceptions.NegativeWeightException;

public class Ingredient {
    private String name;
    private double weight;

    public Ingredient(String n, double w) throws NegativeWeightException {
        name = n;
        if(w<=0){
            throw new NegativeWeightException();
        }
        weight = w;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void addWeight(double additionalW) {

        if(additionalW<=0){
            throw new NegativeWeightException();
        }
        weight = weight + additionalW;
    }

    public void removeWeight(double removeW){

        if(removeW<=0){
            throw new NegativeWeightException();
        }
        weight = weight - removeW;
    }

}
