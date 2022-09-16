package model;

import exceptions.NegativeWeightException;
import model.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    Ingredient ingredient;

    //test status
    public void setupStage1(){
         ingredient = new Ingredient("Tomate", 245);
    }

    @Test
    public void addWeightTest(){
        setupStage1();
        ingredient = new Ingredient("cebolla", 54);
        ingredient.addWeight(245);

        assertEquals(299, ingredient.getWeight());
    }

    @Test
    public void negativeWeightCaseTest(){
        setupStage1();

        try{
            ingredient.addWeight(-100);
        }catch (NegativeWeightException ex){
            ex.printStackTrace();
        }
        assertEquals(245, ingredient.getWeight());

    }

    @Test
    public void removeWeightTest(){
        setupStage1();

        ingredient.removeWeight(45);

        assertEquals(200, ingredient.getWeight());
    }

    @Test
    public void NegativeRemoveWeightTest(){

        setupStage1();

        try{
            ingredient.removeWeight(-100);
        }catch (NegativeWeightException ex){
            ex.printStackTrace();
        }
        assertEquals(245, ingredient.getWeight());
    }
}