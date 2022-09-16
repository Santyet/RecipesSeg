package exceptions;

public class IngredientDoesntExistException extends RuntimeException{

    public IngredientDoesntExistException(){
        System.out.println("El ingrediente no existe.");
    }
}
