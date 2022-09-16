package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<Ingredient> ingredients;

    public Recipe(String n, double w) {
        ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(String n, double w) {

        Ingredient searched = null;
        for (int i = 0; i < ingredients.size() && searched == null; i++) {
            Ingredient current = ingredients.get(i);
            if (current.getName().equals(n)) {
                searched = current;
            }
        }

        if (searched != null) {
            searched.addWeight(w);
        } else {
            Ingredient newIngredient = new Ingredient(n, w);
            ingredients.add(newIngredient);
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getIngredient(String in) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().equals(in)) {
                return ingredients.get(i).getName();
            }
        }
        return null;
    }

    public int getIngredientPos(String in){

        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().equals(in)) {
                return i;
            }
        }
        return -1;
    }

    public void removeIngredient(String in){

        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().equals(in)) {
                ingredients.remove(i);
            }
        }
    }
}
