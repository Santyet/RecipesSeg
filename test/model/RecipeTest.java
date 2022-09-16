package model;

import exceptions.IngredientDoesntExistException;
import model.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe;


    public void setupStage1() {
        recipe = new Recipe("buebito con bacon", 323);
    }

    public void setupStage2() {
        recipe = new Recipe("receta", 131);
        recipe.addIngredient("cebolla", 15);
        recipe.addIngredient("ajo", 58);
        recipe.addIngredient("arroz", 520);
    }

    @Test
    public void addIngredientTest(){
        setupStage1();
        recipe.addIngredient("Sal", 12);

        assertEquals("Sal", recipe.getIngredient("Sal"));
        assertEquals(12, recipe.getIngredients().get(0).getWeight());
        assertEquals(1, recipe.getIngredients().size());
    }

    @Test
    public void addIngredientsTest2(){
        setupStage2();

        recipe.addIngredient("Pimienta", 6);
        assertEquals("Pimienta", recipe.getIngredient("Pimienta"));
        assertEquals(6, recipe.getIngredients().get(3).getWeight());
        assertEquals(3, recipe.getIngredientPos("Pimienta"));
        assertEquals(4, recipe.getIngredients().size());

    }

    @Test
    public void addIngredientTest3(){
        setupStage2();

        recipe.addIngredient("ajo", 21);
        assertEquals(3, recipe.getIngredients().size());
        assertEquals(79, recipe.getIngredients().get(1).getWeight());
    }

    @Test
    public void removeIngredientTest(){
        setupStage2();

        recipe.removeIngredient("ajo");

        assertEquals(2, recipe.getIngredients().size());
        assertEquals(null, recipe.getIngredient("ajo"));
        assertEquals("cebolla", recipe.getIngredient("cebolla"));
        assertEquals("arroz", recipe.getIngredient("arroz"));
    }
    //vielen dank

}